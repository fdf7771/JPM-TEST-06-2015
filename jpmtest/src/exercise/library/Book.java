package exercise.library;

public class Book
{
    private String isbn;
    private String title;
    private String description;

    public Book(String isbn, String title, String description)
    {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
    }

    public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getDescription()
    {
        return description;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getTitle()
    {
        return title;
    }
}
