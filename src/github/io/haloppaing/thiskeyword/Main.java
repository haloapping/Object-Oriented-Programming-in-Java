package github.io.haloppaing.thiskeyword;

import github.io.haloppaing.thiskeyword.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("1117041", "Alfiyanto", "Kondolele", "Male", "Christian");

        System.out.println("ID        : " + student.id);
        System.out.println("Firstname : " + student.firstname);
        System.out.println("Lastname  : " + student.lastname);
        System.out.println("Gender    : " + student.gender);
        System.out.println("Religion  : " + student.religion);
    }
}
