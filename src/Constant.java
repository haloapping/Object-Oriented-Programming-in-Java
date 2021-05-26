public class Constant {
    public static final float PHI = 3.14F;

    public static float circleArea(float r) {
        return PHI * r * r;
    }

    public static class Shape {
        private String shape;

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }
    }
}
