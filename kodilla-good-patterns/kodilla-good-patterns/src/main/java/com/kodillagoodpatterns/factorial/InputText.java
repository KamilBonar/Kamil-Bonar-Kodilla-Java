package com.kodillagoodpatterns.factorial;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputText {

    public int input(){
        int choose = 0;
        boolean b = true;
        Scanner sc = new Scanner(System.in);

        while(b){
            try{
                choose = sc.nextInt();
                if(choose >= 1){
                    b = false;
                }else{
                    System.out.println("You choose wrong number! Try again!");
                }
            }catch (InputMismatchException e) {
                System.out.println("You choose letter, not number! Try again!");
                sc.nextLine();
            }
        }
        return choose;
    }
}