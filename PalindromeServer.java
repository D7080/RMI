import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class PalindromeServer extends UnicastRemoteObject implements PalindromeInterface{
PalindromeServer() throws RemoteException{
super();
}
public boolean isPalindrome(String str) throws RemoteException{
StringBuffer sb= new StringBuffer(str);
String reversed= sb.reverse().toString();
return str.equalsIgnoreCase(reversed);
}
public static void main(String args[]){
try {
PalindromeServer obj= new PalindromeServer();
LocateRegistry.createRegistry(1099);
Naming.rebind("PalindromeService",obj);
System.out.println("Palindrome Server is ready...");
} catch (Exception e) {
System.out.println(e);
}
}
}
