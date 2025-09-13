import java.util.*;
class Main
{
public static int Solution(String str)    
{
    int left=0;
    int maxlen=Integer.MIN_VALUE;
    HashSet<Character>map=new HashSet<>();
for(int right=0;right<str.length();right++)
{
    char target=str.charAt(right);
    while(map.contains(target))
    {
        map.remove(str.charAt(left));
        left++;
    }
    map.add(target);
    maxlen=Math.max(maxlen,map.size());
    
}
return map.size();
}
public static void main(String[] args)
{
    String str="abcabcdecbabcdef";
    System.out.print(Solution(str));
}
}
