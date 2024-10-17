package Lab5_ModuleDesign.Player;

import Lab5_ModuleDesign.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.DataProcessing.Input.InputDataConsole;

public class PlayerImpl implements Player {
    @Override
    public InputData makeMove(){
        InputDataConsole data = new InputDataConsole();
        data.collectData();
        return data;
    }
}
