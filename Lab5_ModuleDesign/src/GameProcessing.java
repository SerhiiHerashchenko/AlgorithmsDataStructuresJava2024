package Lab5_ModuleDesign.src;

import Lab5_ModuleDesign.src.Computer.ComputerImpl;
import Lab5_ModuleDesign.src.Player.ConsolePlayer;

public class GameProcessing {
    public static void main(String[] args) {
        final ConsolePlayer player = new ConsolePlayer();
        final ComputerImpl computer = new ComputerImpl();

        computer.pick(5);
        System.out.println("The game's started. The number's guessed. Your move!");

        while (computer.doesPlayerWin() != true) {
            computer.checkPlayersMove(player.makeMove());
        }
    }
}
