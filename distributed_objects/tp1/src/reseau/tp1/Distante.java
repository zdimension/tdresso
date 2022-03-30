package reseau.tp1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Distante extends Remote
{
    void echo() throws RemoteException;

    String hello() throws RemoteException, InterruptedException;
}
