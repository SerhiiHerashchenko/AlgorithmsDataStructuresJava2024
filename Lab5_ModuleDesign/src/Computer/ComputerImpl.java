package Lab5_ModuleDesign.src.Computer;

import java.util.InputMismatchException;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.src.DataProcessing.ProcessData.ProcessDataConsole;

public class ComputerImpl implements Computer{
    int givenNumber;
    boolean playerWin = false;

    @Override
    public <T> void pick(T data){
        if (data instanceof Integer) {
            givenNumber = (int)(Math.random() * 100) + 1;  
        }
        else{
            throw new InputMismatchException();
        }
    }

    @Override
    public void checkPlayersMove(InputData input){
        String moveCondition = new ProcessDataConsole().getData(input);
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