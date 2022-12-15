package com.kodillarps.kodillarps;

public class RpsRunner {
    public static void main(String[] args) {
        StartGame startG = new StartGame();
        boolean end = false;
        boolean start = false;
        TextBoard text = new TextBoard();
        InputText input = new InputText();
        StartEndGame last = new StartEndGame();
        char choice;


        while(!end){
            if(!start){
                startG.letsPlay();
            }
            text.getEndText();
            choice = input.endInput();
            end = last.finishGame(choice);
            start = last.nextGame(choice);
        }
    }
}
