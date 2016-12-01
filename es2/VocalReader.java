
/*
Read in a word and display the number of vowels in the word. The data is terminated by a line that only contains END.
A vowel is the letter (either upper or lower case) 'a', 'e', 'i', 'o' or 'u'.

*/
class VocalReader {

    public static void main(String[] args) {
        String input = readInput();
        while(!isEnd(input)){
            System.out.println("vowels: "+countVowels(input));
            input = readInput();
        }      
    }

    public static String readInput()        { return System.console().readLine();     }
    public static boolean isEnd(String str) { return str.equals("END");               }
    public static boolean isVowel(String str)   { return  str.matches("[aeiou]"); }
    public static int countVowels(String string){
        int vowels = 0;
        String currentChar;
        for(int i=0; i<string.length(); i++){
            currentChar = string.charAt(i)+"";
            if(isVowel(currentChar)){
                vowels++;
            }
        }
        return vowels;
    }

}