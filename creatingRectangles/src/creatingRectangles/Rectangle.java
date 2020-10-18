package creatingRectangles;

public class Rectangle {
    private Point upperLeft;
    private Point bottomRight;
    public static int count = 0;

    // constructors
    public Rectangle(Point uL, Point bR) {
        upperLeft = uL;
        bottomRight = bR;
        count++;
    }
    
    // parameter-less constructor allowed for more flexibility within the program so I opted to use it over the computer generated one
    public Rectangle() {
        count++;
    }
    
    // allows the points for each rectangle to be created and assigned to 
    public void createPoints(int x, int y, int x2, int y2) {
        Point uL = new Point(x,y); 
        Point bR = new Point(x2,y2);
        upperLeft = uL;
        bottomRight = bR;
    }
    
    // method to get the X and Y values from each point and use them to calculate the area
    public double calculateArea(Point uL, Point bR) {
        int length = Math.abs(uL.getX() - bR.getX());
        int width = Math.abs(uL.getY() - bR.getY());
        double area = length * width;
        
        return area;
    }
    
    // getters / setters / toString
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
    
    
    
}