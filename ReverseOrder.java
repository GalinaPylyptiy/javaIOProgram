package ioStreams.myIOProgram;

public class ReverseOrder {

   public static String reverseWordOrder(String sample){
     String[] words = sample.split(" ");
     String reverse ="";
     for(int i = words.length-1; i >= 0; i--){
         reverse = reverse.concat(words[i]+" ");
     }
     return reverse;
    }

    public static String reverseLettersOrder(String sample){
      char[] letters = sample.toCharArray();
      char[] reverse = new char[letters.length];
      int j = 0;
      for(int i = letters.length-1;i>=0; i-- ){
          reverse[j] = letters[i];
          j++;
      }
      String result = new String(reverse);
      return result;
    }

    public static boolean isPalindrome(String sample){
        sample = sample.replaceAll("\\s", "");
        StringBuilder builder = new StringBuilder(sample);
        String reverseString = builder.reverse().toString();
        if (reverseString.equalsIgnoreCase(sample)){
            return true;
        }
        return false;
    }

}
