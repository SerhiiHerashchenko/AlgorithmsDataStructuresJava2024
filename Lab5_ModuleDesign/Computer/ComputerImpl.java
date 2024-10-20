package Lab5_ModuleDesign.Computer;


import Lab5_ModuleDesign.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.DataProcessing.Output.OutputDataImpl;

public class ComputerImpl implements Computer{
    int givenNumber;
    boolean playerWin = false;

    @Override
    public void pickANumber(){
        givenNumber = (int)(Math.random() * 100) + 1;
    }

    @Override
    public void checkPlayersMove(InputData input){
        String data = new OutputDataImpl().getData(input);
        int playersNum = Integer.parseInt(data);

        if (givenNumber == playersNum) {
            System.out.println("Finally... You've just figured out given number. Well, that didn't take a century");
            playerWin = true;
        }
        else if(givenNumber < playersNum){
            System.out.println("Your number is greater than number that i guessed. Try again!");
        }
        else if(givenNumber > playersNum){
            System.out.println("Your number is smaller than number that i guessed. Try again!");
        }
    }

    public boolean doesPlayerWin(){
        return playerWin;
    }
}
