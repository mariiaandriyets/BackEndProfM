package com.proftelran.org.lesson12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStudentHashMap {
    public static void main(String[] args) {
        Map<Student, List<Course>> studentCoursesMap = new HashMap<>();
        Student alex = new Student("ALex", "Alexeev");
        Student maxim = new Student("Maxim", "Maximov");

        Course java = new Course("Java", 105);
        Course sql = new Course("SQL", 30);
        Course aLgo = new Course("ALgo", 30);

        List<Course> alexCourses = List.of(java, aLgo);
        List<Course> maximCourses = List.of(sql, aLgo);

        studentCoursesMap.put(alex, alexCourses);
        studentCoursesMap.put(maxim, maximCourses);

        printMap(studentCoursesMap);

        Student oleg = new Student("Oleg", "Olegov");

        alex.setSurname("Petrov");

        List<Course> courses = studentCoursesMap.get(alex);
        System.out.println("Courses for Alex by key = " + courses);
        System.out.println();
        printMap(studentCoursesMap);

        //containsKey - щпределяет есть ли такой ключ в мапе иль нет
        if (studentCoursesMap.containsKey(oleg)) {
        List<Course> coursesOleg = studentCoursesMap.get(oleg);
        System.out.println("Courses for Oleg by key = " + coursesOleg);
        System.out.println("Count of courser for Oleg " + coursesOleg.size());
        }

        StudentWithID studentWithID = new StudentWithID("Alex", "Alexeev", 1);
        StudentWithID studentWithID1 = new StudentWithID("Alex", "Alexeev", 2);


        System.out.println();
        Student newMaxim = new Student("Maxim", "Maximov");
        if(studentCoursesMap.containsKey(newMaxim)) {
            System.out.println("New Maxim exists in hash map");
        }
        List<Course> coursesForNewMaxim = studentCoursesMap.get(newMaxim);
        System.out.println("Courses for new Maxim = " + coursesForNewMaxim);

    }

    private static void printMap(Map<Student, List<Course>> studentCoursesMap) {
        studentCoursesMap.forEach((student, coursesList)-> {
            System.out.println("Courses for student " + student.getName() + " " +  student.getSurname());
            coursesList.forEach((course) ->{
                System.out.println("Course name " + course.getName() + " , hours " + course.getHours());
            });
            System.out.println();
        });
    }
}
