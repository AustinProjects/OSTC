package PetClasses;

public class Dog extends Pet {
    private int weight = 0;
    public Dog(String dogName, int dogWeight){
        super (dogName);
        weight=dogWeight;
    }


    public String toString(){
        return super.toString() + " is a dog, weighing " + weight + " pounds.";

    }

    public String speak(){
        return "woof";
    }

    public String move(){
        return "walk";

    }

}
