package github.io.haloppaing.constructor;

public class Student {
    String id;
    String firstname;
    String lastname;
    String gender;
    String religion;

    Student(String idParam, String firstnameParam, String lastnameParam, String genderParam, String religionParam) {
        id        = idParam;
        firstname = firstnameParam;
        lastname  = lastnameParam;
        gender    = genderParam;
        religion  = religionParam;
    }
}
