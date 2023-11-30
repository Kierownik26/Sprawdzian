package workshop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Worker {
    public static void main(String[] args) {
        Tool Tool = new Tool("Mlotek");
        Tool.useTool();

        Tool[] toolsArray = new Tool[5];
        for (int i = 0; i < toolsArray.length; i++) {
            toolsArray[i] = new Tool("Rodzaj " + i);
        }

        for (Tool tool : toolsArray) {
            tool.useTool();
        }
    }
}
