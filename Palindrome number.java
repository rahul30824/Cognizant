class Main
{
public static void Palindrome(int n)
{
    int org=n;
    int reversed=0;
    while(n!=0)
    {
        int digit=n%10;
         reversed=reversed*10+digit;
        n=n/10;
    }
    if(org==reversed)
    {
        System.out.print("Palindrome");
    }
    else
    {
        System.out.print("Not a Palindrome");
    }
}
public static void main(String[] args)
{
    int n=151;
    Main sol=new Main();
    Palindrome(n);
}
}
