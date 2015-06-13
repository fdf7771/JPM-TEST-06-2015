package exercise.library;

public class BookNotFoundException extends Exception
{
	/**
	 * Custom exception class
	 */
	private static final long serialVersionUID = 6886495085462342259L;

	public BookNotFoundException(String message) {
        super(message);
    }
	
	public BookNotFoundException(Throwable cause)
	{
		super(cause);
	}

	public BookNotFoundException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
