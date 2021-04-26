package PetClasses;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog("Buster", 72);
        dog.move();
        dog.speak();
        System.out.println(dog.toString());

        Snake snake = new Snake("LongBoi", 3);
        snake.move();
        snake.speak();
        System.out.println(snake.toString());

        Cat cat = new Cat("Maui", 13);
        cat.move();
        cat.speak();
        System.out.println(cat.toString());
    }
}
