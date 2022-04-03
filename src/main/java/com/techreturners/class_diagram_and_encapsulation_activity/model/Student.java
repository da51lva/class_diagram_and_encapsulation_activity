package com.techreturners.class_diagram_and_encapsulation_activity.model;

public class Student {

    private String name;
    private Grade grade;
    private Group group;
    private String secretNickName;

    public Student(String name, Grade grade, Group group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
        this.secretNickName = "MySecretNickName";
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void upgrade(){
        grade = grade.before();
    }

    public void downgrade(){
        grade = grade.next();
    }
}
