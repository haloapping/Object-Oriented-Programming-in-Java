package controller;

import model.Guitar;
import model.Yamaha;

public class GuitarController {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Yamaha", 3_000_000, "Medium");

        Yamaha yamaha = new Yamaha("Yamaha", 2_000_000, "Medium");
    }
}
