import java.rmi.*;
import java.rmi.registry.*;

public class serv{

public static void main(String args[]){
try{

imp stub=new imp();//need to change inter 
Naming.rebind("rmi://localhost:5000/sumeer",stub);
System.out.println("Server ready");

}catch(Exception e){System.out.println(e);}
}

}
