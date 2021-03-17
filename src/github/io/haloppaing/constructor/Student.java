package github.io.haloppaing.constructor;

public class Student {
    String id;
    String firstname;
    String lastname;
    String gender;
    String religion;

    Student(String id, String firstname, String lastname, String gender, String religion) {
        this.id        = id;
        this.firstname = firstname;
        this.lastname  = lastname;
        this.gender    = gender;
        this.religion  = religion;
    }
}
