package BasicJavaPrograms.Inheritance;
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class EquilateralTriangle {
    public void area(int l){
        System.out.println(0.433*l*l);
    }
}
public class SingleInherit {
    public static void main(String[] args) {
        
    }
}
