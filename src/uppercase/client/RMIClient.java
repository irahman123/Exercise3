package uppercase.client;

import uppercase.server.FinSerImpl;
import uppercase.server.MathServerImpl;
import uppercase.shared.FinInterface;
import uppercase.shared.MathInterface;
import uppercase.shared.ServeInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    private ServeInterface server;

    private FinInterface finServer1, finServer2, finServer3;
    private MathInterface mathServer1, mathServer2, mathServer3, mathServer4;


    public RMIClient() { }

    public void startClient() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        server = (ServeInterface) registry.lookup("Server");
         mathServer1 = server.getFarenhite();
         mathServer2 = server.getCelsious();
         mathServer3 = server.getAvarageGrade();
         mathServer4 = server.getQuadSolver();
        finServer1 = server.getloanPayment();
        finServer2 = server.getPension();
        finServer3 = server.getSavings();

    }

    public double toFarenhite(double argument){
        try {
            return mathServer1.toFarenhite(argument);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("could not contact server");
        }
    }
    public double toCelsius(double argument){
        try {
            return mathServer2.toCelsius(argument);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("could not contact server");
        }
    }
    public double aveGrade(double points, double grade){
        try {
            return mathServer3.aveGrade(points, grade);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("could not contact server");
        }
    }
    public double quadSolver(double a, double b, double c){
        try {
            return mathServer4.quadSolver(a,b,c);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("could not contact server");
        }
    }
    public double loanPayment(double loan, int month, double interest){
        try {
            return finServer1.loanPayment(loan, month, interest);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("could not contact server");
        }
    }
    public double pension(double salary, int years){
        try {
            return finServer2.pension(salary, years);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("could not contact server");
        }
    }
    public double savInterest(double save, int years, double interest){
        try {
            return finServer3.savInterest(save, years, interest);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("could not contact server");
        }
    }

}
