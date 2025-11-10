import java.rmi.*;
public interface PalindromeInterface extends Remote{
public boolean isPalindrome(String str) throws RemoteException;
}
