package Lab5_ModuleDesign.src.DataProcessing.Input;

import java.util.Scanner;

public class InputDataConsole implements InputData {
    private Scanner console;
    public String data;

    @Override
    public void collectData() {
        console = new Scanner(System.in);
        data = console.nextLine();
    }
}
