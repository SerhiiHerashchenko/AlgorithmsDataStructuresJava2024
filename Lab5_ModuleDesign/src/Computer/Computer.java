package Lab5_ModuleDesign.src.Computer;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;

public interface Computer {
    public <T> void pick(T data);
    public void checkPlayersMove(InputData input);
}
