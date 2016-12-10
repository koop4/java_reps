
/*
* Read in a word and tells if its writte in ascending order.
* It is said of any word whose letters are alway greater than the previous 
* E.G.  
* Abc -> ascending
* alt -> ascending 
* zoo -> not ascending
*/
class AscendingOrder {

    public static void main(String[] args) {

        System.out.println("inserisci una parola");
        String input = System.console().readLine();
        boolean isAscending = true;
        for(int i=0; i<input.length()-1; i++){
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i+1);
            if(currentChar >= nextChar){
                isAscending = false;
                break;
            }
        }
        
        String isOrNot = "is ";
        if(!isAscending) {
            isOrNot +="not ";
        }

        System.out.println("the word"+ " \""+input+"\" "+ isOrNot+ "ascending");
    }
}