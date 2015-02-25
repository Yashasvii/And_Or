import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yashasvi on 2/23/15.
 */
public class Or {

    private String orFile1;
    private String orFile2;
    private String orFile3;

    public Or(String file1, String file2, String file3) {
        this.orFile1 = file1;
        this.orFile2 = file2;
        this.orFile3 = file3;

    }

    public String[] getOrFiles(String file1, String file2, String complementFile1, String complementFile2) throws IOException {
        List<String> content = new ArrayList<String>();
        And and1 = new And(orFile1);
        content.add(and1.getAndFile(file1, file2));

        And and2 = new And(orFile2);
        content.add(and2.getAndFile(file1, complementFile2));

        And and3 = new And(orFile3);
        content.add(and3.getAndFile(complementFile1, file2));


        return content.toArray(new String[content.size()]);


    }

}

