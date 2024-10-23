package Lab5_ModuleDesign.DataProcessing.Input;

import java.util.Scanner;

public class InputDataFile implements InputData {
    public String data;

    @Override
    public void collectData() {
        Scanner console = new Scanner("Lab5_ModuleDesign\\GameProcessing\\input.txt");
        data = console.nextLine();
        console.close();
    }
}