package workouts;

public class PushupWorkout extends Workout{
    public PushupWorkout(int goal) {
        super("подтягивание", goal);
    }

    @Override
    public String getUnits() {
        return "раз";
    }
}
