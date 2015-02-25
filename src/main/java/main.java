import java.io.IOException;

/**
 * Created by yashasvi on 2/24/15.
 */
public class main {
    public static void main(String[] args) throws IOException {
        And and = new And("/home/yashasvi/Main/src/resources/Andresult.csv");
        and.getAndFile("/home/yashasvi/Main/src/resources/name.csv", "/home/yashasvi/Main/src/resources/last.csv");

        Or or = new Or("/home/yashasvi/Main/src/resources/Orresult1.csv", "/home/yashasvi/Main/src/resources/Orresult2.csv", "/home/yashasvi/Main/src/resources/Orresult3.csv");

        or.getOrFiles("/home/yashasvi/Main/src/resources/name.csv", "/home/yashasvi/Main/src/resources/last.csv", "/home/yashasvi/Main/src/resources/complementname.csv", "/home/yashasvi/Main/src/resources/complementlast.csv");

    }

}

