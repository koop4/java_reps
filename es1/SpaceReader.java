
/*
Write an application that reads in lines of text and returns the number of spaces in each line.
The input to the Java application is terminated with a line of text that contains just the text END.
*/
class SpaceReader {

   public static void main(String[] args) {
        String input = readInput();
        while(!isEnd(input)){
            System.out.println("spaces: "+countSpaces(input));
            input = readInput();
        }
    }

    public static String readInput()        { return System.console().readLine(); }
    public static boolean isSpace(char c)   { return c == ' ';                    }
    public static boolean isEnd(String str) { return str.equals("END");           }
    public static int countSpaces(String string){
        int spaces = 0;
        char currentChar;
        for(int i=0; i<string.length(); i++){
            currentChar = string.charAt(i);
            if(isSpace(currentChar)){
                spaces++;
            }
        }
        return spaces;
    }

}