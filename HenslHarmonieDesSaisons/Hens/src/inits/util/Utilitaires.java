package inits.util;

import com.badlogic.gdx.Gdx;

public class Utilitaires {
	/* Cette classe servira pour tous les bouts de code utilitaires
	 * dont on pourrait avoir besoin
	 */

	public static void henslog(String str) {
		/* Determiner mon appelant */
		String name = null;
		try
		{  Exception e = new Exception();
		name = ((e.getStackTrace())[1]).getClassName();
		}
		catch(Exception e2) {}	
		Gdx.app.log(name,str);
	}
	
	public static void henslog2(String str) {
	}
}
