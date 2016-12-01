
/*
Read in a word and display the number of vowels in the word. The data is terminated by a line that only contains END.
A vowel is the letter (either upper or lower case) 'a', 'e', 'i', 'o' or 'u'.

*/
class UglyVocalReader {

    public static void main(String[] args) {

        String input = System.console().readLine();

        while(!input.equals("END")){
            int vowels = 0;
            String currentChar;
            for(int i=0; i<input.length(); i++){
                currentChar = input.charAt(i)+"";
                if(currentChar.matches("[aeiou]")){
                    vowels++;
                }
            }
            System.out.println("vowels: "+vowels);
            input = System.console().readLine();
        }
    }
}