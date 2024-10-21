import java.util.*;
public class vector
{
public static void main(String args[])
{
Vector<String> vec = new Vector<String>();

vec.add("Volvo");
vec.add("BMW");
vec.add("Koenigsegg");
vec.addElement("Audi");
vec.addElement("Mitsubishi");
vec.addElement("Aston Martin");
System.out.println("Vector is: " +vec);

System.out.println("Size is: " +vec.size());

String r=vec.remove(2);
System.out.println("removed element :" +r);
System.out.println("Vector is: " +vec);

Boolean rem = vec.removeElement("BMW");
System.out.println("Element\t" +rem);
System.out.println("Vector" +vec);

vec.insertElementAt("Buggati" ,4);
System.out.println("Vector" +vec);

}
}
