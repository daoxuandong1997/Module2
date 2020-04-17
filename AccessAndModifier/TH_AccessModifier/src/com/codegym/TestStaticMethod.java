package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        student.change();

        student s1 = new student(111, "Hoang");
        student s2 = new student(222, "Khanh");
        student s3 = new student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
