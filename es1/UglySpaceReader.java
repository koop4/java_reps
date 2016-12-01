
/*
Write an application that reads in lines of text and returns the number of spaces in each line.
The input to the Java application is terminated with a line of text that contains just the text END.
*/
class UglySpaceReader {

    public static void main(String[] args) {

        String input = System.console().readLine();

        while(!input.equals("END")){
            int spaces = 0;
            char currentChar;
            for(int i=0; i<input.length(); i++){
                currentChar = input.charAt(i);
                if(currentChar == ' '){
                    spaces++;
                }
            }
            System.out.println("spaces: "+spaces);
            input = System.console().readLine();
        }

    }
    
}