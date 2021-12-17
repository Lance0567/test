package Java8Features.Nashorn;

import javax.script.*;
import java.io.FileReader;

public class NashornExample3 {
    public static void main(String[] args) throws Exception {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Binding script and Define scope of script
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
        bind.put("name", "Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("C:\\Users\\Lance\\IdeaProjects\\test\\src\\Java8Features\\Nashorn\\hello4.js"));
    }
}
