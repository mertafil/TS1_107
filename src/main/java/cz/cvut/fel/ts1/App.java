package cz.cvut.fel.ts1;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println(factorial(4));
    }

    public int factorial(int num) {
        int result = 1;
        int i = 1;

        while (i <= num) {
            result *= i;
            i++;
        }

        return result;
    }
}
