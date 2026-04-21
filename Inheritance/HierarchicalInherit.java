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
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class HierarchicalInherit {
    public static void main(String[] args) {
        
    }
}
