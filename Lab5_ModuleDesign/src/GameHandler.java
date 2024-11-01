package Lab5_ModuleDesign.src;

import Lab5_ModuleDesign.src.GameProcessing.ConsoleGameProcessor;
import Lab5_ModuleDesign.src.GameProcessing.NumberPicker;
import Lab5_ModuleDesign.src.Player.ConsolePlayer;

public class GameHandler {
    public static void main(String[] args) {
        final ConsolePlayer player = new ConsolePlayer("SEREJA", "1");
        final ConsoleGameProcessor computer = new ConsoleGameProcessor(player);

        final NumberPicker myPicker = new NumberPicker();
        final int pickedNumber = myPicker.pick(5);
        
        System.out.println("The game's started. The number's guessed. " + player.getName() + ", your move!");

        while (computer.isWinner() != true) {
            computer.checkPlayersMove(player.makeMove(), pickedNumber);
        }
    }
}
