import java.util.*;

class Main {
    public static String solution(String str) {
        String[] words = str.split("\\s+");
        String longest = words[0];
        
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }
    
    public static void main(String[] args) {
        String str = "i love Saraliya";
        System.out.print(solution(str));
    }
}
