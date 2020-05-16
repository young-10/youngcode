package code.young.bean;


public class book {
	private String bookName;
	private String author;
	public void myInit(){
		System.out.println("这是图书的初始化方法");
	}
	public void myDestory(){
		System.out.println("这是图书的销毁方法");
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public book() {
		System.out.println("book被创建");
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "book [bookName=" + bookName + ", author=" + author + "]";
	}
	
}
