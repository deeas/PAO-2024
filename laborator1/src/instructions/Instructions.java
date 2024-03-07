package instructions;

public class Instructions {
    public static void main(String[] args) {

        /* if - else
         *
         * The if expression must be of type boolean.
         */
        if (1 < 2) {
            System.out.println("My math needs improving");
        } else {
            System.out.println("All is good");
        }

        /* switch
         *
         * checks if a value supplied in the switch matches any of the cases within. If it does, it moves the execution
         * to that point and starts running them until either the end of the switch is reached or a break instruction is
         * met. In the code example below, if someValue was 1, it would have printed out "something something else", as
         * the execution would have started at case 1 (it is empty) and would continue the instructions in the next cases
         * until it reached the break in case 3. if no case is matches, the default case is executed. if there is no
         * default case and there is no case that matches, no instructions in the switch are executed.
         */
        int someValue = 10;
        switch (someValue) {
            case 1:
            case 2:
                System.out.println("something");
            case 3:
                System.out.println("something else");
                break;
            case 4:
                System.out.println("yay");
                break;
            default:
                System.out.println("miss");
                break;
        }

        /* for
         *
         * Has 3 sections separated by a semicolon (;) and a body. Any of the 3 sections can be left empty. Upon execution,
         * it declares and initialises any variables in the first block (if multiple values are initialised, they are
         * separated by a comma (,)), checks the boolean condition in the second block (if any) and if true, executes the
         * body. At the end of each body execution, it runs the steps in the final section.
         */
        for (int i = 0, j = 4; i < 10 && j < 10; i++, j++) {
            System.out.println(i);
            System.out.println(j);
        }

        /* while
         *
         * checks if the boolean condition in the while is true. If so, it executes the body and goes to the start,
         * reevaluating the expression and rerunning if necessary.
         */
        int i = 0;
        while (i < 7) {
            i++;
            System.out.println("I am in while");
        }
        System.out.println("No while for me");

        /* do - while
         *
         * Similar to the while, the difference being that it first runs the body and evaluates the expression at the end.
         */
        do {
            i++;
            System.out.println(i);
        } while (i < 10);
    }
}
