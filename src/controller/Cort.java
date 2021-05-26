package controller;

import model.Guitar;

public class Cort {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Cort Guitar", 1_200_000, "Medium");

        System.out.println("Name:" + guitar.getName());
    }
}