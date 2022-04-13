package ioStreams.myIOProgram;

import java.io.*;
public class InputOutputProgram {
    private String pathToReadFrom ;
    private String pathToWriteTo ;

    public String getPathToReadFrom() {
        return pathToReadFrom;
    }

    public void setPathToReadFrom(String pathToReadFrom) {
        this.pathToReadFrom = pathToReadFrom;
    }

    public String getPathToWriteTo() {
        return pathToWriteTo;
    }

    public void setPathToWriteTo(String pathToWriteTo) {
        this.pathToWriteTo = pathToWriteTo;
    }

    public static String readStringFromFile(String path)  {
          StringBuilder builder = new StringBuilder();
          File file = new File(path);
          FileReader reader = null;
        try{
            reader = new FileReader(file);
            int result = reader.read();
            while (result != -1) {
                char symbol = (char) result;
                builder.append(symbol);
                result = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
    public static String toModifyString(String path){
        String stringFromFile = readStringFromFile(path);
        stringFromFile= SubstringsInStrings.replaceSubstringInString(stringFromFile, "green", "mean");
        stringFromFile = SubstringsInStrings.addSpacesInString(stringFromFile, 8);
        stringFromFile = ReverseOrder.reverseLettersOrder(stringFromFile);
        return stringFromFile;
    }
    public static void writeModifiedStringToFile(String fileToWriteTo, String fileToReadFrom) {
        File file1 = new File(fileToWriteTo);
        FileWriter writer = null;
        String modifiedString = toModifyString(fileToReadFrom);
        try {
            writer = new FileWriter(file1);
            writer.write(modifiedString);
            writer.close();
        } catch (IOException exc) {
            exc.printStackTrace();
        }

    }
}


