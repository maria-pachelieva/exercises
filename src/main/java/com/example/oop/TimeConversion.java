package com.example.oop;

public class TimeConversion {

    public static void main(String[] args) {
        String s = "03:05:45AM";
        int index = 8;
        String amOrPm = getCharFromString(s, index);

        //System.out.println("Char is" + amOrPm);

        int hour = Integer.parseInt(s.substring(0, 2));

        if (amOrPm.equalsIgnoreCase("p")) {
            if (hour < 12) {
                hour = hour + 12;
            }

        }
        if (amOrPm.equalsIgnoreCase("a")) {
            if (hour == 12) {
                hour = 0;
            }

        }
        String result;
        if (hour < 10) {
            result = "0" + hour + s.substring(2, 8);

        } else {
            result = hour + s.substring(2, 8);

        }
        System.out.println(result);


    }

    public static String getCharFromString(String str, int index) {
        return str.substring(index, index + 1);
    }

}

