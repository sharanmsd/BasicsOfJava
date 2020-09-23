// Boxing, Unboxin, Autoboxing and Autounboxing

public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        Integer iref=new Integer(n); // Boxing
        int k=iref.intValue();  // Unboxing
        Integer kref=n;  // AutoBoxing
        int x=kref;  // AutoUnBoxing
    }
    
}

// String

public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s=new String("Hello");
        StringBuilder builder=new StringBuilder("Hello");
        StringBuffer buffer=new StringBuffer("Hello");
        s.concat("IPL");
        System.out.println(s);
    }
    
}


// RUNTIME POLYMORPHISM USING INTERFACE 

interface Shape
{
    void draw();
}
class Rectangle implements Shape
{
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}
class Triangle implements Shape
{
    public void draw()
    {
        System.out.println("Drawing a Triangle");
    }
}
class Circle implements Shape
{
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Shape s=new Shape();
//        s.draw();
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Triangle();
        s.draw();
        s=new Circle();
        s.draw();
    }
    
}

// PARENT TO CHILDREN => ABSTRACT CLASS
// POLICE TO PUBLIC => INTERFACE
// RUNTIME POLYMORPHISM USING ABSTRACT CLASS

package javaapplication5;

/**
 *
 * @author sharan karthick
 */
abstract class Shape
{
    abstract public void draw();
}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}
class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a Triangle");
    }
}
class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Shape s=new Shape();
//        s.draw();
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Triangle();
        s.draw();
        s=new Circle();
        s.draw();
    }
    
}
