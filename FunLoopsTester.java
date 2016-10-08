
/**
 * This class can calculate magic squares, reverse integers, and calculate least common multiple.
 * 
 * Emily Zhuang
 * APCS:Period 4
 * Mr. Lantsberger
 * 3 October 2016
 */

import chn.util.*;

public class FunLoopsTester
{
    /**
     * Here is the main() method
     * 
     */
    public static void main(String[] args)
    {
        //declares and instantiates variables
        ConsoleIO keyboard = new ConsoleIO();
        FunLoops funloops = new FunLoops();
        
        int numMagicSquares, num, x, y, lCM;
        
        //prompts and prints designated magic squares
        System.out.print("How many magic squares would you like to print? ");
        numMagicSquares = keyboard.readInt();
        funloops.magicsquares(numMagicSquares);
        System.out.println();
        
        //prompts the user for an integer to reverse
        //System.out.println("Enter integer you would like to reverse: ");
        //num = keyboard.readInt();
        //funloops.reverse(num);
        //System.out.println();
        
        //reverses the integers
        System.out.print("12345 reversed ---> "); 
        funloops.reverse(12345);
        System.out.println();
        System.out.print("10001 reversed ---> ");
        funloops.reverse (10001);
        System.out.println();
        System.out.print("1200 reversed ---> ");
        funloops.reverse (1200);
        System.out.println();
        System.out.print("5 reversed ---> ");
        funloops.reverse (5);
        System.out.println();
        
        //prompts user for two values to calculate the least common multiple
        //System.out.print("Enter two integers to find the LCM: ");
        //x = keyboard.readInt();
        //y = keyboard.readInt();
        //lCM = funloops.lcm(x, y);
        //System.out.println(lCM);
        //System.out.println();
        
        //calculates the least common multiple
        System.out.println();
        System.out.print("LCM (15,18) = ");
        funloops.lcm(15,18);
        System.out.print("LCM (40,12) = ");
        funloops.lcm(40,12);
        System.out.print("LCM (2,7) = ");
        funloops.lcm(2,7);
        System.out.print("LCM (100,5) = "); 
        funloops.lcm(100,5);

    }
}
