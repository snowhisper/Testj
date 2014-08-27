package Default;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\shuo.wang\\Desktop\\spring\\echo.jar");
		URLClassLoader child = new URLClassLoader (new URL[]{file.toURL()},Main.class.getClassLoader());
		Class classToLoad = Class.forName ("com.print.echo", true, child);
		Method method = classToLoad.getDeclaredMethod ("echoout");
		Object instance = classToLoad.newInstance ();
		Object result = method.invoke (instance);
	}

}
