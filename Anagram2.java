import java.util.HashMap;
class Main
{
public static boolean solution(String s1,String s2)
{
   HashMap<Character, Integer>map1=new HashMap<>();
   HashMap<Character, Integer>map2=new HashMap<>();
   for(char num:s1.toCharArray())
   {
       map1.put(num,map1.getOrDefault(num,0)+1);
   }
   for(char num:s2.toCharArray())
   {
       map2.put(num,map2.getOrDefault(num,0)+1);
   }
   return map1.equals(map2);
}
public static void main(String[] args)
{
    String s1="listen";
    String s2="silent";
    System.out.print(solution(s1,s2));
}
}
