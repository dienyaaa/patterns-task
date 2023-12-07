package factories;

import workouts.PushupWorkout;
import workouts.RunningWorkout;
import workouts.Workout;

public class WorkoutFactory {
    public Workout createRunningWorkout(int goal) {
        return new RunningWorkout(goal);
    }
    public Workout createPushupWorkout(int goal) {
        return new PushupWorkout(goal);
    }
}
