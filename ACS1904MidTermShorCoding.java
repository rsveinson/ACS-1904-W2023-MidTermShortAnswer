import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class ACS1904MidTermShorCoding{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        
        // String st = "Winter is coming";
        // char key = 'x';
        // char[] ch = st.toCharArray();
        // int found;
        
        // Arrays.sort(ch);
        // found = Arrays.binarySearch(ch, key);
        // System.out.println(found);
        String strin = "1 2 3 4 5 6 7 8";
        luckyNumbers(strin);

        System.out.println("end of program");
    }
    
    public static void luckyNumbers(String n){
        String[] t = n.split(" +");
        if(t.length != 7)
            throw new IllegalArgumentException("You need 7 lucky numbers");
    }
}
