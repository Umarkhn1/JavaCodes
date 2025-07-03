package OOP.amaliyfinal;

public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime(){

    }

     public MyTime(int hour,int minute,int second){
         if (hour >= 0 && hour <= 23 &&
                 minute >= 0 && minute <= 59 &&
                 second >= 0 && second <= 59) {
             this.hour = hour;
             this.minute = minute;
             this.second = second;
         }
         else {
             System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
         }
     }

    public void setTime(int hour,int minute,int second) {
        if (hour >= 0 && hour <= 23 &&
                minute >= 0 && minute <= 59 &&
                second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                    minute=0;
                    second=0;
                }
            }
        }
        return this;
    }
    public MyTime nextMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
            if (second == 60) {
                second = 0;
                minute++;
                if (hour == 24) {
                    hour = 0;
                    minute=0;
                    second=0;
                }
            }
        }
        return this;
    }
    public MyTime nextHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
            minute=0;
            second=0;

            if (minute == 60) {
                minute = 0;
                hour++;
                if (second == 60) {
                    second = 0;
                minute++;
                }
            }
        }
        return this;
    }



}


