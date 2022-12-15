package com.kodillarps.kodillarps;

public class StartEndGame{
    public boolean finishGame(char fGame){
        if(fGame == 'n'){
            return true;
        }
        return false;
    }

    public boolean nextGame(char nGame){
        if(nGame == 'y'){
            return false;
        }
        return true;
    }
}