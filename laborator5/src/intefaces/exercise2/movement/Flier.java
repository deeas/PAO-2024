package intefaces.exercise2.movement;

public interface Flier extends BaseMovement {

    default void move() {
        System.out.println("I can fly!");
    }
}
