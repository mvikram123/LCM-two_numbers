//find Lcm of only two numbers
// find gcd of two numbers

public class Main
{
    // Recursive method to return gcd of a and b
    //calculate gcd of only two no.
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 15, b = 20;
        System.out.println("LCM of " + a +
                " and " + b +
                " is " + lcm(a, b));
         System.out.println("gcd of " + a +
                " and " + b +
                " is " + gcd(a, b));
        
    }
}
//output : LCM of 15 and 20 is 60
 //          gcd of 15 and 20 is 5

