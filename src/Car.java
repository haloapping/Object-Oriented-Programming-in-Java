// Pengenalan Constructor
// Constructor adalah sebuah method yang akan selalu dipanggil pada saat sebuah objek dibuat

public class Car {
    String name;
    String brand;
    String year;

    Car(String paramName, String paramBrand, String paramYear) {
        name = paramName;
        brand = paramBrand;
        year = paramYear;
    }

    Car(String paramName, String paramBrand) {
        name = paramName;
        brand = paramBrand;
    }
}
