package Exercise5;

public class TestAuthor {

	public static void main(String[] args) {

		Author author = new Author("Bret spell", "Bspell@nowhere.com", 'm');
		System.out.println(author);

		author.setEmail("junbo@nowhere.com");
		System.out.println("name is: " + author.getName());
		System.out.println("email is: " + author.getEmail());
		System.out.println("Gender is: " + author.getGender());
	}

}
