package Lab5_ModuleDesign.src.Player;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.src.DataProcessing.Input.InputDataConsole;

public class ConsolePlayer implements Player {
    private final InputData data = new InputDataConsole();
    private String name;
    private String id;

    public ConsolePlayer(String name, String id){
        this.id = id;
        this.name = name;
    }
    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public InputData makeMove(){
        data.collectData();
        return data;
    }
}
