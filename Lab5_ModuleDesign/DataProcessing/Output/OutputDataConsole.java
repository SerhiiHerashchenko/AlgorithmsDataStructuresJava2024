package Lab5_ModuleDesign.DataProcessing.Output;

import Lab5_ModuleDesign.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.DataProcessing.Input.InputDataConsole;

public class OutputDataConsole implements OutputData {
    @Override
    public String getData(InputData input){
        return ((InputDataConsole)input).data;
    } 
}