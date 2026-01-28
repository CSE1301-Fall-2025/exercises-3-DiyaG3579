package module08._02constructors;

// 1. Make the class square inherit from Rectangle
public class Square extends Rectangle {
   private String type;

   //2. Add a Square constructor without an arguments
   public Square(){
      super();
      type = "$";
   }
   
   // 3. Add a Square constructor with 1 argument for a side
   public Square(int w, String typed){
      super(w, w);
      type = typed;
   }
     
   
   public static void main(String[] args){
      Rectangle r = new Rectangle(3,5);
      r.draw();
      // 4. Uncomment these to test
      Square s1 = new Square();
      s1.draw();
      System.out.println(s1.type);
      Square s = new Square(3, "O");
      s.draw();
      System.out.println(s.type);
   }
}
