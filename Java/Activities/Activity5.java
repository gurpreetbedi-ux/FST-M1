package activities;

	
	abstract class Book {
		String title;
		public abstract void setTitle(String s);
		public String getTitle()
		{
			return title;
			
		}
	}
class MyBook extends Book
{
	public void setTitle(String s)
	{
		title = s;
	}
}

public class Activity5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyBook myBook = new MyBook ();
myBook.setTitle("Java Basics Book");
System.out.println("" + myBook.getTitle());

	}

}
