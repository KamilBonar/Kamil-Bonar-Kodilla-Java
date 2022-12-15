package com.kodillarps.kodillarps;

import java.util.Scanner;

public class StartGame{

    public void letsPlay(){
        int choose;
        int numRound;
        int chooseComputer;
        char end;
        int computerWin = 0;
        int playerWin = 0;

        TextBoard st = new TextBoard();
        st.startText();
        InputText in = new InputText();
        numRound = in.numberRound();
        Scanner sc = new Scanner(System.in);

        for(int i =1; i<=numRound; i++){

            st.board();

            System.out.println("Start " + i + " round!");

            choose = in.test();
            chooseComputer = in.computerInput();
            CheckGame game = new CheckGame();
            int goBack = game.checkGame(choose, chooseComputer);

            if(goBack == 1){
                st.getPlayerWin();
                playerWin++;
            }else if (goBack == 2){
                st.getComputerWin();
                computerWin++;
            }else{
                st.getDraw();
            }
        }

        st.result(playerWin,computerWin);
    }
}
