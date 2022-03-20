import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String[] words, String order){
       HashMap<Character,Integer> map = new HashMap<>();
       for (int i = 0 ; i< order.length(); i++){
           map.put(order.charAt(i), i);
       }
       for (int i=0;i< words.length - 1;i++){
           String w1 = words[i];
           int  w1_l = w1.length();
           String w2 = words[i+1];
           int  w2_l = w2.length();
           for (int j = 0; j< Math.max(w1_l,w2_l); j++){
               int x = j >= w1_l ? -1 : (map.get(w1.charAt(j)));
               int y = j >= w2_l ? -1 : (map.get(w2.charAt(j)));
               if (x > y) return false;
               if (x < y)  break;
           }

       }

      return true;
    }
}
