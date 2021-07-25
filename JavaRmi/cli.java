import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class cli{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
int a=sc.nextInt();
System.out.println("Enter the second number");
int b=sc.nextInt();
try{
inter stub=(inter)Naming.lookup("rmi://localhost:5000/sumeer");
System.out.println("Product=");
System.out.println(stub.mul(a,b));

}catch(Exception e){System.out.println( e);}
}

}
