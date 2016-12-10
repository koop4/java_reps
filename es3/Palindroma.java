
/*
* Read in a word and tells if its a palindrome.
* Is defined palindrome any word or sentence that can be read backwords withouth changing. 
E.G.  
Anna 

Ossesso
*/
class Palindroma {

    public static void main(String[] args) {

        System.out.println("inserisci una parola o una frase");
        String input = System.console().readLine();
        boolean isPalindrome = true;

        for(int i=0; i<=(input.length()/2); i++){
            char currentChar = input.charAt(i);
            int indexMirror = input.length()-(1+i);
            char mirrorChar = input.charAt(indexMirror);
            if(currentChar != mirrorChar){
                isPalindrome = false;
                break;
            }
        }
        
        String isOrNot = "is ";
        if(!isPalindrome) {
            isOrNot +="not ";
        }

        System.out.println("the word"+ " \""+input+"\" "+ isOrNot+ "palindrome");
    }
}