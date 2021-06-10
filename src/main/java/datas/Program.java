package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("09/06/2021");
        Date y2 = sdf2.parse("09/06/2021 22:05:05");
        Date x = new Date();
        Date x2 = new Date(System.currentTimeMillis());

        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("x: " + sdf2.format(x));
        System.out.println("x2: " + sdf2.format(x2));
    }
}
