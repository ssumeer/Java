import java.rmi.*;
import java.rmi.server.*;

public class imp extends UnicastRemoteObject implements inter{

imp()throws RemoteException{
super();
}

public int mul(int x,int y){return x*y;}

}
