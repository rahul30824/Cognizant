class Main
{
public static void solution(String str)
    {
        String str1="";
for(int i=0;i<=str.length();i++)
{
        str1=str.substring(0,i);
        System.out.println(str1);
}
    }
public static void main(String[] args)
{
   String str="rahul";
   Main sol=new Main();
   sol.solution(str);
}
}
