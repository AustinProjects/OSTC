package S1.DateProgram;

public class Date {

    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int setDay(int day) {
        this.day = day;
        return day;
    }

    public int setMonth(int month) {
        this.month = month;
        return month;
    }

    public int setYear(int year) {
        this.year = year;
        return year;
    }
    public int setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        return day;
    }
    public String toString() {

        String day;
        String month;
        String year = String.valueOf(this.year);

        if (this.day < 10) {
            day = "0" + (this.day);
        } else {
            day = String.valueOf(this.day);
        }
        if (this.month < 10) {
            month = "0" + this.month;
        } else {
            month = String.valueOf(this.month);
        }

        return day+""+month+""+year;


    }
}
