package Lab5_ModuleDesign.src.GameProcessing;

import Lab5_ModuleDesign.src.Computer.ComputerImpl;
import Lab5_ModuleDesign.src.Player.PlayerImpl;

public class GameProcessing {
    public static void main(String[] args) {
        final PlayerImpl player = new PlayerImpl();
        final ComputerImpl computer = new ComputerImpl();

        computer.pickANumber();
        System.out.println("The game's started. The number's guessed. Your move!");

        while (computer.doesPlayerWin() != true) {
            computer.checkPlayersMove(player.makeMoveConsole());
        }
    }
}
