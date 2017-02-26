package vaskovsky.snippets;

/** 
 * Singleton example.
 */
public class Singleton
{
	private static Singleton instance;

	/**
	 * Returns the global instance of this singleton.
	 * 
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static Singleton getInstance()
	{
		return instance != null? instance: (instance = new Singleton());
	}

	private Singleton()
	{}
}
