interface Book{
	public void BookDetails();
}

interface HistoryBook{
	public void HisBookDetails();
}

public class multiple2 implements Book, HistoryBook {

	@Override
	public void BookDetails(){
		System.out.println("It is a book");
	}
	
	@Override
	public void HisBookDetails() {
		System.out.println("It is a history book");
	}
	public static void main(String[] args) {
		
		multiple2 m1 = new multiple2();
		m1.BookDetails();
		m1.HisBookDetails();
	}

}