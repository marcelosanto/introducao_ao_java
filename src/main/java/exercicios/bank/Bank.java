package exercicios.bank;

import exercicios.bank.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double deposity = 0.00;
        char resposta;
        int number;
        String holder;

        // Entra com numero da conta
        System.out.print("Enter account number: ");
        number = sc.nextInt();

        // Entra com nome do dono/a da conta
        System.out.print("Enter account holder: ");
        sc.nextLine();
        holder = sc.nextLine();

        // Deposito inicial
        System.out.print("Is there na initial deposit (y/n)? ");
        resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.print("Entra com o valor: ");
            deposity = sc.nextDouble();
        }

        Account account = new Account(number, holder, deposity);
        System.out.print("Account data: " + account);

        // Entra com o valor do deposito
        System.out.print("Enter a deposit value: ");
        deposity = sc.nextDouble();

        account.Deposit(deposity);
        System.out.print("Updated account data: " + account);

        // Entra com o valor do saque
        System.out.print("Enter a withdraw value: ");
        deposity = sc.nextDouble();

        account.WithdrawDeposit(deposity);
        System.out.print("Updated account data: " + account);

        System.out.println("Account data: \n" + account);

        sc.close();
    }
}
