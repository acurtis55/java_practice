package com.dria;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 3005);
        System.out.println("New score is: " + newScore);
        System.out.println(calculateScore(750));
        calculateScore();


    }


    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored " + score+ " points.");
        return score*1000; //arbitrary value bc this method returns an int
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score*1000; //arbitrary value bc this method returns an int
    }

    public static int calculateScore(){
        System.out.println("Unnamed player, unknown score ");
        return 0;
    }




}
