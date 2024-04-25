/*
A) Write a method called isPrime which takes an integer in its parameter to check whether a number is prime or not.
If the number is prime then the method returns boolean true otherwise it returns boolean false.

B) Write a method called isPerfect which takes an integer in its parameter to check whether a number is perfect or not.
 If the number is perfect then the method returns boolean true otherwise it returns boolean false.

C) Write a method called special_sum that calculates the sum of all numbers that are either prime numbers or perfect up till the
integer value given in its parameter. This integer value must be taken as user input and passed into the method.
*Sample Input:8; Sample Output: 23*
explaination: Between 1 to 8 the Prime numbers are 2,3,5,7 and 6 is a Perfect number. So, the summation is 2+3+5+7+6=23.


 */
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A
        boolean check = isPrime(18);
        System.out.println(check);
        //B
         check = isPerfect(496);
        System.out.println(check);
        //C
        System.out.println(special_sum(sc.nextInt()));
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //B starts from here
    public static boolean isPerfect(int n){
        int sum =0;
        if(n<=0){
            return false;
        }
        for (int i = 1; i <n ; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    public static int special_sum(int n){
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if(isPrime(i) || isPerfect(i)){
                sum+=i;
            }
        }
        return sum;
    }

}