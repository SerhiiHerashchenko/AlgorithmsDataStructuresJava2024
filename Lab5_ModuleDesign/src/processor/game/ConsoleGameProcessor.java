package Lab5_ModuleDesign.src.processor.game;

import Lab5_ModuleDesign.src.processor.input.InputData;

import Lab5_ModuleDesign.src.picker.NumberPicker;
import Lab5_ModuleDesign.src.player.Player;
import Lab5_ModuleDesign.src.processor.data.ConsoleProcessData;
import Lab5_ModuleDesign.src.processor.input.BannerReader;
import Lab5_ModuleDesign.src.processor.input.ConsoleInputData;
import Lab5_ModuleDesign.src.processor.comparator.NumberComparator;

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
            Object playerMove;
            try {
                playerMove = Integer.parseInt(stringPlayersMove);
            } catch (NumberFormatException e) {
                playerMove = stringPlayersMove;
            }
            int magicNum = rollTheDice();

            if ((magicNum == 7 || magicNum == 3) && magicCounter < 3) { magicCounter++; }

            EGLU moveCondition = (new NumberComparator()).compare(givenNumber, playerMove, magicNum, magicCounter);

            if (moveCondition == EGLU.Uncomparable) {
                System.out.println(this.currentPlayer.getName() + ", you've just written something that is not a number, thus try again!");
            }
            else if (moveCondition == EGLU.Equels) {
                BannerReader banner = new BannerReader("Lab5_ModuleDesign\\src\\banners\\Winner_Banner.txt");
                String message = (new ConsoleProcessData()).getData(banner);
                
                System.out.print(message + "\nFinally... You've just figured out given number. Well, it didn't take a century! \n"
                    + "Your name: " + currentPlayer.getName() + "\nYour ID:" + currentPlayer.getId());
                playerWin = true;
            }
            else if(moveCondition == EGLU.Greater){
                System.out.println(this.currentPlayer.getName() + ", your number is greater than number that i guessed. Try again!");
            }
            else if(moveCondition == EGLU.Less){
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
}