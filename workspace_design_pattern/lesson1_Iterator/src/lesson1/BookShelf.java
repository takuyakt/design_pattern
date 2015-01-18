package lesson1;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{

	//private Book[] books;
	private List<Book> books;
	private int last = 0;
	public BookShelf(){
		this.books = new ArrayList<Book>();
	}
	public Book getBookAt(int index){
		return books.get(index);
	}
	public void appendBook(Book book){
		this.books.add(book);
		last++;
	}
	public int getLength(){
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
