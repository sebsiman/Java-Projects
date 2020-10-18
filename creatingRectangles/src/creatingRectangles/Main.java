/*
Sebastian Siman
Professor Martinez
Assignment #1
COP 2800 Spring 2020
*/
package creatingRectangles;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        double greatestArea = 0;
        
        Rectangle r1 = new Rectangle();
        r1.createPoints(0, 2, 2, 0);
        double a1 = r1.calculateArea(r1.getUpperLeft(), r1.getBottomRight());
        greatestArea = a1;
        System.out.println("Area of r1: "+a1);
        
        Rectangle r2 = new Rectangle();
        r2.createPoints(0, 4, 4, 0);
        double a2 = r2.calculateArea(r2.getUpperLeft(), r2.getBottomRight());
        System.out.println("Area of r2: "+a2);
        if (a2 > greatestArea)
            greatestArea = a2;
        
        Rectangle r3 = new Rectangle();
        r3.createPoints(0, 8, 8, 0);
        double a3 = r3.calculateArea(r3.getUpperLeft(), r3.getBottomRight());
        System.out.println("Area of r3: "+a3);
        if (a3 > greatestArea)
            greatestArea = a3;
        
        System.out.println("The greatest area of the rectangles is: "+greatestArea);
        
    }
    
}
