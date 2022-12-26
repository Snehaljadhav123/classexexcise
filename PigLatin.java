//converting pig latin word..

//import java.util.Scanner;
public class PigLatin {
     

        public static void main(String[] args) {
            String input = "piglatin";
		     char one = input.charAt(0);
             String ostr = input.substring(1);
             ostr = ostr + one+"ay";
            System.out.println("Input: " + input);
            System.out.println("Output: " + ostr);
        
    
    }
    
}
