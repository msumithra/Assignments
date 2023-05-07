import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.*;



class main
{
   public static void main(String[] args) 
    {  
     	String librarayDirectory = "/home/jtbb/Desktop/Library/Books";
     	File directoryPath = new File(librarayDirectory);
        String[] books = directoryPath.list();
       	System.out.println(isBookPresent("book5.pdf" , books));
        //moveFile("/home/jtbb/Desktop/Library/Books/book1.pdf","/home/jtbb/Desktop/Library/bindhu/book1.pdf");
        System.out.println(returnBookToLibrary("" , books));
    }
    
    //to getting all the books data/
  public static String booksData(String[] allBooks)
  {
  	String addBooks = "";
   	for(int i =0 ;i < allBooks.length ; i++ )
   	{
   		addBooks = addBooks + allBooks[i] + "\n";
   	} 
   	return addBooks;    
  } 
  
 public static boolean moveFile(String bookToMove, String targetPath) {

    	Path p = Paths.get(bookToMove);
	Path q = Paths.get(targetPath);

	try
	{
		Files.move(p, q);
	}
	catch(Exception e)
	{
		//e.printStackTrace();
		return false;
	}
	
    	return true;
}
//public static boolean isBookPresent(String book, String[] books)

{
int count = 0;
	for(int i = 0; i< books.length ;i++ )
	{
		if(book.equals(books[i]))
		{
			moveFile("/home/jtbb/Desktop/Library/Books/book4.pdf","/home/jtbb/Desktop/Library/sirisha/book4.pdf");
			return true;
		}
        }
        return false;
}

//to return the book which is borrowed
public static boolean returnBookToLibrary(String book, String[] books)
{
	for(int i = 0; i< books.length ;i++ )
	{
		if(book.equals(books[i]))
		{
			//moveFile("/home/jtbb/Desktop/Library/sirisha/book3.pdf", "/home/jtbb/Desktop/Library/Books/book3.pdf");
			//System.out.println("Successfully book is returned by directory");
			return true;	
		}
	}
        return false;
}


}















