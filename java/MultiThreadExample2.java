class MultiThreadExample2 implements Runnable
{
  public void run()
  {
    System.out.println("thread is running by implementing runnable interface...");
  }
  public static void main(String args[])
  {
    MultiThreadExample2 m1=new MultiThreadExample2();
    Thread t1=new Thread(m1);
    t1.start();
  }
}
