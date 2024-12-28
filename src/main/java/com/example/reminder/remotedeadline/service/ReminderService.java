package com.example.reminder.remotedeadline.service;

import com.example.reminder.remotedeadline.model.Task;
import com.example.reminder.remotedeadline.utils.TimezoneConverter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReminderService {

    public List<String> getReminders() {
        List<Task> tasks = getMockTasks();
        List<String> reminders = new ArrayList<>();

        for (Task task : tasks) {
            String localTime = TimezoneConverter.convertToLocalTime(task.getDueDateUtc(), task.getTimezone());
            reminders.add("Reminder for " + task.getAssignedUser() + ": Task '" + task.getTaskName() +
                    "' is due at " + localTime + " (" + task.getTimezone() + ").");
        }

        return reminders;
    }

    private List<Task> getMockTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Prepare Report", "2024-01-01T12:00:00Z", "John", "America/New_York"));
        tasks.add(new Task("Submit Proposal", "2024-01-02T18:00:00Z", "Alice", "Asia/Kolkata"));
        return tasks;
    }
}
