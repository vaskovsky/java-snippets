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
	 * @throws NullPointerException if delimiter or strings are null.
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static <T> String join(String delimiter, T[] strings)
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
	 * @throws NullPointerException if delimiter or strings are null.
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static String join(String delimiter,
		java.util.Collection<?> strings)
	{
		if(delimiter == null || strings == null)
			throw new NullPointerException();
		StringBuilder buffer = new StringBuilder();
		java.util.Iterator<?> it = strings.iterator();
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
	 * @throws NullPointerException if delimiter or strings are null.
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static String join(String delimiter,
		java.util.Enumeration<?> strings)
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
	 * Repeats a string several times.
	 * 
	 * @param str is the string to repeat.
	 * @param times is the number of times to repeat `str`.
	 * @return a new String consisting of `str` repeated specified number of
	 *         times.
	 * @throws IllegalArgumentException if the `str` is null or empty; if
	 *             `times` less than zero.
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static String repeat(String str, int times)
	{
		if(str == null || str.isEmpty() || times < 0)
			throw new IllegalArgumentException("" + str);
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i < times; i++) {
			buffer.append(str);
		}
		return buffer.toString();
	}

	/**
	 * Checks if a string is null or empty.
	 * 
	 * @param str is the string.
	 * @return true if the string is null or empty.
	 * @author Alexey Vaskovsky <http://vaskovsky.net/java-snippets/>
	 */
	public static boolean isEmpty(String str)
	{
		return str == null || str.isEmpty();
	}

	/**
	 * Usage example and minimal unit test.
	 * 
	 * @param args are ignored.
	 */
	public static void main(String[] args)
	{
		assert join(";", new Object[] {"a", "b", "c"}).equals("a;b;c");
		assert repeat("(abc)", 3).equals("(abc)(abc)(abc)");
		assert isEmpty(null) == true;
		assert isEmpty("") == true;
		assert isEmpty(" ") == false;		
		System.out.println("OK Strings");
	}
}
