import java.util.*;
class A{
    private int att1;
    private int att2;
    public void fun1(){
        System.out.println("Enter the attr 1");
        Scanner sc=new Scanner(System.in);
        att1=sc.nextInt();
        System.out.println("Enter the attr 2");
        att2=sc.nextInt();
        //sc.close();
    }
    public void fun2(){
        System.out.println("hii frnds"+" "+att1);
        System.out.println("Byee frnds"+" "+att2);

    }
    A()
    {
        System.out.println("new world");

    }
}
    class B extends A{
        int att1=10;
        int att2=100;
        public void fun3(){
            System.out.println(att1);
            System.out.println(att2);
        }
    }

    class simple1{
        public static void main(String args[]){
            B b=new B();
            b.fun3();
            b.fun1();
            b.fun2();
        }
    }
