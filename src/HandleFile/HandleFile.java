package HandleFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HandleFile {
	
	public String readFile(String url, String nameFile) throws IOException {
		
		// �?�?c dữ liệu từ File với Scanner
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        List<String> s = new ArrayList<String>();
        
        try {
            fileInputStream = new FileInputStream("D:\\hdt\\test.txt");
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            while (line != null) {
                s.add(line);

                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException ex) {
        
        	System.err.println("Messeager error: " + ex);
        	
        } finally {
            bufferedReader.close();
            fileInputStream.close();
        }
		
		return " ";
		
	}
	
	
	public String writeFile(String url, String nameFile) throws IOException {
		 FileWriter writer = new FileWriter("D:\\hdt\\" + nameFile + ".txt");
	        BufferedWriter buffer = new BufferedWriter(writer);
	        buffer.write("Welcome to java.");
	        buffer.close();
	        System.out.println("Success...");
	        return "";
	}
	
	
	public void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry);
	        }
	    }
	}



}
