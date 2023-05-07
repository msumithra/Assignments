import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class urlParsingProgram {
    public static void main(String[] args) {
        String urlPathName = "https://sourceforge.net/projects/jerichohtml/";
        
       	String data = urlParsingProgram.ContentOfWebsite(urlPathName);
       	
       int posStart=0;
       	int posEnd=0;
       	int posCount = 1;
       	
       	posStart = functionParagraphStartPoint(posStart , data);
       	
       	while(posStart!=-1)
       	{
       		posEnd = functionParagraphEndPoint(posEnd , data);
       	
       		if(posEnd == -1)
       		{
       			System.out.println("Bad html code is detected");
       			return;
       		}
       		System.out.println("Paragraphs start here @ : "+ posCount++ );
       		
       		printData(posStart , posEnd ,data);
       		
       		sleep(500);
       		
       		posStart = functionParagraphStartPoint(posStart +3, data);
       		
       		posEnd = functionParagraphEndPoint(posEnd+4 , data);
       		
 
       		
       	}
       	}
  
       	
       	public static void sleep(int milliSeconds)
       	{
       		try
       		{
       			Thread.sleep(500);
       		}
       		catch(Exception e)
       		{
       		}
       	}
       	
   
    public static String ContentOfWebsite(String urlPath){
        String outLine = "";
        try {
            // get URL content
            
            String a = urlPath;
            URL url = new URL(a);
            URLConnection conn = url.openConnection();
 
            // open the stream and put it into BufferedReader
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
    
    //finding paragrapg tag
    public static int functionParagraphStartPoint( int position ,String str)
    {
    		int posStart= -1;
    		
    		while(position <  ( str.length()-3 ) )
    		{
    		
    			if(str.charAt(position) == '<' && str.charAt(position + 1) == 'p' &&str.charAt(position + 2) == '>')
    			{
    				return position + 3;
    			}
    			if(str.charAt(position) == '<' && str.charAt(position + 1) == 'p')
    			{
    				return position+2;
    			}
    			position++;
    		}
    		return posStart;
    }
    public static int functionParagraphEndPoint( int position ,String str)
    {
    		int posEnd= -1;
    		
    		while(position <  ( str.length()-3 ) )
    		{
    		
    			if(str.charAt(position) == '<' && str.charAt(position + 1) == '/' && str.charAt(position + 2) == 'p' && str.charAt(position + 3) == '>')
    			{
    				return position;
    			}
    			position++;
    		}
    		return posEnd;
    }
    	
    	
   public static void printData(int start ,int end, String paragraph)
   {
   		for(int i=start ; i < end ; i++)
   		{
   			System.out.print(paragraph.charAt(i));
   		}
   		System.out.println("");
   }
}
   
   
     

