package com.controllingexecution;

import java.util.Random;

public class ClassifyingNumbers {

    public void classify(){
        Random rand=new Random();
        int number;
        int number2=0;
        boolean valid=true;
        while(valid){
            number = rand.nextInt(100);
            if(number>number2){
                System.out.println("greater number: "+number);
            }else if(number<number2){
                System.out.println("lesser number: "+number);
            }else{
                System.out.println("numbers are equal: "+number);
            }
            number2=number;
        }
    }



    public static void main(String[] args) {
        ClassifyingNumbers classify = new ClassifyingNumbers();
        classify.classify();
    }
}
