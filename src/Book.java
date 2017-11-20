
public class Book {
	public int ISBN;
	public String auther;
	public String title;
	public String genre;
	
	
	
	public String generateReference() {
		String t;
		if(verifyISBN(ISBN) == true) {
		t = (auther.charAt(0) + auther.charAt(1) + "-" + genre.charAt(0)+ genre.charAt(1));
		}else {
		t = "Invalid ISBN";
		}
		return t;
	}
	
	public boolean verifyISBN(int a) {
		int n1 = 0 , n2 = 0 , n3 = 0 , n4 = 0;
		boolean	v;
		ISBN = a;
		if((int) Math.log(ISBN)==3) {
			n4 = a%10;
			a/=10;
			n3 = a%10;
			a/=10;
			n2 = a%10;
			a/=10;
			n1 = a%10;
			v =(n1 * 3 + n2 * 2 + n3 *1)%4 == n4;
		}else 
		v = false;
		return v;
	}
	
	public void tostring() {
		System.out.println("Title:	" + title);
		System.out.println("Author:	" + auther);
		System.out.println("ISBN:	" + ISBN + " - Reference Code :  " + generateReference());
		System.out.println("Genre:	" + genre);
		
	}
}
