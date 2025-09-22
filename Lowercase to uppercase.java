class Main
{
public static String Solution(String str) 
{
    StringBuilder result= new StringBuilder();
    for(char num:str.toCharArray())
    {
        char ch=num;
        if(Character.isUpperCase(ch))
        {
            result.append(Character.toLowerCase(ch));
        }
        if(Character.isLowerCase(ch))
        {
            result.append(Character.toUpperCase(ch));
        }
    }
    return result.toString();
}
public static void main(String[] args)
{
  String str="RaGuLRaMs";
  System.out.print(Solution(str));
}
