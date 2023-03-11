/*
Input Format
Every line of input will contain a String followed by an integer. 
Each String will have a maximum of 1010 alphabetic characters, and each integer will be in the inclusive range from 00 to 999999.
Output Format
In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly 1515 characters. 
The second column contains the integer, expressed in exactly 33 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
Sample Input
java 100
cpp 65
python 50
Sample Output
================================
java           100 
cpp            065 
python         050 
================================
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-14s %03d\n", s1, x);
            }
            System.out.println("================================");

    }
}

/*
System.out.printf(): This is a method of the System.out object that allows you to print formatted output to the console.

"%-14s %03d\n": This is a format string that specifies the format of the output. 
It contains two placeholders for the values to be printed: %s for a string and %d for an integer. 
The -14 and 03 are formatting options that specify the minimum width and precision of the printed values. 
The - in -14 left-aligns the string and the 0 in 03 pads the integer with zeros on the left. 
The \n at the end of the string is a newline character that moves the cursor to the next line after printing.

s1 and x: These are the values to be printed in place of the placeholders in the format string.

So, the printf() method formats the values of s1 and x as a string and an integer, respectively, and prints them to the console. The string is left-aligned and padded with spaces to a minimum width of 14 characters, and the integer is padded with zeros to a minimum width of 3 digits. Finally, a newline character is added to move the cursor to the next line.
*/



