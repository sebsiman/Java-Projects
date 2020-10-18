package calendar;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) 
    {
        boolean isLeapYear = false, isLeapYear2 = false;
        int numOfDays = 0, numOfDays2 = 0;
        
        int currYear = Integer.parseInt(JOptionPane.showInputDialog("What is the current year?:")); //get user input on date
        int currMonth = Integer.parseInt(JOptionPane.showInputDialog("What is the current month?:"));
        int currDay = Integer.parseInt(JOptionPane.showInputDialog("What is the current day?:"));
        //JOptionPane.showMessageDialog(null, "The current date is: "+currMonth+"/"+currDay+"/"+currYear);
        
        if(currYear % 4 == 0) //checking if the year is a leap year
        {
            isLeapYear = true;
        }
        else if(currYear % 100 == 0)
        {
            isLeapYear = false;
        }
        else
        {
            isLeapYear = false;
        }
        //System.out.println(isLeapYear); //testing
        
        switch(currMonth) //switch to determine the number of days in the current month
        {
            case 1:
                numOfDays = 31;
                break;
            case 2:
                if(isLeapYear == true)
                    numOfDays = 29;
                else
                    numOfDays = 28;
                break;
            case 3:
                numOfDays = 31;
                break;
            case 4:
                numOfDays = 30;
                break;
            case 5:
                numOfDays = 31;
                break;
            case 6:
                numOfDays = 30;
                break;
            case 7:
                numOfDays = 31;
                break;
            case 8:
                numOfDays = 31;
                break;
            case 9:
                numOfDays = 30;
                break;
            case 10:
                numOfDays = 31;
                break;
            case 11:
                numOfDays = 30;
                break;
            case 12:
                numOfDays = 31;
                break;

        }
        //System.out.println(numOfDays);
        
        int futureYear = Integer.parseInt(JOptionPane.showInputDialog("What is the desired year?:"));
        int futureMonth = Integer.parseInt(JOptionPane.showInputDialog("What is the desired month?:"));
        int futureDay = Integer.parseInt(JOptionPane.showInputDialog("What is the desired day?:"));
        //JOptionPane.showMessageDialog(null, "The desired date is: "+futureMonth+"/"+futureDay+"/"+futureYear);
        
        if(futureYear % 4 == 0)
            isLeapYear2 = true;
        else if(futureYear % 100 == 0)
            isLeapYear2 = false;
        else
            isLeapYear2 = false;
        
        switch(futureMonth)
        {
            case 1:
                numOfDays2 = 31;
                break;
            case 2:
                if(isLeapYear == true)
                {
                    numOfDays2 = 29;
                }
                else
                {
                    numOfDays2 = 28;
                }
                break;
            case 3:
                numOfDays2 = 31;
                break;
            case 4:
                numOfDays2 = 30;
                break;
            case 5:
                numOfDays2 = 31;
                break;
            case 6:
                numOfDays2 = 30;
                break;
            case 7:
                numOfDays2 = 31;
                break;
            case 8:
                numOfDays2 = 31;
                break;
            case 9:
                numOfDays2 = 30;
                break;
            case 10:
                numOfDays2 = 31;
                break;
            case 11:
                numOfDays2 = 30;
                break;
            case 12:
                numOfDays2 = 31;
                break;
        }
        //System.out.println(numOfDays2);
        
        int newYear = (futureYear - currYear) * 365;
        int newMonth = (futureMonth - currMonth) * 
        //int daysApart = ((futureYear - currYear) * 365) + ((numOfDays2 - futureDay) - (numOfDays - currDay));
        System.out.println(daysApart);
        
    }
    
}
