package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;
    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        OverflowChecking();
    }
    public int getHour() {return hour;}
    public int getMinute() {return minute;}
    public int getSecond() {return second;}

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {

        this.minute = minute;
        OverflowChecking();
    }
    public void setSecond(int second) {
        this.second = second;
        OverflowChecking();
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    void add(TimeSpan time) {
        hour += time.hour;
        minute += time.minute;
        second += time.second;
        OverflowChecking();
    }

    void subtract(TimeSpan time) {
        if(time.second > second) {
            time.minute++;
            time.second -= second;
            second = 60;
        }
        if(time.minute > minute) {
            time.hour++;
            time.minute -= minute;
            minute = 60;
        }
        hour -= time.hour;
        minute -= time.minute;
        second -= time.second;
    }

    private void OverflowChecking() {
        if(second > 59) {
            minute += second/60;
            second = second%60;
        }
        if(minute > 59) {
            hour += minute/60;
            minute = minute%60;
        }
    }
}
