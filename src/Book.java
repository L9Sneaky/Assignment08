
public class Book {
	public int ISBN;
	public String author;
	public String title;
	public String genre;

	public String generateReference() {
		String t = (author.charAt(0) + author.charAt(1) + "-" + genre.charAt(0) + genre.charAt(1));
		return t;
	}

	public boolean verifyISBN(int ISBN) {
		char n1, n2, n3, n4;
		boolean v;
		 ISBN = this.ISBN;
		 int f = ISBN;
			n4 = (char) (f % 10);
			f /= 10;
			n3 = (char) (f % 10);
			f /= 10;
			n2 = (char) (f % 10);
			f /= 10;
			n1 = (char) (f % 10);

			v = (n1 * 3 + n2 * 2 + n3 * 1) % 4 == n4;

		return v;
	}

	public String toString() {

		String v = ("Title:	" + title + "\nAuthor:	" + author + "\nISBN:	" + ISBN + " - Reference Code :  "
				+ generateReference() + "\nGenre:	" + genre);
		return v;
	}



}
