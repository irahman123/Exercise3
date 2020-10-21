package uppercase.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServeInterface extends Remote {
    MathInterface getFarenhite() throws RemoteException;
    MathInterface getCelsious() throws RemoteException;
    MathInterface getAvarageGrade() throws RemoteException;
    MathInterface getQuadSolver() throws RemoteException;
    FinInterface getloanPayment() throws RemoteException;
    FinInterface getPension() throws RemoteException;
    FinInterface getSavings() throws RemoteException;



}
