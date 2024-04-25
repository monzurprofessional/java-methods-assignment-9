/*
A. Write a method called calcTax that takes 2 arguments which are your age then your salary. The method must calculate and return the tax as per the following conditions:
● No tax if you are less than 18 years old.
● No tax if you get paid less than 10,000
● 7% tax if you get paid between 10K and 20K
● 14% tax if you get paid more than 20K

B. Write a method called calcYearlyTax that takes no arguments. Inside the method it should take first input as your age and then 12 other inputs as income of each month of
the year. The method must calculate and print Tax for each month and finally print the total Tax of the whole year based on the HW-3A conditions.
Note: You must call the method written in task HW-3A, otherwise this task would be considered invalid.


 */
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        //calcTax(20,18000);
        double t = calcTax(20,18000);
        System.out.println(t);
        calcYearlyTax();
    }
    public static double calcTax(int age, int sal){
        if(age<18 || sal<10000){
            return 0.0;
        }
        else if(sal >= 10000 && sal <= 20000){
            return sal*0.07;
        }
        else{
            return sal*0.14;
        }
    }
    public static void calcYearlyTax(){
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        double tax =0.0;
        for (int i = 1; i <=12 ; i++) {
            int income = sc.nextInt();
            double monthlytax = calcTax(age,income);
            System.out.println("Month: " +i+ " tax: " +monthlytax);
            tax+=monthlytax;
        }
        System.out.println("Total Yearly Tax: " + tax);
    }

}
