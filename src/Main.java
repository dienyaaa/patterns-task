import factories.WorkoutFactory;
import models.User;
import observers.ProgressUserObserver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Денис");
        WorkoutFactory workoutFactory = new WorkoutFactory();
        ProgressUserObserver progressUserObserver = new ProgressUserObserver();

        System.out.println("-----Add observer-----");
        user.addObserver(progressUserObserver);

        System.out.println("-----Running workout-----");
        user.setWorkout(workoutFactory.createRunningWorkout(1000));
        user.addProgress(500);
        user.addProgress(650);

        System.out.println("-----Push-up workout-----");
        user.setWorkout(workoutFactory.createPushupWorkout(15));
        user.addProgress(10);
        user.addProgress(5);

        System.out.println("-----Remove observer-----");
        user.removeObserver(progressUserObserver);
    }
}
