package P2;
import fact.*;
import java.util.*;
public class factorial
	{
	 public static void main(String[]args)
	 	{
	 	 Scanner sc = new Scanner(System.in);
	 	 System.out.print("Enter a number:");
	 	 int n = sc.nextInt();
	 	 fact obj = new fact();
	 	 obj.cal(n);
	 	}
	}
