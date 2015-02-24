/**
 * Created by yashasvi on 2/23/15.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class And {
    private String file1;
    private String file2;

    public And(String file1, String file2) {
        this.file1 = file1;
        this.file2 = file2;
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

    public String getAndFile() throws IOException {
        File file = new File("/home/yashasvi/Main/src/resources/Andresult.csv");
        if (!file.exists()) {
            file.createNewFile();
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (String content1 : getFile1content(file1)) {
                for (String content2 : getFile1content(file2))
                    bw.write(content1 + "," + content2 + "\n");
            }
            bw.close();
        }
        return file.getAbsolutePath();


    }
}



