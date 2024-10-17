package Lab5_ModuleDesign.DataProcessing.Input;

import java.util.Scanner;

public class InputDataConsole implements InputData {
    public String data;

    @Override
    public void collectData() {
        Scanner console = new Scanner(System.in);
        data = console.nextLine();
        console.close();
    }
}
