package com.proftelran.homework.homework18.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskThreeApp {
    public static void main(String[] args) {
        Student alex = new BackEndStudent("Alex", 3.5, false);
        Student maria = new BackEndStudent("Maria", 2.4, true);
        Student jane = new BackEndStudent("Jane", 4.6, false);
        Student igor = new BackEndStudent("Igor", 4.9, true);
        Student bob = new BackEndStudent("Bob", 5.0, true);

        Student oLeg = new FrontEndStudent("OLeg", 3.5, false);
        Student steve = new FrontEndStudent("Steve", 2.2, true);
        Student cLif = new FrontEndStudent("CLif", 4.6, true);
        Student john = new FrontEndStudent("John", 3.6, false);
        Student ryan = new FrontEndStudent("Ryan", 5.0, true);

        Student walter = new QAStudent("Walter", 4.5, true);
        Student kevin = new QAStudent("Kevin", 3.7, true);
        Student kate = new QAStudent("Kate", 3.8, false);
        Student susan = new QAStudent("Susan", 5.0, true);
        Student michael = new QAStudent("Michael", 5.0, true);

        List<Student> BAStudentList = Arrays.asList(alex, maria, jane, igor, bob);
        List<Student> FEStudentList = Arrays.asList(oLeg, steve, cLif, john, ryan);
        List<Student> QAStudentList = Arrays.asList(walter, kevin, kate, susan, michael);

        List<List<Student>> studentList = Arrays.asList(BAStudentList, FEStudentList, QAStudentList);

       List<Student> listOne = studentList.stream().flatMap(x -> x.stream()).filter(s -> s.getRate() >= 4.5)
                .filter(v -> v.isFinished() == true).filter(t -> t instanceof BackEndStudent)
               .peek(w -> w.setType(ClassType.BA))
               .map(x -> new ProjectStudent(x.getName(), x.getRate(), x.isFinished(), x.getType()))
               .peek(o -> System.out.println(o)).collect(Collectors.toList());

        List<ProjectStudent> listTwo = studentList.stream().flatMap(x -> x.stream()).filter(s -> s.getRate() >= 4.5)
                .filter(v -> v.isFinished() == true).filter(f -> f instanceof FrontEndStudent)
                .peek(w -> w.setType(ClassType.FE))
                .map(x -> new ProjectStudent(x.getName(), x.getRate(), x.isFinished(), x.getType()))
                .peek(o -> System.out.println(o)).collect(Collectors.toList());


        List<ProjectStudent> listThree = studentList.stream().flatMap(x -> x.stream()).filter(s -> s.getRate() >= 4.5)
                .filter(v -> v.isFinished() == true).filter(t -> t instanceof QAStudent)
               .peek(w -> w.setType(ClassType.QA))
               .map(x -> new ProjectStudent(x.getName(), x.getRate(), x.isFinished(), x.getType()))
              .peek(o -> System.out.println(o)).collect(Collectors.toList());

    }
}
