import java.util.Arrays;
class Main
{
public static boolean Solution(String s1,String s2)
{
int n=s1.length();
char[] arr1=new char[n];
char[]arr2=new char[n];
int i=0;
int j=0;
for(char num:s1.toCharArray())
{
    arr1[i++]=num;
}
for(char num:s2.toCharArray())
{
    arr2[j++]=num;
}
Arrays.sort(arr1);
Arrays.sort(arr2);
return Arrays.equals(arr1,arr2);
}
public static void main(String[] args)
{
    String s1="listen";
    String s2="silent";
    System.out.print((Solution(s1,s2)));
}
}
