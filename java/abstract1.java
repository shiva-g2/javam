abstract class sunstar
{
  abstract void display();
}
class Employee extends sunstar
{
  void display()
  {
    System.out.println("Emp Id: 1021");
    System.out.println("Name: Shivam");
    System.out.println("Desig: developer");
  }
}
class abstract1
{
  public static void main(String args[])
  {
    sunstar obj = new Employee();
    obj.display();
  }
}
