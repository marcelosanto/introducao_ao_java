package abstratas;

import abstratas.entities.Account;
import abstratas.entities.BussinesAccount;
import abstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BussinesAccount(1002, "Maria", 1000.0, 900.0));
        list.add(new SavingsAccount(1003, "Carla", 1500.00, 0.01));
        list.add(new BussinesAccount(1004, "Joao", 1800.0, 800.0));
        list.add(new SavingsAccount(1005, "Rogerio", 300.00, 0.01));
        list.add(new BussinesAccount(1006, "Adelina", 2500.0, 600.0));
        list.add(new SavingsAccount(1007, "Nougueira", 280.00, 0.01));
        list.add(new BussinesAccount(1008, "Jessica", 1890.0, 200.0));

    }
}
