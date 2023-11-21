package com.proftelran.org.lessontwelve;

public class Course {
    private String name;
    private int hours;

    public Course(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}
