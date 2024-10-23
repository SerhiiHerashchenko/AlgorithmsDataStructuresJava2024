package Lab5_ModuleDesign.Player;

import Lab5_ModuleDesign.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.DataProcessing.Input.InputDataConsole;
import Lab5_ModuleDesign.DataProcessing.Input.InputDataFile;

public class PlayerImpl implements Player {
    @Override
    public InputData makeMoveConsole(){
        InputData data = new InputDataConsole();
        data.collectData();
        return data;
    }
    
    @Override
    public InputData makeMoveViaFile(){
        InputData data = new InputDataFile();
        data.collectData();
        return data;
    }
}
