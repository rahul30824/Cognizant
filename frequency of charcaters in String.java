class Main
{
 public static void Solution(String str)   
 {
    
     int[] freq=new int[256];
     for(char num:str.toCharArray())
     {
         freq[num]++;
     }
     for(int i=0;i<freq.length;i++)
     {
         if(freq[i]>0)
         {
             System.out.println((char)i +" " + freq[i]);
         }
     }
}
public static void main(String[] args)
{
    String str="Saveetha University";
    Solution(str);
}
}
