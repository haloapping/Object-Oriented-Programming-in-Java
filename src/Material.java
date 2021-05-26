public interface Material {
    public String setMaterial(String material);

    default void setHeight(int height) {
        System.out.println("Height: " + height);
    }
}
