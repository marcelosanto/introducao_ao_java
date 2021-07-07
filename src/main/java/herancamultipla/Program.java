package herancamultipla;

import herancamultipla.devices.ComboDevice;
import herancamultipla.devices.ConcretePrinter;
import herancamultipla.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2030");
        s.processDoc("MY Email");
        System.out.println("Scan result: " + s.scan());

        ComboDevice dv = new ComboDevice("2027");
        dv.processDoc("My dissertation");
        dv.print("My dissertation");
        System.out.println("Scan result: " + dv.scan());

    }
}
