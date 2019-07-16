package com.dria;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetandInchestoCentimeters(7, 5));
        System.out.println(calcFeetandInchestoCentimeters(100));

    }


    public static double calcFeetandInchestoCentimeters(double feet, double inches){
        if(feet>=0 && inches >=0 && inches <=12){

            double cm = feet *30.48 + inches*2.54;
            System.out.println(feet + " feet, " + inches + "inches = " + cm + "cm");
            return cm;

        }
        else{
            return -1;
        }

    }

    public static double calcFeetandInchestoCentimeters(double inches){

        if(inches >=0){

            double feet = (int)inches/12;
            double remain = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + inches + " inches");
            return calcFeetandInchestoCentimeters(feet , remain);

        }
        else{
            return -1;
        }

    }




    }
