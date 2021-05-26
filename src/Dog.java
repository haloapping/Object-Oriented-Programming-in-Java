public class Dog extends Animal {
    public Dog(String name, String gender, int weight) {
        super(name, gender, weight);
    }

    void talk() {
        System.out.println("Guguk... Guguk...");
    }

    @Override
    void walk() {
        System.out.println("Walk");
    }
}
