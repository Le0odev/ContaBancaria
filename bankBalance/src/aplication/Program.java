package aplication;

import entities.Deposit;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine(); // Limpar o buffer do scanner

        System.out.println("Enter the account holder: ");
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit? (y/n)?");
        String resposta = sc.nextLine().toLowerCase(); // Converter a entrada para minúsculas

        double deposit = 0;
        if (resposta.equals("y")){
            System.out.println("Enter the initial deposit: ");
            deposit = sc.nextDouble();
            sc.nextLine(); // Limpar o buffer do scanner novamente
        }
        System.out.println();

        Deposit deposit1 = new Deposit(accNumber, holder, deposit);
        System.out.println("\nAccount data:");
        System.out.println(deposit1);
        
        System.out.println("Is there a new deposit? (y/n)");
        String depositOrNot = sc.nextLine().toLowerCase();
        
        if(depositOrNot.equals("y")){
            System.out.println("Enter a deposit value:");
            double depositValue = sc.nextDouble();
            deposit1.addDeposit(depositValue);
            sc.nextLine(); 
            System.out.println("Updated account data:");
            System.out.println(deposit1);
        }
        
        System.out.println("Enter a withdraw value? (y/n)");
        String withdrawOrNot = sc.nextLine().toLowerCase();
        
        if(withdrawOrNot.equals("y")){
            System.out.println("Enter a withdraw value:");
            double withdrawValue = sc.nextDouble();
            deposit1.withdraw(withdrawValue);
            System.out.println("Updated account data:");
            System.out.println(deposit1);
        }
        
        sc.close();
    }
}
