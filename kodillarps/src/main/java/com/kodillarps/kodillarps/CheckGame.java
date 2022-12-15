package com.kodillarps.kodillarps;

public class CheckGame{

    public int checkGame(int choose, int chooseComputer){
        TextBoard st = new TextBoard();
        int d = 0;
        switch(choose){
            case 1:
                if(chooseComputer == 3 || chooseComputer == 5){
                    d = 1;
                }else if(chooseComputer == 2 || chooseComputer == 4){
                    d = 2;
                }break;
            case 2:
                if(chooseComputer == 1 || chooseComputer == 4){
                    d = 1;
                }else if(chooseComputer == 3 || chooseComputer == 5){
                    d = 2;
                }break;
            case 3:
                if(chooseComputer == 2 || chooseComputer == 5){
                    d = 1;
                }else if(chooseComputer == 1 || chooseComputer == 4){
                    d = 2;
                }break;
            case 4:
                if(chooseComputer == 3 || chooseComputer == 1){
                    d = 1;
                }else if(chooseComputer == 2 || chooseComputer == 5){
                    d = 2;
                }break;
            case 5:
                if(chooseComputer == 4 || chooseComputer == 2){
                    d = 1;
                }else if(chooseComputer == 1 || chooseComputer == 3){
                    d = 2;
                }break;
        }
        return d;
    }

}