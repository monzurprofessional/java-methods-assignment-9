public class cw2 {
    public static void main(String[] args) {
        //A
        double area = circleArea(5);
        System.out.println(area);

        //B
        double volume = sphereVolume(5);
        System.out.println(volume);

        //C
        findSpace(10,"circle");
    }
    //A
    public static double circleArea(int r){
        return 3.1416*r*r;
    }

    //B
    public static double sphereVolume(int r){
        return 1.33*3.1416*r*r*r;
    }

    //C
    public static void findSpace(int r, String s){
        if(s.equals("circle")){
            double output= circleArea(r/2); // r is the diameter here, so r/2 is the radius
            System.out.println(output);
        }
        else if(s.equals("sphere")){
            double output = sphereVolume(r/2);
            System.out.println(output);
        }
        else {
            System.out.println("wrong parameter");
        }
    }

}
