package com.example.reminder.remotedeadline.model;

public class Task {
    private String taskName;
    private String dueDateUtc;
    private String assignedUser;
    private String timezone;

    public Task(String taskName, String dueDateUtc, String assignedUser, String timezone) {
        this.taskName = taskName;
        this.dueDateUtc = dueDateUtc;
        this.assignedUser = assignedUser;
        this.timezone = timezone;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDueDateUtc() {
        return dueDateUtc;
    }

    public String getAssignedUser() {
        return assignedUser;
    }

    public String getTimezone() {
        return timezone;
    }
}
