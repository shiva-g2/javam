import java.util.*;
class Student{
   String name;
   String result = "";
   int id,total_marks;
   float percent;
   void get(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the name of the student: ");
      name = sc.nextLine();
      System.out.print("Enter student id: ");
      id = sc.nextInt();
      System.out.print("Enter the marks scored by " + name + " out of 500 :");
      total_marks = sc.nextInt();
   }
   void calculate(){
      percent = total_marks / 5;
   }
   void compare(){
      if(percent < 35){
         result += "Fail"; 
      }
      else if(percent >= 35 && percent < 60){
         result += "Second Class";   
      }
      else if(percent >= 60 && percent < 75){
         result += "First Class";  
      }
      else if(percent >= 75 && percent <= 100){
         result += "Distinction Class";  
      }
      else{
         System.out.println("Invalid");
      }
   }
   void display(){
      System.out.println();
      System.out.println();
      System.out.println("Name of the student : " + name);
      System.out.println("Student ID : " + id);
      System.out.println("Total marks scored by " + name + " : " + total_marks);
      System.out.println("Percentage of " + name + " : " + percent);  
      System.out.println("Result of " + name + " : " + result);
   }
   public static void main(String[] args){
      Student obj = new Student();
      obj.get();
      obj.calculate();
      obj.compare();
      obj.display();
   }
}
