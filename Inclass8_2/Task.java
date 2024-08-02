package Inclass8_2;

class Task {
    String taskName;
    Task next;

    public Task(String taskName) {
        this.taskName = taskName;
        this.next = null;
    }
}
