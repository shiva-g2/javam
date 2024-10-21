class MultiThreadExample extends Thread
{
  public void run()
  {
    System.out.println("thread is running by extending thread class");
  }
  public static void main(String args[])
  {
    MultiThreadExample t1=new MultiThreadExample();
    t1.start();
  }
}
