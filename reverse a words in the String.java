class Main
{
public static String  Solution(String str)    
{
    StringBuilder result=new StringBuilder();
    String[] words=str.split("\\s+");
    for(int i=words.length-1;i>=0;i--)
    {
        result.append(words[i]).append(" ");
    }
    return result.toString();
    
}       
public static void main(String[] args)
{
    String str="iam a java developer";
    System.out.print(Solution(str));
    
}
}
