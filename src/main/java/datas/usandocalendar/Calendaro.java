package datas.usandocalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class Calendaro {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date date = Date.from(Instant.parse("2021-06-10T00:30:50Z"));

        System.out.println(simpleDateFormat.format(date));

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        //date = cal.getTime();
        //System.out.println(simpleDateFormat.format(date));

        int hour = cal.get(Calendar.HOUR);
        int minutes = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int month = 1 + cal.get(Calendar.MONTH);
        date = cal.getTime();

        System.out.println(hour + ":" + minutes + ":" + second);
        System.out.println("Month: " + month);
    }
}
