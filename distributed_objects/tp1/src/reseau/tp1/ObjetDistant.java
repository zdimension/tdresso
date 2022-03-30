package reseau.tp1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ObjetDistant extends UnicastRemoteObject implements Distante
{
    public ObjetDistant(int numport) throws RemoteException
    {
        super(numport);
    }

    @Override
    public void echo() throws RemoteException
    {
        System.out.println("echo called");
    }

    @Override
    public String hello() throws RemoteException, InterruptedException
    {
        Thread.sleep(5000);
        return "Hello";
    }

    public static void main(String[] args) throws RemoteException
    {
        var reg = LocateRegistry.getRegistry(2001);

        Distante d = new ObjetDistant(10001);

        reg.rebind("MonOD",d);
    }
}
