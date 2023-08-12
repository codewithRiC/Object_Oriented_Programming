import java.util.*;
class Add{
    private String Plot_add;
    public int Plot_pin;
    protected String Plot_dist;
    private String Plot_state;
    public void Plot_info(){
        System.out.println("Enter the plot address");
        Scanner sc=new Scanner(System.in);
        Plot_add= sc.nextLine();
        System.out.println("Enter the plot pin");
        Plot_pin=sc.nextInt();
        System.out.println("Enter the plot dist");
        Plot_dist=sc.nextLine();
        System.out.println("Enter the plot state");
        Plot_state=sc.nextLine();
        sc.close();
    }
    public void Plot_show(){
        System.out.println("Plot add="+Plot_add);
        System.out.println("Plot dist="+Plot_dist);
        System.out.println("Plot pin="+Plot_pin);
        System.out.println("Plot state="+Plot_state);
    }
}
class Emp extends Add{
    private String Emp_name;
    protected int Emp_id;
    public String Emp_desg;
    Add A=new Add();
    public void Emp_info(){
        System.out.println("Enter the emplyoee name");
        Scanner sc=new Scanner(System.in);
        Emp_name=sc.nextLine();
        System.out.println("Enter the emp id");;
        Emp_id=sc.nextInt();
        System.out.println("Enter the emp desg");
        Emp_desg=sc.nextLine();
        A.Plot_info();
        sc.close();
    }
    public void Emp_show(){
        System.out.println("Emp name="+Emp_name);
        System.out.println("Emp id="+Emp_id);
        System.out.println("Emp desg="+Emp_desg);
        A.Plot_show();
    }
}
class simpleexample{
    public static void main(String args[]){
        Emp B=new Emp();
        B.Emp_info();
        B.Emp_show();
    }
  
}


