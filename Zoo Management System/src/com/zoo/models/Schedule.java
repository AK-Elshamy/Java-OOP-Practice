package com.zoo.models;

import java.time.LocalDateTime;

/**
 * Represents a schedule entry for zoo activities.
 */
public class Schedule {
    private int scheduleId;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    /**
     * Constructor to initialize a Schedule.
     *
     * @param scheduleId  The unique ID of the schedule.
     * @param description The description of the scheduled activity.
     * @param startTime   The start time of the scheduled activity.
     * @param endTime     The end time of the scheduled activity.
     */
    public Schedule(int scheduleId, String description, LocalDateTime startTime, LocalDateTime endTime) {
        this.scheduleId = scheduleId;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", description='" + description + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}