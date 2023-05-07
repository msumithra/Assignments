import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class urlParsingProgram {
            // open the stream and put it into BufferedReader
    public static void main(String[] args) {
        String urlPathName = "https://sourceforge.net/projects/jerichohtml/";
        String urlPathName1 = "https://crickettimes.com/";
        String urlPathName2 = "https://www.espncricinfo.com/";
        String urlPathName3 = "https://www.espncricinfo.com/";
        String urlPathName4 = "https://www.cricbuzz.com/cricket-news/editorial/live-blogs";
        String urlPathName5 = "https://cricketaddictor.com/";
        String urlPathName6 = "https://www.cricwaves.com/cricket/news/articles/";
        String urlPathName7 = "http://www.cricketweb.net/";
        String urlPathName8 = "https://www.thefulltoss.com/";
        String urlPathName9 = "https://www.criclines.com/";
        String urlPathName10 = "https://www.thecricketpaper.com/";
        String urlPathName11 = "https://www.crictracker.com/";
        String urlPathName12 = "https://www.lords.org/lords/news-stories";
        //String urlPathName13 = "https://betting.betfair.com/cricket/";
        
        
       	String data = urlParsingProgram.ContentOfWebsite(urlPathName);
       	String data1 = urlParsingProgram.ContentOfWebsite(urlPathName1);
       	String data2 = urlParsingProgram.ContentOfWebsite(urlPathName2);
       	String data3 = urlParsingProgram.ContentOfWebsite(urlPathName3);
       	String data4 = urlParsingProgram.ContentOfWebsite(urlPathName4);
       	String data5 = urlParsingProgram.ContentOfWebsite(urlPathName5);
       	String data6 = urlParsingProgram.ContentOfWebsite(urlPathName6);
       	String data7 = urlParsingProgram.ContentOfWebsite(urlPathName7);
       	String data8 = urlParsingProgram.ContentOfWebsite(urlPathName8);
       	String data9 = urlParsingProgram.ContentOfWebsite(urlPathName9);
       	String data10 = urlParsingProgram.ContentOfWebsite(urlPathName10);
       	String data11= urlParsingProgram.ContentOfWebsite(urlPathName11);
       	String data12 = urlParsingProgram.ContentOfWebsite(urlPathName12);
       	//String data13 = urlParsingProgram.ContentOfWebsite(urlPathName13);
     	
       	String resultData = data +data1 +"\n"+"11111111111111111111111111111111111111111"+ data2 +"\n"+"11111111111111111111111111111111111111111"+"\n"+ data3 +"\n"+"11111111111111111111111111111111111111111"+ "\n"+data4 +"\n"+ "11111111111111111111111111111111111111111"+"\n" +data5 +"\n"+"11111111111111111111111111111111111111111"+"\n"+ data6 +"11111111111111111111111111111111111111111"+ "\n"+data7 +"11111111111111111111111111111111111111111"+"\n"+ data8 + "11111111111111111111111111111111111111111"+"\n"+data9 +"\n"+ "11111111111111111111111111111111111111111"+"\n"+data10 + "\n"+  "11111111111111111111111111111111111111111"+"\n"+ data11 + "11111111111111111111111111111111111111111"+"\n"+  data12 + "\n"+ "11111111111111111111111111111111111111111"+"\n";
       	
       	System.out.println(resultData.length());
       	//System.out.println(resultData);
       	
       	
       	//System.out.println(writeDataToFile(resultData));
       	writeDataToFile(resultData);
       	
       	
 }
   
    public static String ContentOfWebsite(String urlPath){
        String outLine = "";
        try {
            // get URL content
            
            String a = urlPath;
            URL url = new URL(a);
            URLConnection conn = url.openConnection();
 
            BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));
 
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                outLine += inputLine.trim();
            }
            br.close();

        } catch (MalformedURLException e) { 
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outLine;
    }
    

    
    public static void writeDataToFile(String str)
    {
    	try
    	{
    		FileWriter myWriter= new FileWriter("masterData.txt");
    		myWriter.write(str);
    		myWriter.close();
    		System.out.println("Successfully code added to the file");
    	}
    	catch (IOException e)
    	{
    		System.out.println("An error occured.");
    		e.printStackTrace();
    	}
    }
}
    
  
   
     

