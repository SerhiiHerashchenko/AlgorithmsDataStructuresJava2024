package Lab5_ModuleDesign.DataProcessing.Output;

import Lab5_ModuleDesign.DataProcessing.Input.InputData;

public interface OutputData<T, E extends InputData> {
    public T OutputDataFrom(E); 
}