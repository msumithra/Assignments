import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class searchEngine
{
	public static void main(String[] args)
	{
		String masterData = "";
		String[] data = {"https://crickettimes.com/","https://www.espncricinfo.com/","https://www.espncricinfo.com/","https://www.cricbuzz.com/cricket-news/editorial/live-blogs","https://cricketaddictor.com/","https://www.cricwaves.com/cricket/news/articles/","http://www.cricketweb.net/","https://www.thefulltoss.com/","https://www.criclines.com/","https://www.thecricketpaper.com/","https://www.crictracker.com/","https://www.lords.org/lords/news-stories","https://sportzwiki.com/cricket/","https://stumpsandbails.com/","https://www.cricket.com.au/big-bash","https://www.iplt20.com/","https://pslofficial.com/","https://www.sa20.co.za/","http://lpl2022.com/","https://www.cplt20.com/","https://blog.feedspot.com/cricket_blogs/","https://www.cricketcountry.com/articles","https://www.qldcricket.com.au/","https://guildfordcc.com/blog/","https://www.feedspot.com/infiniterss.php?_src=feed_title&followfeedid=5178350&q=site:https%3A%2F%2Fbrokencricketdreams.com%2Ffeed%2F","https://www.staffordshirecricket.co.uk/about/news/","http://womens-cricket.blogspot.com/","https://cricktale.com/","https://www.criclink.com/","https://www.afternic.com/forsale/cricfooty.com?traffic_id=GoDaddy_DLS&traffic_type=TDFS&utm_campaign=TDFS_GoDaddy_DLS&utm_medium=sn_affiliate_click&utm_source=TDFS","https://cricketfanaticsmag.com/","https://www.cricketstoreonline.com/blog/","https://www.cricketstoreonline.com/blog/","http://www.nextwavemultimedia.com/blog/category/cricket-2/","https://skyblogs.in/blog/","https://caughtatpoint.com/","https://caughtatpoint.com/","https://cricnerds.com/","https://www.crickbee.com/"};
		
	for(int i = 0 ;i<data.length ; i++)
	{
		
		try
		{
			masterData = masterData + ContentOfWebsite(data[i]);
		}
		catch(Exception e)
		{
			System.out.println("e.getMessage()");
		}
	}
	System.out.println(masterData.length());
	writeDataToFile(masterData);
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

        } catch (MalformedURLException e) { tg5
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
    		FileWriter myWriter= new FileWriter("searchEngine.txt");
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

