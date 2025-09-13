import java.util.Arrays;
class Main
{
public static void  Solution(String str)    
{
    int freq[]=new int[256];
    for(int i=0;i<str.length();i++)
    {
        freq[str.charAt(i)]++;
    }
   for(int i=0;i<freq.length;i++)
  if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
}
public static void Solution2(int[] array)
{
    int[] freq=new int[26];
    for(int num:array)
    {
        freq[num]++;
    }
    for(int i=0;i<freq.length;i++)
    {
        if(freq[i]>0)
        {
            System.out.println(i+"->"+freq[i]);
        }
    }
}
public static void main(String[] args)
{
    String str="Programming";
     Solution(str);
     int[] array={1,2,3,4,5,1,2};
     Solution2(array);
}
}
