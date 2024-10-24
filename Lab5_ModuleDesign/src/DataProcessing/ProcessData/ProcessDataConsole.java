package Lab5_ModuleDesign.src.DataProcessing.ProcessData;

import java.util.InputMismatchException;

import Lab5_ModuleDesign.src.DataProcessing.Input.InputData;
import Lab5_ModuleDesign.src.DataProcessing.Input.InputDataConsole;

public class ProcessDataConsole implements ProcessData {
    @Override
    public String getData(InputData input){
        if (input instanceof InputDataConsole) {
            return ((InputDataConsole)input).data;
        }
        else{
            throw new InputMismatchException();
        }
    } 
}