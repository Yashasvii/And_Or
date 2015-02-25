/**
 * Created by yashasvi on 2/23/15.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class And {

    private File andFile;

    public And(String file) {
        this.andFile = new File(file);

    }

    private String[] getFile1content(String file) throws IOException {
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> content = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            content.add(line);
        }
        bufferedReader.close();

        return content.toArray(new String[content.size()]);

    }

    public String getAndFile(String file1, String file2) throws IOException {

        if (!andFile.exists()) {
            andFile.createNewFile();
            FileWriter fw = new FileWriter(andFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (String content1 : getFile1content(file1)) {
                for (String content2 : getFile1content(file2))
                    bw.write(content1 + "," + content2 + "\n");
            }
            bw.close();
        }
        return andFile.getAbsolutePath();


    }
}



