public class hw4 {
    public static void main(String[] args) {
        oneToN(1,5); // here, 5 is taken as a user input(N=5)
    }
    public static void oneToN(int start, int end){
        if(start>end){
            return ;  // here in recursion, return acts like break
        }
        System.out.print(start + " ");
        oneToN(start+1,end);

    }
}
