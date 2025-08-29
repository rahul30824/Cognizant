class Main
{
public static void Palindrome(int n)
{
    int org=n;
    int reversed=0;
    while(n!=0)
    {
        int digit=n%10;
         reversed=reversed*10+digit;// are you Understand Rahul what is happening here!
        // 1)here reversed is the act like a storing device once we use this int digit=n%10 the last digit got pop up
        // 2)int reversed=0 right initially so the poped up element is now added in the reversed Storage
       //  3)why you multiply by 10 because 
              // in this case 151
                   // 1 poped by added to the revesed
                    // we should multiply the 3 into 10 to became 31
                      // after 5 pop by added to the reversed became 35 
                       // next multiply by 10 became 350
                        // add the 1 to the element became 351
                          // so 153=351
                           // so Palindrome okay/////
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
