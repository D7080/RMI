import java.rmi.*;
import java.util.*;
public class PalindromeClient{
public static void main(String args[]){
try {
PalindromeInterface obj= (PalindromeInterface) Naming.lookup("rmi://localhost/PalindromeService");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String:");
String input= sc.nextLine();
boolean result= obj.isPalindrome(input);
if(result)
System.out.println("The String is Palindrome");
else
System.out.println("The String is not Palindrome");
} catch (Exception e) {
System.out.println(e);
}
}
}
