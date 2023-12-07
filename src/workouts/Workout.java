package workouts;

public abstract class Workout {
    private final String name;
    private final int goal;
    private int progress;

    public Workout(String name, int goal) {
        this.name = name;
        this.goal = goal;
        this.progress = 0;
    }

    public String getName() {
        return name;
    }

    public int getGoal() {
        return goal;
    }
    public int getProgress() {
        return progress;
    }

    public void addProgress(int step) {
        if (step > 0) {
            progress += step;
        }
    }

    public abstract String getUnits();
}
