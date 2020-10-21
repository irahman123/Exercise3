package uppercase.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FinInterface extends Remote {
    double loanPayment(double loan, int month, double interest) throws RemoteException;
    double pension(double salary , int years) throws RemoteException;
    double savInterest(double save, int years, double interest) throws RemoteException;
}
