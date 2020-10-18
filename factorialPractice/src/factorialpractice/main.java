package factorialpractice;

import javax.swing.JOptionPane;

public class main {


    public static void main(String[] args) 
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("What is n: "));
        int fact = 1;
        
        for(int i = 1; i <= n; i++)
            fact = fact * i;
        
        System.out.println("The Factorial of n is: "+fact);
        
    }
    
}
