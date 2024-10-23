package Lab5_ModuleDesign.DataProcessing.Checker;

import Lab5_ModuleDesign.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.DataProcessing.Output.OutputDataImpl;

public class DataCheckerImpl implements DataChecker{
    @Override
    public String checkData(InputData input, int givenNumber){
        String data = new OutputDataImpl().getData(input);
        int playersNum = Integer.parseInt(data);
        String result;

        if (playersNum > givenNumber) {
            result = "g";
        }
        else if(playersNum < givenNumber) {
            result = "l";
        }
        else{
            result = "e";
        }
        return result;
    }
    
}
