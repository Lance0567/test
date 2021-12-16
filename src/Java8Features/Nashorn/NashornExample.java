package Java8Features.Nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class NashornExample {
    public static void main(String[] args) throws Exception {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("C:\\Users\\Lance\\IdeaProjects\\test\\src\\Java8Features\\Nashorn\\hello.js"));
    }
}
