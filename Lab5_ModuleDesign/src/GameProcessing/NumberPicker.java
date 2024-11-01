package Lab5_ModuleDesign.src.GameProcessing;

import java.util.InputMismatchException;

public class NumberPicker implements Picker {
    @Override
    public <T> int pick(T data){
        int num;
        if (data instanceof Integer) {
            num = (int)(Math.random() * 100) + 1;  
        }
        else{
            throw new InputMismatchException();
        }
        return num;
    }
}
