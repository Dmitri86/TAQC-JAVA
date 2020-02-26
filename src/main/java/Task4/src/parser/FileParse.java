package Task4.src.parser;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParse {
    private String path;
    private String pattern;
    private String replaceString;

    FileParse(String path, String pattern){
        this.path = path;
        this.pattern = pattern;
    }

    FileParse(String path, String pattern, String replaceString){
        this(path, pattern);
        this.replaceString = replaceString;
    }

    public String startProgram(){
        try{
            return runParsing();
        }catch (IOException e){
            return Constants.EMPTY_STRING;
        }
    }

    private String runParsing() throws IOException{
        File inputFile = new File(path);
        FileReader fr = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fr);
        if(replaceString == null){
            return getCount(br, fr).toString();
        }
        File temporaryFile = new File(getPathForTemporaryFile());
        temporaryFile.createNewFile();
        PrintWriter pw = new PrintWriter(temporaryFile);
        if(replaceWords(fr, br, pw, inputFile, temporaryFile)){
            return Constants.SUCCESSFUL_MESSAGE;
        }
        return Constants.FAIL_MESSAGE;
    }

    private Integer getCount(BufferedReader br, FileReader fr) throws IOException{
        int count = 0;
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

    private boolean replaceWords(FileReader fr, BufferedReader br, PrintWriter pw,
                                 File inputFile, File temporaryFile) throws IOException{
        while(br.ready()) {
            String readLine = br.readLine().replaceAll(pattern, replaceString);
            pw.println(readLine);
        }
        closeStreamForFileReader(fr, br);
        closeStreamForFileWriter(pw);
        return copyText(inputFile, temporaryFile);
    }

    private boolean copyText(File inputFile, File temporaryFile)
            throws IOException {

        FileReader fr = new FileReader(temporaryFile);
        BufferedReader br = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter(inputFile);
        while(br.ready()) {
            pw.println(br.readLine());
        }
        closeStreamForFileReader(fr, br);
        closeStreamForFileWriter(pw);
        return temporaryFile.delete();
    }

    private String getPathForTemporaryFile() {
        String temporaryPath = (new File(path)).getPath();
        Pattern pt = Pattern.compile("\\w+\\.\\w+");
        Matcher mt = pt.matcher(temporaryPath);
        if(mt.find()){
            temporaryPath = temporaryPath.substring(0, mt.start()) + Constants.TEMPORARY_FILE_NAME;
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
