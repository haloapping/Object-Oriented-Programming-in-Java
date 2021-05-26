public class Cat extends Animal {
    public Cat(String name, String gender, int weight) {
        super(name, gender, weight);
    }

    @Override
    void talk() {
        System.out.println("Meow... Meow...");
    }

    @Override
    void walk() {
        System.out.println("Walk");
    }
}
