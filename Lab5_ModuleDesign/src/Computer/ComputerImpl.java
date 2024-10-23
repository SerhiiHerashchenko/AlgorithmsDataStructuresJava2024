package Lab5_ModuleDesign.src.Computer;

import Lab5_ModuleDesign.src.DataProcessing.Checker.CheckDataImpl;
import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;

public class ComputerImpl implements Computer{
    int givenNumber;
    boolean playerWin = false;

    @Override
    public void pickANumber(){
        givenNumber = (int)(Math.random() * 100) + 1;
    }

    @Override
    public void checkPlayersMove(InputData input){
        final CheckDataImpl checker = new CheckDataImpl();
        String moveCondition = checker.checkData(input, givenNumber);
        if (moveCondition == "e") {
            System.out.println("Finally... You've just figured out given number. Well, it didn't take a century");
            playerWin = true;
            input.stopCollecting();
        }
        else if(moveCondition == "g"){
            System.out.println("Your number is greater than number that i guessed. Try again!");
        }
        else if(moveCondition == "l"){
            System.out.println("Your number is smaller than number that i guessed. Try again!");
        }
    }

    public boolean doesPlayerWin(){
        return playerWin;
    }
}