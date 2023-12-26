public class Task {
    private String taskName;
    private boolean isCompleted;

    // Constructor
    public Task(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }

    // Mark the task as completed
    public void markAsComplete() {
        this.isCompleted = true;
    }

    // Getters
    public String getTaskName() {
        return taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // For displaying task information
    
    public String toString() {
        return "Task: " + taskName + " - Completed: " + isCompleted;
    }
}
