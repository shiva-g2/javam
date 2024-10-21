import java.util.*;
class Overload{
    void Area(int l, int b){
        float area;
        area = l * b;
        System.out.println("The area of rectangle is: " + area);
    }
    void Area(double bs, double h){
        double area;
        area = 0.5*bs*h;
        System.out.println("The area of triangle is: " + area);
    }
    void Area(int r){
        double area;
        area = (3.14*r*r);
        System.out.println("The area of circle is: " + area);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the base of triangle: ");
        double bs = sc.nextDouble();
        System.out.print("Enter the height of triangle: ");
        double h = sc.nextDouble();
        System.out.print("Enter the radius of circle: ");
        int r = sc.nextInt();
        Overload obj = new Overload();
        obj.Area(l,b);
        obj.Area(bs,h);
        obj.Area(r);        
    }    
}
