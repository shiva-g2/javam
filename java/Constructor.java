import java.util.*;
public class Constructor
{
 Constructor(int a, int b)
 		{
 		 int sum = a+b;
 		 System.out.println("Sum is:" +sum);
 		}
 Constructor(float a, float b)
 		{
 		 float sum = a+b;
 		 System.out.println("Sum is:" +sum);
 		}
 Constructor(int a, float b)
 		{
 		 float sum = a+b;
 		 System.out.println("Sum is:" +sum);
 		}
 Constructor(float a, int b)
 		{
 		 float sum = a+b;
 		 System.out.println("Sum is" +sum);
 		}
 Constructor(int a, int b, int c)
 		{
 		 int sum = a+b+c;
 		 System.out.println("Sum is:" +sum);
 		}
 Constructor(float a, float b, float c)
 		{
 		 float sum = a+b+c;
 		 System.out.println("Sum is:" +sum);
 		}
 public static void main(String[]args){
 Constructor obj1 = new Constructor(1,2);
 Constructor obj2 = new Constructor(1.4f,2.6f);
 Constructor obj3 = new Constructor(4,3.1f);
 Constructor obj4 = new Constructor(1.9f,2);
 Constructor obj5 = new Constructor(1,2,3);
 Constructor obj6 = new Constructor(4.2f,3.3f,5.6f);
 }
 }
