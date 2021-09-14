public class Main
{

    public static void main(String[] args)
    {
	    printFactors(32);
    }

    public static void printFactors(int x)
    {
        if(x<1)
        {
            System.out.println("Invalid Value");
        }
        for(int i = x; i>0; i--)
        {
            if(x%i==0)
            {
                System.out.println("factor of " + x + " and " + i + " = " + (x/i));
            }
        }
    }


}
