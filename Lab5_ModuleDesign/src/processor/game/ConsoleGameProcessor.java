package Lab5_ModuleDesign.src.processor.game;

import Lab5_ModuleDesign.src.processor.input.InputData;
import Lab5_ModuleDesign.src.picker.NumberPicker;
import Lab5_ModuleDesign.src.player.Player;
import Lab5_ModuleDesign.src.processor.data.ConsoleProcessData;
import Lab5_ModuleDesign.src.processor.input.ConsoleInputData;

public class ConsoleGameProcessor implements GameProcessor{
    final Player currentPlayer;
    boolean playerWin = false;
    int magicCounter = 0;

    public ConsoleGameProcessor(Player player){
        this.currentPlayer = player;
    }

    @Override
    public <T> void checkPlayersMove(InputData input, T data){
        if (input instanceof ConsoleInputData && data instanceof Integer) {
            int givenNumber = (int)data;
            String stringPlayersMove = new ConsoleProcessData().getData(input);
            int playersMove = Integer.parseInt(stringPlayersMove);
            int magicNum = rollTheDice();

            EGL moveCondition = compare(givenNumber, playersMove, magicNum);

            if (moveCondition == EGL.Equels) {
                System.out.print("Finally... You've just figured out given number. Well, it didn't take a century!\n"
                    + "Your name: " + currentPlayer.getName() + "\nYour ID:" + currentPlayer.getId());
                playerWin = true;
            }
            else if(moveCondition == EGL.Greater){
                System.out.println(this.currentPlayer.getName() + ", your number is greater than number that i guessed. Try again!");
            }
            else if(moveCondition == EGL.Less){
                System.out.println(this.currentPlayer.getName() + ", your number is smaller than number that i guessed. Try again!");
            }
        }
    }

    @Override
    public boolean isWinner(){
        return playerWin;
    }

    private int rollTheDice(){
        int num = (new NumberPicker()).pick(10);
        return num;
    }

    private EGL compare(int givenNumber, int playerNum, int magicNumber)
    {   
        if(magicCounter == 3 || (magicNumber != 7 && magicNumber != 3)) {
            if(givenNumber == playerNum) { return EGL.Equels; }
            else if(givenNumber > playerNum) { return EGL.Less; }
            else { return EGL.Greater; }
        }
        else {
            if(givenNumber == playerNum) {
                if (magicNumber == 7) { return EGL.Greater; }
                else { return EGL.Less; }
            }
            else if(givenNumber > playerNum) { return EGL.Greater; }
            else { return EGL.Less; }
        }
    }
}