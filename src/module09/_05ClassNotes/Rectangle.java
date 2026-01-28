package module09._05ClassNotes;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }



    public double area(){
        double area = length * width;
        return area; 
    }


    public double perimeter(){
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    public static void main(String [] args){
        Shape s1 = new Rectangle(20.0, 10.0);
        System.out.println("Area: " + s1.area());
        System.out.println("Perimeter: " + s1.perimeter());
    }
}
