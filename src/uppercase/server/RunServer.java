package uppercase.server;

import uppercase.shared.FinInterface;
import uppercase.shared.MathInterface;
import uppercase.shared.ServeInterface;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunServer {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        ServeInterface server = new ServerImpl();
        Registry registry= LocateRegistry.createRegistry(1099);
        registry.bind("Server", server);

        System.out.println("Server Started ");
    }

}
