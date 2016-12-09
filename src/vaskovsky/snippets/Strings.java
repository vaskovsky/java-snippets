package vaskovsky.snippets;

/**
 * String snippets.
 */
public class Strings
{
	/**
	 * Joins strings using delimiter.
	 * 
	 * @param delimiter is a delimiter string.
	 * @param strings are source strings to join.
	 * @return a string containing source strings delimited by delimiter.
	 * @exception NullPointerException if delimiter or strings are null.
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static String join(String delimiter, String[] strings)
	{
		if(delimiter == null || strings == null)
			throw new NullPointerException();
		StringBuilder buffer = new StringBuilder();
		if(strings.length > 0) {
			buffer.append(strings[0]);
		}
		for(int i = 1; i < strings.length; i++) {
			buffer.append(delimiter);
			buffer.append(strings[i]);
		}
		return buffer.toString();
	}

	/**
	 * Joins strings using delimiter.
	 * 
	 * @param delimiter is a delimiter string.
	 * @param strings are source strings to join.
	 * @return a string containing source strings delimited by delimiter.
	 * @exception NullPointerException if delimiter or strings are null.
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static String join(String delimiter,
		java.util.Collection<Object> strings)
	{
		if(delimiter == null || strings == null)
			throw new NullPointerException();
		StringBuilder buffer = new StringBuilder();
		java.util.Iterator<Object> it = strings.iterator();
		if(it.hasNext()) {
			buffer.append(it.next());
		}
		while(it.hasNext()) {
			buffer.append(delimiter);
			buffer.append(it.next());
		}
		return buffer.toString();
	}

	/**
	 * Joins strings using delimiter.
	 * 
	 * @param delimiter is a delimiter string.
	 * @param strings are source strings to join.
	 * @return a string containing source strings delimited by delimiter.
	 * @exception NullPointerException if delimiter or strings are null.
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static String join(String delimiter,
		java.util.Enumeration<Object> strings)
	{
		if(delimiter == null || strings == null)
			throw new NullPointerException();
		StringBuilder buffer = new StringBuilder();
		if(strings.hasMoreElements()) {
			buffer.append(strings.nextElement());
		}
		while(strings.hasMoreElements()) {
			buffer.append(delimiter);
			buffer.append(strings.nextElement());
		}
		return buffer.toString();
	}

	/**
	 * Usage example and minimal unit test.
	 * 
	 * @param args are ignored.
	 */
	public static void main(String[] args)
	{
		assert Strings.join(";", new String[] {"a", "b", "c"})
			== "a;b;c";
		System.out.println("OK Strings");
	}
}
