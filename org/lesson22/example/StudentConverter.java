package com.proftelran.org.lesson22.example;

public class StudentConverter implements Converter<Student, StudentDto>{
    @Override
    public StudentDto toDto(Student person) {
        return null;
    }

    @Override
    public Student toObject(StudentDto personDto) {
        return null;
    }
}
