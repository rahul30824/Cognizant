class Main
{
 public static boolean Palindrome(String str)
 {
     int start=0;
     int end=str.length()-1;
     while(end>start){
     if(str.charAt(start)!=str.charAt(end))
     {
         return false;
     }
     start++;
     end--;
     }
     return true;
 }
 public static String Solution(String str)  
 {
     String sub="";
      String longest="";
     for(int i=0;i<=str.length();i++)
     {
         for(int j=i+1;j<=str.length();j++)
         {
             sub=str.substring(i,j);
            if (Palindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
             }
         }
         return longest;
 }
public static  void main(String[] args)
{
    String str="cbbd";
    Main sol=new Main();
    System.out.print(sol.Solution(str));
}
}
