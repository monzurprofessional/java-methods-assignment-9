import java.util.Scanner;
public class ev1 {
    public static void main(String[]args){
       //A
        boolean resultA = isTriangle(7,5,10);
        System.out.println( resultA);

        //B
        triArea(7,5,10);
    }

    //A
    public static boolean isTriangle(int a,int b,int c){
        boolean flag = false;
        if(a+b>c && b+c>a && c+a>b){
            flag =true;
        }
        return flag;
    }

    //B
    public static void triArea(int a, int b, int c){
        if(isTriangle(a,b,c)==true){
            double s =(a + b + c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
        else{
            System.out.println("Can’t form triangle");
        }
    }


}

