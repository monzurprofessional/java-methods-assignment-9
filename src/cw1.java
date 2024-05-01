public class cw1 {
    public static void main(String[] args) {
        //A
        evenChecker(5);

        //B
        boolean resultA = isEven(5);
        System.out.println( resultA );

        //C
        boolean resultB = isPos(-5);
        System.out.println(resultB);

        //D
        sequence(10);

    }
    //A
    public static void evenChecker(int n){
        if(n%2==0){
            System.out.println("Even!!");
        }
        else {
            System.out.println("odd!!");
        }
    }
    //B
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    //C
    public static boolean isPos(int n){
        if(n>=0){
            return true;
        }
        else {
            return false;
        }
    }
    //D
    public static void sequence(int n){
        if(isPos(n)==true){
            for (int i = 0; i <=n; i++) {
                if(isEven(i)==true){
                    System.out.print(i + " ");
                }
            }
        }
        if(isPos(n)==false){
            for (int i = n; i <=-1; i++) {
                if(isEven(i)==false){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
