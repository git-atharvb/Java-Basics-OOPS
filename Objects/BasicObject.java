package BasicJavaPrograms.Objects;
// Example of Pen Class
class Pen{
    String color;
    String type;
     public void write(){
        System.out.println("Writing with " + this.color + " " + this.type);
     }
     public void printColor(){
        System.out.println(this.color);
     }
}
public class BasicObject{
    public static void main (String args[]){
    Pen pen1 = new Pen();
    System.out.println();
    pen1.color = "Blue";
    pen1.type = "Gel Pen";
    pen1.write();
    pen1.printColor();
    Pen pen2 = new Pen();
    pen2.color = "Black";
    pen2.type = "Ball Pen";
    pen2.write();
    pen2.printColor();
    }
}