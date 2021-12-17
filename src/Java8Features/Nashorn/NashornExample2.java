package Java8Features.Nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample2 {
    public static void main(String[] args) throws ScriptException {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Evaluating Nashorn code
        ee.eval("print('Hello Nashorn')");
    }
}
