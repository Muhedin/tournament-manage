package tournament.manager;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;
import com.sun.j3d.utils.geometry.Text2D;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Muhedin
 */
public class TournamentManager {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("res/ProcitajMe.txt");
        BufferedReader read = null;
        StringBuilder line = new StringBuilder();
        String parts [] = null;

        try {

            read = new BufferedReader(new FileReader(file));
            String text = null;
            


            while ((text = read.readLine()) != null) {

                line.append(text).append(System.getProperty("line.separator")); //??
                //System.out.println(text);
                parts = text.split("\\|"); //dijeli string na dijelove kad naidje na "|"
                
                System.out.println(Arrays.asList(parts)); //ispisuje listu stringova
                
            }

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                if (read != null) {
                    read.close();
                }
            } catch (IOException e) {
            }
        }

        //System.out.println(line.toString()); // ispisuje u konzoli sadrzaj fajla
        
    }
}
