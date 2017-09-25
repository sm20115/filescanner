/*
Author: Syed Eliyas Bin Feisal Muhammad Abdul Rauf
6962157
Date 09/21/2017
sm20115@email.vccs.edu

using delimiter with file
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

import static java.nio.charset.StandardCharsets.UTF_8;

//class name
public class filescanner {

    public static void main (String [] args) throws FileNotFoundException {//if file isn't found
        int num1,num2,num3;

        //file path
        File file = new File("name.txt");
        Scanner input = new Scanner(file, UTF_8.name());

        //detect delimiter with ","
        input.useDelimiter(Pattern.compile(","));

        //declare num1= "info in file"
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        //calc declared num 1 to 3
        int sum = num1 + num2 + num3;

        //print file contents
        //System.out.println(input.nextInt());//

        System.out.print("The sum of \"" + num1 + "\"");
        //System.out.println(",\"" + input.nextInt() + "\"");
        System.out.print(",\"" + num2 + "\"");
        System.out.print(",\"" + num3 + "\" is " + "\n" + "\t" + sum);

        //System.out.println(input.delimiter());
        input.close();
    }
}
