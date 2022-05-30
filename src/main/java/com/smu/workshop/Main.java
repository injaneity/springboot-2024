package com.smu.workshop;

public class Main {
    public static void main(String[] args) {
        ShowTimeClock showTimeClock = new MyShowTimeClock();
        System.out.println(showTimeClock.whatTimeIsIt());
    }
}