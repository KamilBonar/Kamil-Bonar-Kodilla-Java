package com.kodillarps.kodillarps;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class InputText {

    public int numberRound(){
        int numRound = 0;
        Scanner sc = new Scanner(System.in);
        TextBoard tx = new TextBoard();
        boolean a = true;

        while(a){
            try{
                numRound = sc.nextInt();
                if(numRound <= 0){
                    tx.get0();
                    a = true;
                }else{
                    a = false;
                }
            }catch (InputMismatchException e) {
                tx.getException();
                sc.nextLine();
            }
        }
        return numRound;
    }

    public int computerInput(){
        Random generator = new Random();
        int chooseComputer = (generator.nextInt(4)+1);
        TextBoard computer = new TextBoard();
        computer.whatChooseComputer(chooseComputer);
        return chooseComputer;
    }

    public int test(){
        int choose = 0;
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        TextBoard tx = new TextBoard();

        while(b){
            try{
                choose = sc.nextInt();
                tx.choosePlayer(choose);
                if(choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5){
                    b = true;
                }else{
                    b = false;
                }
            }catch (InputMismatchException e) {
                tx.getException();
                sc.nextLine();
            }
        }
        return choose;
    }

    public char endInput(){
        char end;
        do{
            Scanner sc = new Scanner(System.in);
            end = sc.next().charAt(0);
        } while(end != 'y' && end != 'n');
        return end;
    }
}
