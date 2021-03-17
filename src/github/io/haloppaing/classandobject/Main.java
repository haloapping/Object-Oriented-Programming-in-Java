package github.io.haloppaing.classandobject;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.id        = "1117041";
        student.firstname = "Alfiyanto";
        student.lastname  = "Kondolele";
        student.gender    = "Male";
        student.religion  = "Christian";

        System.out.println("ID        : " + student.id);
        System.out.println("Firstname : " + student.firstname);
        System.out.println("Lastname  : " + student.lastname);
        System.out.println("Gender    : " + student.gender);
        System.out.println("Religion  : " + student.religion);
    }
}
