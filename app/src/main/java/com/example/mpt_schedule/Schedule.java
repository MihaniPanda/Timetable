package com.example.mpt_schedule;

public class Schedule {
    public String build;
    public String dayOfWeek;
    public String[] lessons;

    public Schedule() {
    }

    public Schedule(String build, String dayOfWeek, String[] lessons) {
        this.build = build;
        this.dayOfWeek = dayOfWeek;
        this.lessons = lessons;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }
}
