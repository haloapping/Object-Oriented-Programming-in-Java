public class Table implements Foldable, Material {
    private String size;

    public Table(String size) {
        this.size = size;
    }

    @Override
    public boolean isFoldable() {
        return false;
    }

    @Override
    public String setMaterial(String material) {
        return material;
    }

    @Override
    public void setHeight(int height) {
        Material.super.setHeight(height);
    }

    public void toString(String material, int height) {
        System.out.printf("Material is %s and height is %s", material, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table table = (Table) o;

        return size != null ? size.equals(table.size) : table.size == null;
    }

//    @Override
//    public int hashCode() {
//        return size != null ? size.hashCode() : 0;
//    }
}
