public class Main{
    public static void main(String[] args) {

        Animals a=new Dog();
        a.name="Maddie";

        Animals[] animals=new Animals[3];
        animals[0]=new Dog();
        animals[1]=new Cat();
        animals[2]=new Goat();



        Dog dog=new Dog();
        dog.name="Bailey";
        dog.speak();
        dog.fetch("stick");

        Cat cat=new Cat();
        cat.name="Goose";
        cat.speak();
        cat.sleep();

        Goat goat=new Goat();
        goat.name="Bubbles";
        goat.speak();
    }
}