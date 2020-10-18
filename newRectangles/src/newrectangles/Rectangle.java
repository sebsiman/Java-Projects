package newrectangles;

public class Rectangle 
{
    private Point upperLeft;
    private Point bottomRight;
    private double area;
    private static int count = 0;

    // creating own default constructor
    public Rectangle(){
        
    }

    public Rectangle(Point uL, Point bR, double a) {
        upperLeft = uL;
        bottomRight = bR;
        area = a;
        count++;
    }
    
    public void setPoints (Point p, Point p2) {
        upperLeft = p;
        bottomRight = p2;
    }
    
    /*public void createPoints () {
        Point p = new Point();
        Point p2 = new Point();
    }*/
    
    
    public void calculateArea(Point p, Point p2) {
        // calculates the area of the created rectangle
        int length = p.getX() - p2.getX();
        int width = p.getY() - p2.getY();
        area = width * length;
    }

    // getters and setters
    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point uL) {
        upperLeft = uL;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bR) {
        bottomRight = bR;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double a) {
        area = a;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int c) {
        count = c;
    }
    
    
}
