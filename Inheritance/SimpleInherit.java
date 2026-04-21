package BasicJavaPrograms.Inheritance;
class Shape{
    String color;
}
class Triangle extends Shape{
    
}
public class SimpleInherit {
    public static void main(String[] args) {
    Triangle t1 = new Triangle();
    t1.color = "Red";
    }
}