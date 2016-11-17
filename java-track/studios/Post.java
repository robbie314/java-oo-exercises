import java.util.Date;

public class Post extends Entity {

	private String body;
	private String title;
	private User author;
	private final Date created = new Date();
	private Date modified;

	public Post(String title, String body, User author) {
		super();
		this.title = title;
		this.body = body;
		this.author = author;
		
	}

}
