class Main
{
public static boolean Palindrome(String s)
{
int start=0;
int end=s.length()-1;
while(end>start)
{
    if(s.charAt(start)!=s.charAt(end))
    {
        return false;
    }
    start++;
    end--;
}
return true;
}
public static void main(String[] args)
{
    String sample="racecars";
    System.out.print(Palindrome(sample));
}
}
