package uppercase.server;

import uppercase.shared.MathInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import static java.lang.Math.*;

public class MathServerImpl implements MathInterface{

    public MathServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public double toFarenhite(double cel) throws RemoteException {
        return (cel*9/5)+32;
    }

    @Override
    public double toCelsius(double far) throws RemoteException {
        return (far-32)*5/9;
    }

    @Override
    public double aveGrade(double points, double grade) throws RemoteException {
        return points/grade;
    }

    @Override
    public double quadSolver(double a, double b, double c) throws RemoteException {
        if(sqrt(pow(b, 2) - 4*a*c) == 0)
        {
            return -b/(2*a);
        } else {
            double root1, root2;
            root1 = (-b + sqrt(pow(b, 2) - 4*a*c)) / (2*a);
            root2 = (-b - sqrt(pow(b, 2) - 4*a*c)) / (2*a);
            return max(root1, root2);
        }
    }
}
