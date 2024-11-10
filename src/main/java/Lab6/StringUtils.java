package Lab6;

public class StringUtils {
    public static boolean included(String word, String searched){
        if (word == null || searched == null){
            return false;
        }
        word = word.trim().toUpperCase();
        searched = searched.trim().toUpperCase();
        if (word.contains(searched)){
            return true;
        }
        return false;
    }

}
