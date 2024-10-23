package Lab5_ModuleDesign.src.DataProcessing.GetData;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.src.DataProcessing.Input.InputDataConsole;

public class GetDataImpl implements GetData {
    @Override
    public String getData(InputData input){
        return ((InputDataConsole)input).data;
    } 
}