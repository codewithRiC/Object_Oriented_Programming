interface A{
    
    
     void met1();
}
interface B {
   

    void met4();
  
}
class C implements A,B{
    private int att7=35;
    protected int att8=40;
    public int att9=45;
    public void met1(){
        System.out.println("This is method 1");
        System.out.println("from A");
    }
    public void met4(){
        System.out.println("This is method 4");
        System.out.println("From B");
    }
    public void met7(){
        System.out.println("This is method 7");
        System.out.println(att7);
    }
    protected void met9(){
        System.out.println("This is method 9");
        System.out.println(att9);
    }   
    C(){
       System.out.println("constructor C");
    }
}
class multiple{
    public static void main(String args[]){
    C c=new C();
    c.met1();
    //c.met2();
    //c.met3();
    c.met4();
    //c.met5();
    //c.met6();
    c.met7();
    //c.met8();
    c.met9();
    }
}