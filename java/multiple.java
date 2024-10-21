interface A
{
  void execute1();
}
interface B
{
  void execute2();
}
class c implements A,B
{
  public void execute1()
  {
    System.out.println("Haii.. T am from execute1");
  }
  public void execute2()
  {
    System.out.println("Haii.. T am from execute2");
  }
}
public class multiple
{
  public static void main(String args[])
  {
    c obj =new c();
    obj.execute1();
    obj.execute2();
  }
}
