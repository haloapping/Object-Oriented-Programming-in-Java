public abstract class Animal {
    private String name;
    private String gender;
    private int weight;
    private boolean fourFoot;

    public Animal(String name, String gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public boolean isFourFoot() {
        return fourFoot;
    }

    public void setFourFoot(boolean fourFoot) {
        this.fourFoot = fourFoot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void talk() {
        System.out.println("Animal");
    }

    void animalTalk(Animal animal) {
        if (animal instanceof Dog) {
            Animal dog = (Dog) animal;
            System.out.println("Dog");
        } else {
            Animal cat = (Cat) animal;
            System.out.println("Cat");
        }
    }

    abstract void walk();
}
