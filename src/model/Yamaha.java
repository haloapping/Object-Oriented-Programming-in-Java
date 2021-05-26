package model;

public class Yamaha extends Guitar {
    public Yamaha(String name, int price, String size) {
        super(name, price, size);
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar("A", 1_200_000, "Medium");

        System.out.println("Name:" + guitar.getName());
    }
}
