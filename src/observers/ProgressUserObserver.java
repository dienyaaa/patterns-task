package observers;

import models.User;
import workouts.Workout;

public class ProgressUserObserver implements UserObserver {
    @Override
    public void notify(User user) {
        Workout workout = user.getWorkout();
        int progress = workout.getProgress();
        int goal = workout.getGoal();
        String workoutName = workout.getName();
        String units = workout.getUnits();

        if (progress >= goal) {
            System.out.println(user.getName() + " достиг своей цели! " +
                    workoutName + " - " + progress + "/" + goal + " " + units);
        } else {
            System.out.println(user.getName() + " добился прогресса в достижении своей цели - " +
                    workoutName + " - " + progress + "/" + goal + " " + units);
        }
    }
}
