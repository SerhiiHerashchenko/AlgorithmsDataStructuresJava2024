package Lab5_ModuleDesign.src.processor.data;

import java.util.InputMismatchException;

import Lab5_ModuleDesign.src.processor.input.InputData;
import Lab5_ModuleDesign.src.processor.input.BannerReader;
import Lab5_ModuleDesign.src.processor.input.ConsoleInputData;

public class ConsoleProcessData implements ProcessData {
    @Override
    public String getData(InputData input){
        if (input instanceof ConsoleInputData) {
            return ((ConsoleInputData)input).data;
        }
        else if (input instanceof BannerReader) {
            return ((BannerReader)input).data;
        }
        else{
            throw new InputMismatchException();
        }
    } 
}