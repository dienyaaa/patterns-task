package workouts;

public class RunningWorkout extends Workout{
    public RunningWorkout(int goal) {
        super("бег", goal);
    }

    @Override
    public String getUnits() {
        return "м";
    }
}
