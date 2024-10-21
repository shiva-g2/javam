import java.util.*;
public class string{

    public static void main(String[] args) {
    
        String str = "Java is object oriented programming";
        System.out.println("String length = " + str.length());

        String str1 = "Java";
        String str2 = "Programming";
	String str3 = "INHERITANCE";
	
        System.out.println("\nString Concatenation 1: " + (str1 + str2));
        System.out.println("String Concatenation 2: " + str1.concat(str2));

        System.out.println("\nCompareTo Result: " + str1.compareTo(str2));
        System.out.println("CompareTo Result: " + str2.compareTo(str1));

        System.out.println("\nIndex of 'o' is " + str.indexOf('o'));

        System.out.println("\nUppercase of string 1: " + str1.toUpperCase());
        System.out.println("Lowercase of string 3: " + str3.toLowerCase());
    }
}
