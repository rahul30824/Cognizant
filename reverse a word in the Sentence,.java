class Main
{
public static String Solution(String str)    
{
   String[] word=str.split("\\s+");
   StringBuilder result=new StringBuilder();
   
   for(int i=word.length-1;i>=0;i--)
   {
       result=result.append(word[i]+" ");
   }
return result.toString();
}
public static void main(String[] args)
{
    String str="iam software Developer";
    System.out.print(Solution(str));
}
}
