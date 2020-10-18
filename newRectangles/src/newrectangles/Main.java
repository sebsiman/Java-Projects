/*
Sebastian Siman
Professor Martinez
Assignment #1
COP 2800 Spring 2020
*/
package newrectangles;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("How many rectangles would you like to create?");
        int i = Integer.parseInt(input);
        
        Rectangle[] rect = new Rectangle[i];
        
        for (int x = 0; x <= i; ++x) {
            rect[x] = new Rectangle();
            Point p = new Point();
            Point p2 = new Point();
            rect[x].setPoints(p, p2);
            String input2 = JOptionPane.showInputDialog("Rectangle #"+(x+1)+" Upper Left X:");
            p.setX(Integer.parseInt(input2));
            String input3 = JOptionPane.showInputDialog("Rectangle #"+(x+1)+" Upper Left Y:");
            p.setY(Integer.parseInt(input3));
            String input4 = JOptionPane.showInputDialog("Rectangle #"+(x+1)+" Bottom Right X:");
            p2.setX(Integer.parseInt(input4));
            String input5 = JOptionPane.showInputDialog("Rectangle #"+(x+1)+" Bottom Right Y:");
            p2.setY(Integer.parseInt(input5));
        }

        rect[0].getBottomRight();
        rect[0].getUpperLeft();
        rect[1].getBottomRight();
        rect[1].getUpperLeft();
        rect[0].getBottomRight();
        rect[0].getUpperLeft();
        
    }
    
}
