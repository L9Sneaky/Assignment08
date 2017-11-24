import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Book b = new Book();
		Scanner i = new Scanner(System.in);

		System.out.println("Please, enter the book details #ISBN , author, title , and genre. ");
		b.ISBN = i.nextInt();
		b.author = i.next();
		b.title = i.next();
		b.genre = i.next();

		if (b.verifyISBN(b.ISBN)) {
			System.out.println(b.toString());
		} else
			System.out.println("Invalid ISBN");
	}
}
