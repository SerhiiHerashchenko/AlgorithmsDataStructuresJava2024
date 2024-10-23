package Lab5_ModuleDesign.src.DataProcessing.Checker;

import Lab5_ModuleDesign.src.DataProcessing.GetData.GetDataImpl;
import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;

public class CheckDataImpl implements CheckData{
    @Override
    public String checkData(InputData input, int givenNumber){
        final String data = new GetDataImpl().getData(input);
        final int playersNum = Integer.parseInt(data);
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
