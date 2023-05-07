import java.io.*;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
 	String masterData = readFileData("masterData.txt");
 	returnFirstSearchResult("Virat Kohli", masterData); 
 	
 }
  
  public static void returnFirstSearchResult(String keyword, String crawledData)
  {
  	String[] results = crawledData.split(keyword);
  	
  	/*for (int i=0; i< results.length;i++)
  	{
  		if(results[i].split("\"")[0].length() > 50 && !(results[i].split("\"")[0].contains("<")) && !(results[i].split("\"")[0].contains("/")) && !(results[i].split("\"")[0].contains("&")))
  		{
  			System.out.println(keyword + " " + results[i].split("\"")[0]);
  		}
  	}*/	
  	
  	
  	System.out.println("Found " + results.length + " Search Results");
  	
  	for (int i=1; i < 3; i++)
  	{
  		System.out.println("Displaying Result # " + i);
  		//getImageURLsArray("<img src=" ,results[i]);
  		urlsArray("<a href=" ,results[i]);
  		try
  		{
  			Thread.sleep(300);
  		}
  		
  		catch(Exception e)
  		{
  		}	
  	}	
  }
  
  //Getting imageUrls from the keyWordArray data
  public static void getImageURLsArray(String keyword, String data)
  {
  	
  	String[] imgUrls = data.split(keyword);
  	
  	int imgArrayLength = imgUrls.length;
  	
  	for (int i=1; i < imgArrayLength; i++)
  	{
  		splitImageURLs("alt=", imgUrls[i]);
  		
  		try
  		{
  			Thread.sleep(300);
  		}
  		
  		catch(Exception e)
  		{
  		}	
  	}	
  }
  
  public static void splitImageURLs(String keyword,String data)
  {
  	String[] separeteImageUrls = data.split(keyword);
  	
  	if(separeteImageUrls[0].length() < 200)
  	{
  		System.out.println(" ======Images===============");
  		System.out.println(separeteImageUrls[0]);	
	}
  }
  
  
  
  
  //getting urls
 
  	
  public static void urlsArray(String keyword, String data)
  {
  	
  	String[] urls = data.split(keyword);
  	
  	int urlsArrayLength = urls.length;
  	
  	for (int i=1; i < urls.length; i++)
  	{
  		splitURLs("class=", urls[i]);
  		
  		try
  		{
  			Thread.sleep(300);
  		}
  		
  		catch(Exception e)
  		{
  		}	
  	}	
  }
  
  		
  public static void splitURLs(String keyword,String data)
  {
  	String[] separeteUrls = data.split(keyword);
  	
  	if(separeteUrls[0].length() < 200)
  	{
  		System.out.println(" ======URLS===============");
  		System.out.println(separeteUrls[0]);	
	}
  }
  
  
   

  
  public static String readFileData(String fileName)
  {
	String data = "";
	int lineCount = 0;
	
	try 
	{
		File myObj = new File(fileName);
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) 
		{
			lineCount++;
			data =  data + myReader.nextLine();
		}
		myReader.close();
	} 
	catch (FileNotFoundException e) 
	{
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
	
	return data;
  }
  
}
