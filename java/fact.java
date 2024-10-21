package fact;
public class fact
{
 public void cal(int n)
 	{
  	 int f = 1;
  	 for(int i=1;i<=n;i++)
  		{
  		 f = f*i;
  		}
  	 System.out.println("Factorial is:" +f);
  	}
}
   
