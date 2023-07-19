import java.util.Scanner;
interface Area{
    final double pi=3.141;
    void area();
    void perimeter();
}
class Circle implements Area{
    double r;
    Circle(double radius){
        this.r=radius;
    }
    public void area(){
        System.out.println("area of circle is "+pi*r*r);

    }
    public void perimeter(){
        System.out.println("perimeter is "+2*pi*r);
    }

}
class Rectangle implements Area{
    double l,b;
    Rectangle(double l, double b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("area of rectangle is "+this.l*this.b);
    }

    public void perimeter(){
        System.out.println("perimeter of retacngle is "+2*(l+b));
    }
}

public class Co3_06 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r,b,l;
        int opt;

        while(true){
            System.out.println("cicle and rectangle");
            System.out.println("1. circle");
            System.out.println("2. rectangle");
            System.out.println("0. exit");
            opt=sc.nextInt();
            switch(opt){
                case 1 : 
                        System.out.println("enter the radius of circle");
                        r=sc.nextDouble();
                        Area obj=new Circle(r);
                        obj.area();
                        obj.perimeter();
                        break;

                case 2 : 
                        System.out.println("enter the length and breadth of rectangle ");
                        b=sc.nextDouble();
                        l=sc.nextDouble();
                        Area obj1 = new Rectangle(l, b);
                        obj1.area();
                        obj1.perimeter();
                        break;
                
                case 0 : System.exit(0);
                default : System.out.println("invalid option");
                            break;
            }


        }
    }
}
