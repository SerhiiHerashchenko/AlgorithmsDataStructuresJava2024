package Lab5_ModuleDesign.src.processor.game;

import Lab5_ModuleDesign.src.processor.InputData;

public interface GameProcessor {
    public <T> void checkPlayersMove(InputData input, T data);
    public boolean isWinner();
}