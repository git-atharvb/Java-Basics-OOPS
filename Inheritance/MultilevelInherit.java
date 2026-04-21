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
public class MultilevelInherit {
    public static void main(String[] args) {
        
    }
}
