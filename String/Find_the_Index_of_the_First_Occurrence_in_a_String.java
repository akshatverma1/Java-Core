package String;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String arr[]) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(firstOccurrence(haystack, needle));
    }

    public static int firstOccurrence(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        if (i != -1) {
            return i;
        }
        return -1;
    }
}
