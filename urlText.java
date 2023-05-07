
xml1 = '''<sample>
    <para>This text is sample paragraph with <url>https://www.google.com</url>. Thank you!</para>
</sample>'''

root1 = ET.fromstring(xml1)
para = root1.find('.//para')
print('{} {} {}'.format(para.text, list(para)[0].text, list(para)[0].tail))









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
