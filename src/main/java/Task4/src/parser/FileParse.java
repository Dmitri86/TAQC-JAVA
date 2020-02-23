package Task4.src.parser;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParse {
    private String path;
    private String pattern;
    private String replaceString;

    FileParse(String path, String searchString){
        this.path = path;
        this.pattern = searchString;
    }

    FileParse(String path, String searchString, String replaceString){
        this(path, searchString);
        this.replaceString = replaceString;
    }

    public Integer getQuantityMatches(){
        try {
            return countMatches();
        }catch(IOException e) {
            Display.showMessage(Constants.UNKNOWN_ERROR);
            return 0;
        }
    }

    private  int countMatches() throws IOException{
        int count = 0;
        FileReader fr = new FileReader(new File(path));
        BufferedReader br = new BufferedReader(fr);
        Pattern pt = Pattern.compile(pattern);
        while(br.ready()) {
            Matcher mt = pt.matcher(br.readLine());
            while(mt.find()) {
                count++;
            }
        }
        closeStreamForFileReader(fr, br);
        return count;
    }

    public String replaceStrings(){
        try{
            return getReplace();
        }catch (IOException e){
            Display.showMessage(Constants.UNKNOWN_ERROR);
            return Constants.FAIL_MESSAGE;
        }
    }

    private String getReplace() throws IOException{
        File inputFile = new File(path);
        File temporaryFile = new File(getPathForTemporaryFile());
        if(!temporaryFile.createNewFile()){
            return Constants.FAIL_MESSAGE;
        }
        FileReader fr = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter(temporaryFile);
        while(br.ready()) {
            String readLine = br.readLine().replaceAll(pattern, replaceString);
            pw.println(readLine);
        }
        closeStreamForFileReader(fr, br);
        closeStreamForFileWriter(pw);
        copyText(inputFile, temporaryFile);
        if(temporaryFile.delete()){
            return Constants.SUCCESSFUL_MESSAGE;
        }
        return Constants.FAIL_MESSAGE;
    }

    private void copyText(File inputFile, File temporaryFile)
            throws IOException {

        FileReader fr = new FileReader(temporaryFile);
        BufferedReader br = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter(inputFile);
        while(br.ready()) {
            pw.println(br.readLine());
        }
        closeStreamForFileReader(fr, br);
        closeStreamForFileWriter(pw);
    }

    private String getPathForTemporaryFile() {
        String temporaryPath = (new File(path)).getPath();
        Pattern pt = Pattern.compile("\\w+\\.\\w+");
        Matcher mt = pt.matcher(temporaryPath);
        if(mt.find()){
            temporaryPath = temporaryPath.substring(0, mt.start()) + "temporary888.txt";
            return temporaryPath;
        }
        return Constants.EMPTY_STRING;
    }

    private void closeStreamForFileReader(FileReader fr, BufferedReader br)
            throws IOException{
        br.close();
        fr.close();
    }

    private void closeStreamForFileWriter(PrintWriter pw) {
        pw.flush();
        pw.close();
    }

}
