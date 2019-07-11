package com.dria;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(4000));
	// write your code here
    }

    public static String getDurationString(int min, int sec){

        if(min >= 0 && sec >=0 && sec<=59){

            int hours = min/60;
            int remMin = min % 60;
            return min + "m " + sec + "s = " + hours + "h " + remMin + "m " + sec + "s";


        }
        else{
            return "Invalid value";
        }

    }

    public static String getDurationString(int sec){

        if(sec>=0){

            int min = sec/60;
            int remSec = sec %60;
            return getDurationString(min, remSec);

        }
        else{
            return "Invalid value";
        }

    }




    }
