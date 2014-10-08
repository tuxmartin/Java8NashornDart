import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");	
		
		engine.eval("print('Dart vs pure JavaScript');"); // initialize JavaScript engine
		System.out.println();
		
		/* ############### Pure JavaScript */
		
		long jsStartTime = System.currentTimeMillis();
		
		System.out.println("JavaScript script file size '33b':");		
		engine.eval("load('javascript.js');");
		
		long jsEndTime  = System.currentTimeMillis();
		System.out.println(jsEndTime - jsStartTime + " ms");
		
		/* ############### Pure JavaScript */
		
		
		/* ############### Dart compiled to JavaScript */
		
		long dartStartTime = System.currentTimeMillis();
		
		System.out.println("\nDart output script file size '14 121b (13,1kB)':");		
		engine.eval("load('dart.js');");
		
		long dartEndTime = System.currentTimeMillis();
		System.out.println(dartEndTime - dartStartTime + " ms");
		
		/* ############### Dart compiled to JavaScript */
	}
}
