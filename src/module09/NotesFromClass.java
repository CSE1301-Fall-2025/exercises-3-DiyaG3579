package module09;

public class NotesFromClass implements Animal{

    private int lifeSpan;

    public NotesFromClass(){
        this.lifeSpan = 10;
    }
    //@Override
    public void eat(){
        System.out.println("Some are herbivores, some are carnivores.");
    }

    //@Override
    public void sleep(){
        System.out.println("Common sleep behavior is quiescense");
    }

    public int getLifeSpan(){
        return lifeSpan;
    }
    public static void main(String [] args){
        Animal a1 = new NotesFromClass();
        a1.eat();
    }
}
