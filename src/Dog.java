public class Dog extends Animals{

    @Override
    public void speak(){
        System.out.println(name+" says woof!");
    }

    public void fetch(String item){
        System.out.println(name+" retrieved the "+item);
    }
}
