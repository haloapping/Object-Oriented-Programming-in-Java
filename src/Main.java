public class Main {
    public static void main(String[] args) {
//        Animal animal = new Dog("Animal", "Male", 12);
//        System.out.println("Name   : " + animal.getName());
//        System.out.println("Gender : " + animal.getGender());
//        System.out.println("Weight : " + animal.getWeight());
//        animal.talk();
//
//        animal = new Dog("Cihuhua", "Male", 10);
//        System.out.println("\n" + "Name   : " + animal.getName());
//        System.out.println("Gender : " + animal.getGender());
//        System.out.println("Weight : " + animal.getWeight());
//        animal.talk();
//
//        animal = new Cat("Meowwww", "Male", 5);
//        System.out.println("\n" + "Name   : " + animal.getName());
//        System.out.println("Gender : " + animal.getGender());
//        System.out.println("Weight : " + animal.getWeight());
//        animal.talk();
//
//        Dog dog = new Dog("Dog 1", "Male", 4);
//        Cat cat = new Cat("Cat 1", "Female", 5);
//
//        animal.animalTalk(dog);
//        animal.animalTalk(cat);
//
//        Table table = new Table("Large");
//        System.out.println(table.isFoldable());
//        System.out.println(table.setMaterial("Steel"));
//        table.setHeight(12);
//
//        table.toString("Wood", 5);
//
//        Table firstTable = new Table("Medium");
//        Table secondTable = new Table("Large");
//
//        System.out.println();
//        System.out.println(firstTable.equals(secondTable));
//
//        System.out.println(firstTable.hashCode());
//        System.out.println(firstTable.hashCode());
//        System.out.println(firstTable.hashCode());
//        System.out.println(secondTable.hashCode());
//
//        Instagram instagram = new Instagram("Instagram", "Bokir", "2008");
//        System.out.println("Name       : " + instagram.getName());
//        System.out.println("Author     : " + instagram.getAuthor());
//        System.out.println("Since year : " + instagram.getSinceYear());
//
//        Company company = new Company();
//        company.setName("ABC");
//
//        Company.Employee employee = company.new Employee();
//        employee.setName("Apping");
//
//        System.out.println("Company name  : " + employee.getCompanyName());
//        System.out.println("Employee name : " + employee.getName());
//
//        Foldable foldable = new Foldable() {
//            @Override
//            public boolean isFoldable() {
//                return false;
//            }
//        };
//
//        System.out.println("Is foldable: " + foldable.isFoldable());
//        System.out.println("Is foldable: " + foldable.isFoldable());
//
//        System.out.println("PHI constant : " + Constant.PHI);
//        System.out.println("Circle area  : " + Constant.circleArea(12));
//
//        Constant.Shape shape = new Constant.Shape();
//        shape.setShape("Bulet");
//        System.out.println(shape.getShape());
//
//        System.out.println(Runtime.getRuntime().availableProcessors());
//
//        LoginRequest loginRequest = new LoginRequest("Apping", "Rahasia");
//        System.out.println(loginRequest.username());
//        System.out.println(loginRequest.password());

        LoginRequest loginRequest1 = new LoginRequest("Apping", "rahasia");

        try {
            ValidationUtil.validate(loginRequest1);
        } catch (ValidationException exception) {
            System.out.println("Pesan error: " + exception.getMessage());
        } finally {
            System.out.println("Program berhasil berjalan");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);

        System.out.println("Sukses");


    }
}
