package module08._03overriding;

public class CrazyGretter extends Greeter {
    
    public String greet(){
        return "Oh we've been watching you for a while now";
    }

    public String greet(String who){
        return "AHHHHH " + who;
    }
}
