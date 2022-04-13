package ioStreams.myIOProgram;

public class SubstringsInStrings {

    public static int countSubstringsInString(String sample, String substring) {
        int count = 0;
        for (int i = 0; i < sample.length(); i++) {
            if ((sample.toLowerCase()).contains(substring.toLowerCase())) {
                count++;
                sample = (sample.toLowerCase()).replaceFirst((substring.toLowerCase()), "");
            }
        }
        return count;
    }

    public static String replaceSubstringInString(String sample, String oldSubstring, String newSubstring) {
        sample = sample.replaceAll(oldSubstring, newSubstring);
        return sample;
    }

    public static int countSpaceBetweenSubstring(String sample, String substring1, String substring2) {
       int sub1 = sample.indexOf(substring1.toLowerCase());
       int sub2 = sample.indexOf(substring2.toLowerCase());
       int space = sub2-sub1;
       return space;
    }

    public static String  addSpacesInString(String sample, int... placesToAdd) {
        String space = " ";
        StringBuilder builder = new StringBuilder(sample);
        for (int i = 0; i < placesToAdd.length; i++) {
            builder.insert(placesToAdd[i], space);

        }
       return builder.toString();
    }
}
