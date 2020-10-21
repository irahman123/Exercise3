package uppercase.client;

import com.sun.security.jgss.GSSUtil;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        RMIClient client = new RMIClient();
        client.startClient();

    Scanner in = new Scanner(System.in);
    while(true) {
        System.out.println("Please Input \n" +
                "1 for Celsious to Farehite \n" +
                "2 for farenhite to Celsious \n" +
                "3 for Avarage Grade \n" +
                "4 for Quad Solver \n"+
                "5 for Loan Repayment \n"+
                "6 for Pension \n"+
                "7 for Saving compound interest");
        String line = in.nextLine();
        if (line.equalsIgnoreCase("exit")) break;


        try {if(line.equalsIgnoreCase("1")){
            System.out.println("Enter Celsious Temperature");
            String cel = in.nextLine();
            double result = 0;
            try {
                result = client.toFarenhite(Double.valueOf(cel));
            } catch (NumberFormatException e) {
                System.out.println("Error: "+e.getMessage());
            }
            System.out.format("Farenhite is : %.2f\n", result);//String.format("%.2f", input)) System.out.format("Farenhite is : %.2f", result);
        }
            if(line.equalsIgnoreCase("2")){
                System.out.println("Enter Farenhite Temperature");
                String far = in.nextLine();
                double result = 0;
                try {
                    result = client.toCelsius(Double.valueOf(far));
                } catch (NumberFormatException e) {
                    System.out.println("Error: "+e.getMessage());
                }
                System.out.format("Celsious is : %.2f\n", result);
            }
            if(line.equalsIgnoreCase("3")){
                System.out.println("Enter course Point");
                String p = in.nextLine();
                System.out.println("Enter Grade");
                String g = in.nextLine();
                double result = 0;
                try {
                    result = client.aveGrade(Double.valueOf(p), Double.valueOf(g));
                } catch (NumberFormatException e) {
                    System.out.println("Error: "+e.getMessage());
                }
                System.out.format("Avarage grade is : %.2f\n", result);
            }
            if(line.equalsIgnoreCase("4")){
                System.out.println("Enter value of a");
                String a = in.nextLine();
                System.out.println("Enter value of b");
                String b = in.nextLine();
                System.out.println("Enter value of c");
                String c = in.nextLine();
                double result = 0;
                try {
                    result = client.quadSolver(Double.valueOf(a), Double.valueOf(b), Double.valueOf(c));
                } catch (NumberFormatException e) {
                    System.out.println("Error: "+e.getMessage());
                }
                System.out.format("Quad Solution is : %.2f\n", result);
            }
            if(line.equalsIgnoreCase("5")){
                System.out.print("Enter Loan Amount: ");
                String l = in.nextLine();
                System.out.print("Enter total month: ");
                String m = in.nextLine();
                System.out.print("Enter total Interest: ");
                String i = in.nextLine();

                double result = 0;
                try {
                    result = client.loanPayment(Double.valueOf(l), Integer.parseInt(m), Double.valueOf(i));
                } catch (NumberFormatException e) {
                    System.out.println("Error: "+e.getMessage());
                }
                System.out.format("Payment/month is : %.2f\n", result);
            }
            if(line.equalsIgnoreCase("6")){
                System.out.print("Enter Salary");
                String s = in.nextLine();
                System.out.print("Enter SErvice Years");
                String y = in.nextLine();
                double result = 0;
                try {
                    result = client.pension(Double.valueOf(s), Integer.parseInt(y));
                } catch (NumberFormatException e) {
                    System.out.println("Error: "+e.getMessage());
                }
                System.out.format("Pension is : %.2f\n", result);
            }
            if(line.equalsIgnoreCase("7")){
                System.out.println("Enter Saving Amount");
                String s = in.nextLine();
                System.out.println("Enter Years");
                String y = in.nextLine();
                System.out.println("Enter Interest");
                String i = in.nextLine();
                double result = 0;
                try {
                    result = client.savInterest(Double.valueOf(s), Integer.parseInt(y), Double.valueOf(i));
                } catch (NumberFormatException e) {
                    System.out.println("Error: "+e.getMessage());
                }
                System.out.format("Total Savings is : %.2f\n", result);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }







    }

}
