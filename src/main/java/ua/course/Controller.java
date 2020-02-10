package ua.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static ua.course.View.NUMBER_EXACT;
import static ua.course.View.WIN_NUMBER;


public class Controller {

    Scanner scan = new Scanner(System.in);
    private Model model;
    private View view;

    private int minBar;
    private int maxBar;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void inputUser() {

        int guessNumber = guessNum();
        System.out.println(guessNumber);
        view.printMessage(View.INPUT_INT_DATA);
        int number = checkIntNumber(scan);


        checkNumbers(number, guessNumber);


    }

    private int checkIntNumber(Scanner scan) {
        String str = scan.nextLine();

        while (isNumber(str) != true) {
            view.printMessage(View.WRONG_DATA);
            str = scan.nextLine();
        }
        int num = Integer.parseInt(str);

        return num;
    }

    public boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;

    }


    public int guessNum() {
        int max = 100;
        int guessNumber = (int) Math.floor(Math.random() * ++max);
        return guessNumber;
    }

    public void checkNumbers(int number, int guessNumber) {
        minBar = 0;
        maxBar = 100;
        do {

            model.setArr(number);

            if (number == guessNumber) {
                break;
            } else if (number > guessNumber && number <= maxBar) {
                    maxBar = number;
                    view.printMessage(View.NUMBER_GREATER);
                    view.printMessage(View.NUMBER_ENTER + minBar + View.AND + maxBar);

                } else if (number < guessNumber && number >= minBar) {
                    minBar = number;
                    view.printMessage(View.NUMBER_LESS);
                    view.printMessage(View.NUMBER_ENTER + minBar + View.AND + maxBar);
                } else {
                    view.printMessage(View.RANGE);
                }

            number = checkIntNumber(scan);

        }while (number != guessNumber);

        view.printMessage(NUMBER_EXACT);
        view.printMessage(WIN_NUMBER + number);
        view.printMessage(model.getArr());




    }
}



