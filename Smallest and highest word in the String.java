class Main
{
public static String Solution(String str)    
{
    String[] word=str.split("\\s+");
   String min=word[0];
   String max=word[0];
for(int i=0;i<word.length;i++)
{
    if(word[i].length()<min.length())
    {
        min=word[i];
    }
    if(word[i].length()>min.length())
    {
        max=word[i];
    }

}
return max;
}
public static void main(String[] args)
{
    String str="iam software Developer";
    System.out.print(Solution(str));
}
}
