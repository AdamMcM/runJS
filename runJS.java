import java.io.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class runJS {

    public static void main(String[] args) {
        try {
            System.out.println("args.l= " + args.length);
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("javascript");
            System.out.println(args[0]);
            FileReader reader = new FileReader(args[0]);
            engine.eval(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
