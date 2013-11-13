package smithstone.services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeService implements DateTime {


    @Override
    public String getFormattedDateTime() {
        return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    }
}
