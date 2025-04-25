class Cylinder {
    private int radius;
    private int height;

    Cylinder() {
        System.out.println("I am a constructor of Class cylinder.....");
    }


    public int getRad() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

}

public class Exercise_on_constructor {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();

    }
}