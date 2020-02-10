package ua.course;

import java.util.ArrayList;

public class View {

    public static final String INPUT_INT_DATA= "Input INT value from 0 to 100 = ";
    public static final String WRONG_DATA = "Wrong input! Repeat please! ";
    public static final String NUMBER_GREATER = "This number is greater";
    public static final String NUMBER_LESS = "This number is less";
    public static final String NUMBER_EXACT = "You guessed the number";
    public static final String NUMBER_ENTER = "Insert the number between ";
    public static final String AND = " and ";
    public static final String RANGE =  "Invalid range! Repeat please!";
    public static final String WIN_NUMBER =  "Your number: ";


    public void printMessage(String message){
        System.out.println(message);
    }



}
