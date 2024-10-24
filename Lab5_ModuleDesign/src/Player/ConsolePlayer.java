package Lab5_ModuleDesign.src.Player;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.src.DataProcessing.Input.InputDataConsole;

public class ConsolePlayer implements Player {
    final InputData data = new InputDataConsole();
    String name;
    String id;

    @Override
    public InputData makeMove(){
        data.collectData();
        return data;
    }
}
