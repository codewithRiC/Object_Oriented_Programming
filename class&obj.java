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
class Main{
    public static void main(String[] args){
        A a=new A();
        a.met1();
        //a.met2();
        a.met3();

    }
}