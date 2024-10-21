import java.util.*;
class arms
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a value of n:");
  int n = sc.nextInt();
  int sum = 0;
  int temp, r;
  temp = n;
  while(n>0){
             r = n % 10;
             sum = sum + (r*r*r);
             n = n / 10;
            }
  if(sum == temp){
  		  System.out.println("It is an Armstrong number");
  		 }
  else{
       System.out.println("It is not an Armstrong number");
      }
 }
}
