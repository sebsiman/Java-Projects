package creatingRectangles;

public class Point {
    private int x;
    private int y;

    // constructors
    public Point(int X, int Y) {
        x = X;
        y = Y;
    }
    
    public Point () {
        
    }

    // getters / setters / toString
    public int getX() {
        return x;
    }

    public void setX(int X) {
        x = X;
    }

    public int getY() {
        return y;
    }

    public void setY(int Y) {
        y = Y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}

