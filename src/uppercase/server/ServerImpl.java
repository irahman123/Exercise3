package uppercase.server;

import uppercase.shared.FinInterface;
import uppercase.shared.MathInterface;
import uppercase.shared.ServeInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl implements ServeInterface {
    public ServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }
    @Override
    public MathInterface getFarenhite() throws RemoteException {
        return new MathServerImpl();
    }

    @Override
    public MathInterface getCelsious() throws RemoteException {
        return new MathServerImpl();
    }

    @Override
    public MathInterface getAvarageGrade() throws RemoteException {
        return new MathServerImpl();
    }

    @Override
    public MathInterface getQuadSolver() throws RemoteException {
        return new MathServerImpl();
    }

    @Override
    public FinInterface getloanPayment() throws RemoteException {
        return new FinSerImpl();
    }

    @Override
    public FinInterface getPension() throws RemoteException {
        return new FinSerImpl();
    }

    @Override
    public FinInterface getSavings() throws RemoteException {
        return new FinSerImpl();
    }
}
