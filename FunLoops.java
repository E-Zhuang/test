
/**
 * Working class with methods for reversing an integer, printing "magical" squares 
 * (squares that are equal to the consecutive addition of previous integers), and 
 * the least common multiple.
 */
public class FunLoops
{
    int numSquares, numPrintSqs, test, add, reversing, num1, num2, lCM, multiple, ones, tens, hundreds, thousands, hunThousands, thouThousands, steps, base;
    long consecutive, num;
    double quotient1, quotient2;
    
    public FunLoops()
    {
       numPrintSqs = 1;
       test = 1;
       consecutive = 0;
       add = 0;
       reversing = 0;
       num1 = 1;
       num2 = 1;
       lCM = 1;
       multiple = 0;
       num = 0;
       steps = 0;
       base = 10;
    }
    
    
    /**
     * This method continuously adds consecutive numbers until it passes or equals the value of the squared value. 
     * If the sum of the consecutive numbers is equal to the square, the method prints the value of the power. 
     * It will increase the value of how many squares were printed so you can print a specified number of magic squares.
     */
    public void magicsquares(int n)
    {
        numSquares = n;
        
        while (numSquares >= numPrintSqs)
        {
            
                while (Math.pow(test, 2) >= consecutive)
                {
                    add++;
                    consecutive += add;
                    
                    if (Math.pow(test,2) == consecutive)
                    {
                        System.out.println((long)Math.pow(test,2));
                        numPrintSqs++;
                    }
                }
            test++;
        }
    }
    
    /**
     * This method reverses the value of the integer by using % to determine how many of each place value there
     * is and by printing each value consecutively. 
     */
    public void reverse(long number)
    {
        num = number;
        ones = 0;
//         tens = 0;
//         hundreds = 0;
//         thousands = 0;
//         hunThousands = 0;
//         thouThousands = 0;
        base = 10;
        
        while (num > 0)
        {
            while (num % base != 0)
            {
                num -= base / 10;
                ones++;
            }
            System.out.print(ones);
            base *= 10;
            ones = 0;
        }
//         if (num >= 10)
//         {
//             while (num % 100 != 0)
//             {
//                 num -= 10;
//                 tens++;
//             }
//             System.out.print(tens);
//             if (num >= 100)    
//             {
//                 while (num % 1000 != 0)
//                 {
//                     num -= 100;
//                     hundreds++;
//                 }   
//                 System.out.print(hundreds);
//                 if (num >= 1000)
//                 {
//                     while (num % 10000 != 0)
//                     {
//                         num -= 1000;
//                         thousands++;
//                     }
//                     System.out.print(thousands);
//                     if (num >= 10000)
//                     {
//                         while (num % 100000 != 0)
//                         {
//                             num -= 10000;
//                             hunThousands++;
//                         }
//                         System.out.print(hunThousands);
//                         if(num >= 100000)
//                         {
//                             while (num % 1000000 != 0)
//                             {
//                                 num -= 100000;
//                                 thouThousands++;
//                             }
//                             System.out.print(thouThousands);
//                         }
//                     }
//                 }        
//             }
//         }
    }
    
    /**
     * This method calculates the least common multiple by starting at x * y and subtracting by x with each repetition.
     * It then tests to see if y can be divided into the resulting value. If y can be divided evenly into the 
     * resulting value, it redefines the value of the least common multiple.
     */
    public void lcm(int x, int y)
    {        
        steps = 1;
        lCM = x * y;
        multiple = lCM;
        while (steps < y)
        {
            steps++;
            multiple -= x;
            if (multiple % y == 0)
                lCM = multiple;
        }
        System.out.println(lCM);
          
        //lCM = 1;
        //while (lCM % y != 0)
        //{
        //if (lCM == 1)
        //    lCM += x - 1;
        //else
        //    lCM += x;
        //}
        //    System.out.println(lCM);
    }
}
