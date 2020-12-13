package com.exampl;

import java.sql.SQLOutput;

public class LongStart {
    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        // write your code here

        Long [] mass={7l,5l,45345435l};
        String [] str={"asas","fghjhgf","jhghj"};

        int i=0;
        if (i<10) {
            i++;
        }else{
            i--;
        }
        //     false
        while (i<18){
            i++;
            if(i==6){
                System.out.println("continue "+i);
//                continue;
            }
            if(i==9){
                System.out.println("break "+i);
                break;
            }
            System.out.println("i is "+i);
        }

        do {
            i++;

        }while (i<10);

        for(int t=0;t<10;t++){
//            System.out.println("t is "+t);
        }

        for(String st: str){
//            System.out.printf("element massive is %s \n",st);


        }

        Day days =Day.WEDNESDAY;

        System.out.println("is "+Day.WEDNESDAY);

        switch (days){
            case FRIDAY:
                System.out.println("IS IS FRIDAY");
                break;
            case WEDNESDAY:
                System.out.println("IS IS WEDNESDAY");
                break;
            default:
                System.out.println("FGCVJHBJNKML<:");
        }




//        i 10
//

//        mass[4]=9;


    }
}
