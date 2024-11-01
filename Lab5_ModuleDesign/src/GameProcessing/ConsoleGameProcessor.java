package Lab5_ModuleDesign.src.GameProcessing;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.src.DataProcessing.Input.InputDataConsole;
import Lab5_ModuleDesign.src.DataProcessing.ProcessData.ProcessDataConsole;
import Lab5_ModuleDesign.src.Player.Player;

public class ConsoleGameProcessor implements GameProcessor{
    final Player currentPlayer;
    boolean playerWin = false;

    public ConsoleGameProcessor(Player player){
        this.currentPlayer = player;
    }

    @Override
    public <T> void checkPlayersMove(InputData input, T data){
        if (input instanceof InputDataConsole && data instanceof Integer) {
            int givenNumber = (int)data;
            String moveCondition1 = new ProcessDataConsole().getData(input);
            int moveCondition = Integer.parseInt(moveCondition1);

            if (moveCondition == givenNumber) {
                System.out.print("Finally... You've just figured out given number. Well, it didn't take a century!\n"
                    + "Your name: " + currentPlayer.getName() + "\nYour ID:" + currentPlayer.getId());
                playerWin = true;
            }
            else if(moveCondition > givenNumber){
                System.out.println(this.currentPlayer.getName() + ", your number is greater than number that i guessed. Try again!");
            }
            else if(moveCondition < givenNumber){
                System.out.println(this.currentPlayer.getName() + ", your number is smaller than number that i guessed. Try again!");
            }
        }
    }

    public boolean isWinner(){
        return playerWin;
    }
}