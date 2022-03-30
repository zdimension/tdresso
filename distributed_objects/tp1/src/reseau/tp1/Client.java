package reseau.tp1;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Client
{
    public static void main(String[] args) throws RemoteException, NotBoundException, InterruptedException
    {
        var reg = LocateRegistry.getRegistry(2001);

        Distante d = (Distante)reg.lookup("MonOD");

        System.out.println(d.hello());

        d.echo();
    }
}
