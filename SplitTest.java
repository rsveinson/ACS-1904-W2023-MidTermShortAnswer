import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class SplitTest{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        
        String st = "hello2world@ [bee!bop]alo~ola+blah";
        String[] tokens;
        tokens = st.split("[!-@ \\[-` \\{-~]+");
        System.out.println(tokens.length);
        for(String s : tokens)
            System.out.print(s);
        
        

        System.out.println("end of program");
    }
}
