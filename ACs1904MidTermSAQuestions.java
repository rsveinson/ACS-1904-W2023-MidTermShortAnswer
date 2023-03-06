import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
 */

public class ACs1904MidTermSAQuestions{
    public static void main(String[] args)throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        /* **** q1 **** */

        // int[] list = new int[10];
        // list[0] = 1;
        // list[1] = 1;

        // for(int i = 2; i < 10; i++)
        // list[i] = list[i - 1] + list[i - 2];

        // System.out.println(list[5]);

        // for(int i = 0; i < 10; i++)
        // System.out.println(list[i]);        

        // /* **** Q2 and Q3 ***** */
        // int a =5;
        // int b = 5;
        // int[][] t = new int[a][b];
        // for(int i = 0; i < a; i++)
            // for(int j = 0; j < b; j++)
                // t[i][j] = i + j;

        // for(int i = 0; i < a; i++){
        // for(int j = 0; j < b; j++)
        // System.out.print(t[i][j] + "\t");

        // System.out.println();
        // }

        // // check adjacent cells

        // int r = 3;
        // int c = 2;
        // int count = 0;
        // for(int i = (r - 1); i < (r + 2); i++){
            // for(int j = (c - 1); j < (c + 2); j++){
                // if(t[r][c] == t[i][j]) 
                    // count++;
            // }// end for int j
        // }// end for int i

        // System.out.println(count);

        // find the sum of the nth line
        // int n = 2;
        // int i = 0;

        // int sum = 0;
        // for(int j = 0; j < t[n].length; j++)
        // sum += t[i][j];

        //System.out.println(sum);
        /* **** Q4 **** */

        // String strin = "To boldly go where no one has gone before";
        // String tokens[] = strin.split(" +");
        // StringBuilder sb = new StringBuilder();
        // sb.append(tokens[6] + " " + tokens[1] + " " + tokens[3]);
        // System.out.println(sb.toString());

        /* **** Q5 **** */

        // char ch = scanner.next().charAt(0);
        // int n = scanner.nextInt();

        // assert ch == 'C' && n >= 18 : "Input out of range";

        /* *** Q6 *** */
        // MidTermDifficulty mid = MidTermDifficulty.EASY;

        // System.out.println(mid.getDifficulty());

        // short codding find matches in two lists
        // final int MAX = 100;

        // //int[] list1 = new int[MAX];
        // //int[] list2 = new int[MAX];

        // int[] list1 = {1, 2, 3, 4, 5, 6};
        // int[] list2 = {1, 2, 3, 4, 5};

        // int numberOfErrors = countErrors(list1, list2);
        // System.out.println(numberOfErrors);

        System.out.println("end of program");
    }

    public static int countErrors(int[] l1, int[]l2){
        int errors = 0;
        boolean valid = l1.length == l2.length;
        if(!valid){
            throw new IllegalArgumentException("Incompaitlbe lists");
        }// end if

        for(int i = 0; i < l1.length; i++){
            if(l1[i] != l2[i])
                errors++;
        }
        return errors;
    }// end countErrors
}
