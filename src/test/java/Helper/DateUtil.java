package Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static Date getTomorrowDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    public static String[] getTomorrowDateFields() {
        Date dateTomorrow = getTomorrowDate();
        SimpleDateFormat df = new SimpleDateFormat("d MMMM yyyy");
        return df.format(dateTomorrow).split(" ");
        // [8, January, 2022]
    }

    public static String[] addDaysToTomorrow(int addDays) {
        Date dateTomorrow = getTomorrowDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateTomorrow);
        cal.add(Calendar.DAY_OF_MONTH, addDays);
        Date tomorrowPlusDays = cal.getTime();
        SimpleDateFormat df = new SimpleDateFormat("d MMMM yyyy");
        return df.format(tomorrowPlusDays).split(" ");
        // [15, January, 2022]
    }

    public static boolean isDateInCorrectFormat(String dateText, String expDateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(expDateFormat);
        boolean isDateFormatCorrect = true;

        try {
            sdf.parse(dateText);
        } catch (ParseException e) {
            isDateFormatCorrect = false;
        }

        return isDateFormatCorrect;
    }

    public static String currentDate_MMM_d_yyyy(){
        SimpleDateFormat dF = new SimpleDateFormat("MMM d yyyy");
        Date currentDate = new Date();
        String currentDateMMMdyyyy = dF.format(currentDate);
        return currentDateMMMdyyyy;
    }
    public static String currentDate_MMMM_d_yyyy(){
        SimpleDateFormat dF = new SimpleDateFormat("MMMM d, yyyy");
        Date currentDate = new Date();
        String currentDateMMMMdyyyy = dF.format(currentDate);
        return currentDateMMMMdyyyy;
    }

    public static String getCurrent_MMMM_(){
        SimpleDateFormat dF = new SimpleDateFormat("MMMM");
        Date currentDate = new Date();
        String current_MMMM = dF.format(currentDate);
        return current_MMMM;
    }

    public static String getCurrent_yyyy_(){
        SimpleDateFormat dF = new SimpleDateFormat("yyyy");
        Date currentDate = new Date();
        String current_yyyy = dF.format(currentDate);
        return current_yyyy;
    }

    public static String currentDate_MMM_(){
        SimpleDateFormat dF = new SimpleDateFormat("MMM");
        Date currentDate = new Date();
        String currentDate_MMM = dF.format(currentDate);
        return currentDate_MMM;
    }


}
