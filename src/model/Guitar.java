package model;

public class Guitar {
    protected String name;
    protected int price;
    protected String size;

    public Guitar(String name, int price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    protected int getPrice() {
        return price;
    }

    protected String getSize() {
        return size;
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar("Cort", 1_000_000, "Medium");
        System.out.println("Name  : " + guitar.name);
        System.out.println("Price : " + guitar.price);
        System.out.println("Size  : " + guitar.size);
    }
}
