package Lab5_Michael_Zhao;

class Task {
    String taskName;
    Task next;

    public Task(String taskName) {
        this.taskName = taskName;
        this.next = null;
    }
}
