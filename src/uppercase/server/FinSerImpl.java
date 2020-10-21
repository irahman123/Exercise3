package uppercase.server;

import uppercase.shared.FinInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import static java.lang.Math.*;

public class FinSerImpl implements FinInterface {

    public FinSerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }


    @Override
    public double loanPayment(double loan, int month, double interest) throws RemoteException {
        return (loan*interest) /
                (1- pow(1+interest, -month));

    }

    @Override
    public double pension(double salary, int years) throws RemoteException {
        return (salary * .12) / (1 - pow(1 + .12, -(years*12)));
    }

    @Override
    public double savInterest(double save, int years, double interest) throws RemoteException {
        return save*(1+interest/12*years)*(12*years);
    }
}
