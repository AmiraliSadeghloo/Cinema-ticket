public class Date {
    //Date(int year, int month, int date)
    private int day, hour;

    Date(int day, int hour) {
        this.day = day;
        this.hour = hour;

    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
