public class MyCalendar {
    static int year = 2024;
    static int month = 10;
    static int day = 22;
    public static String myDate() {
        return year + "-" + month + "-" + day;
    }
    public static int days() {
        return month*30 + day;
    }
    public static String monthName() {
        String month_name = "";
        if (month == 1) month_name = "January";
        else if (month == 2) month_name = "February";
        else if (month == 3) month_name = "March";
        else if (month == 4) month_name = "April";
        else if (month == 5) month_name = "May";
        else if (month == 6) month_name = "June";
        else if (month == 7) month_name = "July";
        else if (month == 8) month_name = "August";
        else if (month == 9) month_name = "September";
        else if (month == 10) month_name = "October";
        else if (month == 11) month_name = "November";
        else if (month == 12) month_name = "December";
        return month_name;
    }
}
