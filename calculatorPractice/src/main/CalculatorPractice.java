package main;

import javax.swing.JOptionPane;

public class CalculatorPractice {

      public static void main(String[] args) 
      {
       int num1, num2;
       int result = 0;
       String operator;
       char op;
       
       num1 = Integer.parseInt(JOptionPane.showInputDialog("1st Num: "));
       operator = JOptionPane.showInputDialog("Operator: ");
       op = operator.charAt(0);
       num2 = Integer.parseInt(JOptionPane.showInputDialog("2nd Num: "));
       
       switch (op)
       {
           case '+': result = num1 + num2; break;
           case '-': result = num1 - num2; break;
           case '*': result = num1 * num2; break;
           default: result = num1 / num2;
       }
       System.out.println("The result is: "+result);
       
    }
    
}
