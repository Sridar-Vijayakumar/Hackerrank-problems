import java.util.*;

public class nonrepeated{
    
    public static char firstNonRepeatedChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                return c;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        String str = "interview";
        
        char result = firstNonRepeatedChar(str);

        if(result != '\0')
            System.out.println(result);
        else
            System.out.println("No non-repeated character");
    }
}

