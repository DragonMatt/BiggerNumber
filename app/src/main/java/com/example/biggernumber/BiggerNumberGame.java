package com.example.biggernumber;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int lower_limit;
    private int upper_limit;

    public BiggerNumberGame(int lower_limit, int upper_limit) {
        this.lower_limit = lower_limit;
        this.upper_limit = upper_limit;
        generateRandomNumber();
    }

    // generate random numbers
    public void generateRandomNumber() {
        // generate a number between min and max limits inclusive
        // store one number in number one
        // generate a different number stored in number two

        number1 = (int)(Math.random() * (upper_limit - lower_limit + 1)) + lower_limit;
        do{
            number2 = (int) (Math.random() * (upper_limit - lower_limit + 1)) + lower_limit;
        }   while (number1 == number2);
    }

    public String checkAnswer(int answer) {
        // determine if the answer is right based on the values of number1 & number2
        // update the score accordingly
        // return a relevant message
        int biggerNumber = Math.max(number1, number2);
        if(answer == biggerNumber) {
            score++;
            return "Correct!";
        }
        else {
            return "Incorrect...";
        }
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLower_limit() {
        return lower_limit;
    }

    public void setLower_limit(int minimumLimit) {
        this.lower_limit = minimumLimit;
    }

    public int getUpper_limit() {
        return upper_limit;
    }

    public void setUpper_limit(int maximumLimit) {
        this.upper_limit = maximumLimit;
    }
}
