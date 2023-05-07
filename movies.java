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
    	String moviesData = "";
     String[] movies ={ "https://singavarapu.wordpress.com/2011/07/30/history-of-telugu-cinema/","https://telanganatoday.com/telugu-cinema-penetrating-beyond-regional-boundaries","https://timesofindia.indiatimes.com/entertainment/telugu/movie-reviews" ,"https://www.sunnxt.com/","https://www.zee5.com/movies","https://www.hindustantimes.com/entertainment/telugu-cinema","https://www.allmovie.com/","https://moviesanywhere.com/welcome","http://www.disney.in/","https://telugucinema.com/","Pycker.com","https://en.bharatpedia.org/wiki/Telugu_cinema","https://ww3.1todaypk.pro/","https://5movierulz.mu/","https://www.culturopedia.com/telugu-cinema/","https://www.netflix.com/in/","https://www.hotstar.com/in/home?ref=%2Fin","https://www.similarweb.com/website/einthusan.tv/competitors/","https://www.similarweb.com/website/einthusan.tv/competitors/","https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_b_amazontest_mkw_5bgcvGj1-dc&mrntrk=pcrid_75660303191630_slid__pgrid_1210562788151299_pgeo_116072_x__ptid_kwd-75660529116296:loc-90","https://www.justwatch.com/au/movie/thiruttu-vcd","https://www.indianetzone.com/2/telugu_films.htm","https://ww2.ibomma.tel/telugu-movies/","https://www.zee5.com/","https://www.primevideo.com/ref=atv_br_Telugu_c_9zZ8D2_1_0","https://ww3.1todaypk.pro/","https://en.bharatpedia.org/wiki/Telugu_cinema"};
      
        for (int i=0; i < movies.length; i++)
        {
        	try
        	{
        		moviesData = moviesData + ContentOfWebsite(movies[i]); 	
        	}
        	catch(Exception e)
        	{
        		System.out.println(e.getMessage());
        	}
        }
       
     	writeDataToFile(moviesData);
     	
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
    		FileWriter myWriter= new FileWriter("movie.txt");
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
    
