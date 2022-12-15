package com.kodillarps.kodillarps;

public class TextBoard
{

    public void startText ()
    {
        System.out.println("Hello in Stone, Paper, Scissors, Spock, Lizard game\n");
        System.out.println("Please, input number of rounds:");
    }

    public void board (){

        System.out.println("Please, choose stone, paper, cissors, spock or lizard and click ENTER");
        System.out.println("1: Stone");
        System.out.println("2: Paper");
        System.out.println("3: Scissors");
        System.out.println("4: Spock");
        System.out.println("5: Lizard");
    }

    public void choosePlayer(int choose){
        if(choose == 1){
            System.out.println("You choose Stone");
        }else if(choose == 2){
            System.out.println("You choose Paper");
        }else if (choose == 3){
            System.out.println("You choose Scissors");
        }else if (choose == 4){
            System.out.println("You choose Spock");
        }else if (choose == 5){
            System.out.println("You choose Lizard");
        }else{
            System.out.println("You choose wrong number, please try again.");
        }
    }

    public void whatChooseComputer(int chooseComputer){

        switch(chooseComputer){
            case 1:
                System.out.println("Computer choose Stone");
                break;
            case 2:
                System.out.println("Computer choose Paper");
                break;
            case 3:
                System.out.println("Computer choose Scissors");
                break;
            case 4:
                System.out.println("Computer choose Spock");
                break;
            case 5:
                System.out.println("Computer choose Lizard");
                break;
        }
    }

    public void result(int plWin, int compWin){

        System.out.println("End of the game!");

        if(plWin > compWin){
            System.out.println("You win the game. Well done!\n");
        }else if(plWin < compWin){
            System.out.println("You loose! Maybe next time.\n");
        }else {
            System.out.println("Draw\n");
        }

        System.out.println("Your points " + plWin);
        System.out.println("Computer points " + compWin);

    }

    public static void getPlayerWin(){
        System.out.println("You win\n");
    }

    public static void getComputerWin(){
        System.out.println("Computer win\n");
    }

    public static void getDraw(){
        System.out.println("Draw\n");
    }

    public static void getEndText(){
        System.out.println("\nDo you want play again?(y/n)");
    }

    public static void get0(){
        System.out.println("You should choose number higher than 0!");
    }

    public static void getException(){
        System.out.println("You choose letter, not number! Try again!");
    }
}