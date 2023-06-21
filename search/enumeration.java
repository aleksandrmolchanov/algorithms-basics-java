import java.util.List;

public class Enumeration{
    
    private static List<String> stopWords = List.of(
        "one", "two", "three", "four", "five", "six", "seven", "eight"
    );

    public static boolean isStopWord(String candidate) {
        for(String word : stopWords) {
            if (word.equals(candidate)) {
                return true;
            }
        }

        return false;
    }

     public static void main(String []args){
        System.out.println(isStopWord("nine"));
        System.out.println(isStopWord("eight"));
     }
}
