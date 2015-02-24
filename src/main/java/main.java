import java.io.IOException;

/**
 * Created by yashasvi on 2/24/15.
 */
public class main {
    public static void main(String[] args) throws IOException{
        And a= new And("/home/yashasvi/Main/src/resources/name.csv","/home/yashasvi/Main/src/resources/last.csv");
        a.getAndFile();
    }

}
