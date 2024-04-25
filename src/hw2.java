/*
A. Write a simple method called showDots that takes a number as an argument and then prints that amount of dots inside the method.
Sample Method Call : showDots(5) , Sample Output: .....

B. Write a method called show_palindrome that takes a number as an argument and then prints a palindrome inside the method.
Sample Method Call : show_palindrome(5) , Sample Output: 123454321

C. Write a method called showDiamond that takes an integer number as an argument and then prints a palindromic diamond shape.
 Moreover, the empty spaces surrounding the diamonds are filled with dots(.) .
Sample Method Call : showDiamond(5) ,
Sample Output:
....1....
...121...
..12321..
.1234321.
123454321
.1234321.
..12321..
...121...
....1....
 */
public class hw2 {
    public static void main(String[] args) {
        showDots(3);
        System.out.println();
        show_palindrome(1);
        System.out.println();
        showDiamond(9);
    }
    public static void showDots(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(".");
        }
    }
    public static void show_palindrome(int n){
        for (int i = 1; i <=n; i++) {
            System.out.print(i);

        }
        for (int i = n-1; i >0; i--) {
            System.out.print(i);
        }

    }
    public static void showDiamond(int n){
        for (int i = 1; i <=n; i++) {
            showDots(n-i);
            show_palindrome(i);
            showDots(n-i);
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            showDots(n-i);
            show_palindrome(i);
            showDots(n-i);
            System.out.println();
        }
    }
}
