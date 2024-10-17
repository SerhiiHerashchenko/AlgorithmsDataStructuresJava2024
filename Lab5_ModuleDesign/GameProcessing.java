package Lab5_ModuleDesign;

import Lab5_ModuleDesign.Computer.ComputerImpl;
import Lab5_ModuleDesign.Player.PlayerImpl;

public class GameProcessing {
    public static void main(String[] args) {
        PlayerImpl player = new PlayerImpl();
        ComputerImpl computer = new ComputerImpl();
        computer.pickANumber();
        System.out.println("The game's started. The number's guessed. Your move!");
        while (computer.doesPlayerWin() != true) {
            computer.checkPlayersMove(player.makeMove());
        }
    }
}
