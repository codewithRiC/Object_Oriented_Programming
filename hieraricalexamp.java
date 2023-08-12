import java.util.Scanner;
class Shape{
    double l,b,r;
    Scanner sc=new Scanner(System.in);
    public void getrect(){
        System.out.println("Enter the length and breadth of rectangle:");
        l=sc.nextDouble();
        b=sc.nextFloat();
        System.out.println("The length of rectangle is "+l+" units");
        System.out.println("The breadth of rectangle is "+b+" units");
    }
    protected void getcirc(){
        System.out.println("Enter the radius of circle:");
        r=sc.nextFloat();
        System.out.println("The radius of the circle is "+r+" units");
    }
}
class Rectangle extends Shape{
    double area;
    void rectarea(){
        area=l*b;
        System.out.println("Area of rectangle is "+area+" units");
    }
}
class Circle extends Shape{
    double area1;
    void circarea(){
        area1=3.14*r*r;
        System.out.println("Area of circle is "+area1+" units"); 
    }
}

public class hieraricalexamp {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.getrect();
        obj1.rectarea();
        Circle obj2 = new Circle();
        obj2.getcirc();
        obj2.circarea();
    }
}

