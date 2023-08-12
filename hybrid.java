class A{
    private int att1=5;
    protected int att2=10;
    public int att3=15;
    public void met1(){
        System.out.println("This is method 1");
        System.out.println(att1);
    }
    // private void met2(){
    //     System.out.println("This is method 2");
    //     System.out.println(att2);
    // } 
    protected void met3(){
        System.out.println("This is method 3");
        System.out.println(att3);
    }   
    A(){
        System.out.println("constructor A");
    }
}
class B extends A{
    private int att4=20;
    protected int att5=25;
    public int att6=30;
    public void met4(){
        System.out.println("This is method 4");
        System.out.println(att4);
    }
    // private void met5(){
    //     System.out.println("This is method 5");
    //     System.out.println(att5);
    // } 
    protected void met6(){
        System.out.println("This is method 6");
        System.out.println(att6);
    }
    B(){
        System.out.println("constructor B");
    }   
}
class C extends B{
    private int att7=35;
    protected int att8=40;
    public int att9=45;
    public void met7(){
        System.out.println("This is method 7");
        System.out.println(att7);
    }
    // private void met8(){
    //     System.out.println("This is method 8");
    //     System.out.println(att8);
    // } 
    protected void met9(){
        System.out.println("This is method 9");
        System.out.println(att9);
    }   
    C(){
       System.out.println("constructor C");
    }
}
interface D{
    
    
    void met10();
}
interface E{
  

   void met11();
 
}
class F extends C implements D,E{
   private int att10=50;
   protected int att11=55;
   public int att12=60;
   public void met10(){
       System.out.println("This is method 10");
       System.out.println("from D");
   }
   public void met11(){
       System.out.println("This is method 11");
       System.out.println("From E");
   }
   public void met12(){
       System.out.println("This is method 12");
       System.out.println(att10);
   }
//    private void met13(){
//        System.out.println("This is method 13");
//        System.out.println(att11);
//    } 
   protected void met14(){
       System.out.println("This is method 14");
       System.out.println(att12);
   }   
   F(){
      System.out.println("constructor F");
   }
}
class hybrid{
    public static void main(String args[]){
    C c=new C();
    F f=new F();
    c.met1();
   // c.met2();
    c.met3();
    c.met4();
    //c.met5();
    c.met6();
    c.met7();
    //c.met8();
    c.met9();
    f.met1();
    //f.met2();
    f.met3();
    f.met4();
    //f.met5();
    f.met6();
    f.met7();
    //f.met8();
    f.met9();
    f.met10();
    f.met11();
    f.met12();
    //f.met13();
    f.met14();
    }
}