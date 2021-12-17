package Java8Features.Nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class NashornExample4 {
    public static void main(String[] args) throws Exception {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("C:\\Users\\Lance\\IdeaProjects\\test\\src\\Java8Features\\Nashorn\\hello8.js"));
        Invocable invocable = (Invocable) ee;
        // Calling a function
        invocable.invokeFunction("functionDemo1");
        // Calling a function and passing variable as well.
        invocable.invokeFunction("functionDemo2", "Nashorn");
    }
}
