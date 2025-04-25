class Circle {
    private float rad, area, perm;

    void setRadius(float r) {
        rad = r;
    }

    void setArea(float a) {
        if (a == 22 * rad * rad / 7)
            area = a;
        else
            System.out.println("Warning : wrong area as per the radius.");
    }

    void setPerm(float p) {
        if (p == 2 * 22 * rad / 7)
            perm = p;
        else
            System.out.println("Warning : wrong perimeter as per the radius.");
    }

    float getRadius() {
        return rad;
    }

    float getArea() {
        return area;
    }

    float getPerm() {
        return perm;
    }
}

public class getter_setters {
    public static void main(String[] args) {
Circle cr = new Circle();
cr.setRadius(9.0f);
cr.setArea(254.5714285714219f);
cr.setPerm(56.57142857186f);
System.out.println("Area : "+cr.getArea()+"sq.cm");
System.out.println("Perimeter : "+ cr.getPerm()+" cm");
	}
}