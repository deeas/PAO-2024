package inner_classes;

class OuterClass {
    private static String msg = "Message";

    //Static nested class
    public static class NestedStaticClass {
        public void printMessage()
        {
            System.out.println("Message from static nested class" + msg);
        }
    }

    public class InnerClass {
        public void display() {
            System.out.println("Message from non-static nested class: " + msg);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        OuterClass.NestedStaticClass staticClass = new OuterClass.NestedStaticClass();
        staticClass.printMessage();

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.display();
    }


}
