package uppercase.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MathInterface extends Remote {
    double toFarenhite(double cel) throws RemoteException;
    double toCelsius(double far) throws RemoteException;
    double aveGrade(double points, double grade) throws RemoteException;
    double quadSolver (double a, double b, double c) throws RemoteException;
}
