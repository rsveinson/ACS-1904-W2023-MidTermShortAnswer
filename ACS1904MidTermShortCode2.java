import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class ACS1904MidTermShortCode2{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner fin = new Scanner(new File("readme.txt"));
        String[] tokens;
        String strin;
        int totalTokens;
        
        totalTokens = 0;
        
        while(fin.hasNext()){
            strin = fin.nextLine();
            tokens = strin.split("[ ,]+");
            totalTokens += tokens.length;
            //System.out.println(strin);
        }//end eof
        
        
        System.out.println(totalTokens);

        System.out.println("end of program");
    }
}
