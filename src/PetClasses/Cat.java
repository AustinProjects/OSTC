package PetClasses;

public class Cat extends Pet {
    private int weight = 0;
    public Cat(String catName, int catWeight){
        super (catName);
        weight=catWeight;
    }


    public String toString(){
        return super.toString() + " is a cat, weighing " + weight + " pounds.";

    }

    public String speak(){
        return "meow";
    }

    public String move(){
        return "walk";

    }

}
