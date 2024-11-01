package Lab5_ModuleDesign.src.GameProcessing;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;

public interface GameProcessor {
    public <T> void checkPlayersMove(InputData input, T data);
}
