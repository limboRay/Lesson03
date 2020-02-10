package ua.course;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class TestGuessNumber {
   private static Controller controller;
   private static Model model;
    private static View view;
   private int max = 100;
   private int number;
   int guessNumber = controller.guessNum();

    @BeforeClass
    public static void runT(){
        controller = new Controller(model, view);
        model = new Model();
    }

    @Test
    public void testNum(){
         number = (int) Math.floor(Math.random() * max);
         if(number != guessNumber){

             model.setArr(number);
             testNum();
         }else{

             Assert.assertTrue(true);
         }

    }

}
