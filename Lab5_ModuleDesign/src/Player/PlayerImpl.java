package Lab5_ModuleDesign.src.Player;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.src.DataProcessing.Input.InputDataConsole;

public class PlayerImpl implements Player {
    final InputData data = new InputDataConsole();
    String name;
    String id;

    @Override
    public InputData makeMoveConsole(){
        data.collectData();
        return data;
    }

    @Override
    public void makeAnotherMove(){}
}
