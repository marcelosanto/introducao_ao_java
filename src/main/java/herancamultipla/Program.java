package herancamultipla;

import herancamultipla.devices.Printer;
import herancamultipla.devices.Scanner;

public class Program {
    public static void main(String[] args) {
        Printer p = new Printer("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        Scanner s = new Scanner("2030");
        s.processDoc("MY Email");
        System.out.println("Scan result: " + s.scan());

    }
}
