package PetClasses;

public class Snake extends Pet{
    private int length = 0;
    public Snake(String snakeName, int snakeLength) {
        super (snakeName);
        length = snakeLength;
    }

    public String toString() {
        return super.toString() + " is a snake, with the length of " + length + " feet";
    }

    public String speak() {
        return "hiss";
    }

    public String move() {
        return "walk";
    }
}
