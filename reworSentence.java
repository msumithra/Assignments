// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        
        String paragraph="There are different sentences in a paragraph. The para always starts with capital letter. And it always end with full stop. The sentence. There are different sentences in a paragraph. The para always starts with capital letter. And it lways end with full stop. The sentence.";
        
        int sentencesWithWordCountgt6=0;
        int sentenceStart=0;
        int endSentence=findEndOfSentence(0,paragraph);
        System.out.println(sentenceStart + " : " +  endSentence);

        while(endSentence!=-1){
            int wordCount=findWordCount(sentenceStart,endSentence,paragraph);
            if(wordCount>6){
                sentencesWithWordCountgt6++;
            }
            sentenceStart=endSentence+1;
            endSentence=findEndOfSentence(sentenceStart,paragraph);
            System.out.println(sentenceStart + " : " +  endSentence);
        }
        
         System.out.println("Sentences with words greater than 6 is equal to  " + sentencesWithWordCountgt6);
        
        
    }
    
    public static int findEndOfSentence(int sentenceStart,String paragraph){
        if(sentenceStart >= paragraph.length()){
            return -1;
        }
        int endSentence=sentenceStart;
        while(paragraph.charAt(endSentence)!='.'){
            endSentence++;
        }
        return endSentence;
    }
    public static int findWordCount(int sentenceStart,int endSentence,String paragraph){
        int wordCount=0;
        
        if(sentenceStart == 0)
        {
            wordCount = 1;
        }
        
        for(int i=sentenceStart;i<endSentence;i++){
            if(paragraph.charAt(i)==' '){
                wordCount++;
            }
        }
        return wordCount;
    }

}
