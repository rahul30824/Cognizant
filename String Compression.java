class Main
{
public static String  Solution(String str)  
{
    StringBuilder result=new StringBuilder();
    for(int i=0;i<str.length();i+=2)
    {
        char ch=str.charAt(i);
        int count=str.charAt(i+1)-'0';
        for(int j=0;j<count;j++)
        {
            result.append(ch);
        }
    }
    return result.toString();
}
public static void main(String[] args)
{
    String str="a3b4g5";
   System.out.print(Solution(str));
    
}
}
