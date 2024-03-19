package statics;

public class PlayWithStatics1 {

    //static variable
    private static int x = 10;
    private static int y;

    private static Integer z;

    private static int a = m1();

    private int m;


    /**
     * Used for initialising static vars
     * This block gets executed when the class is loaded in memory
     */
    static {
        System.out.println("Static block initialized.");
        y = x * 4;
    }

    private static int m1() {
        System.out.println("from m1");
        return 20;
    }

    private int m2(){
        x++;
        return x;
    }

    public PlayWithStatics1() {
        System.out.println("PlayWithStatics");
    }
    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        z = 8;
        System.out.println(z);

        System.out.println("Value pf a: " + a);

        PlayWithStatics1 playWithStatics1 = new PlayWithStatics1();
        PlayWithStatics1 playWithStatics2 = new PlayWithStatics1();
        System.out.println(playWithStatics1.m2());
        System.out.println(playWithStatics2.m2());
    }

}