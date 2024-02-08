import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/** Project:RouterTable
 * Purpose Details: To generate a router table of the user's device
 * Course: IST242
 * Author: Jacobo Medina
 * Date Developed: 2-08-2024
 * Last Date Changed: 2-08-2024
 * Rev: 2-08-2024

 */
public class RouterTable {
    public static void main(){
        try {
            Process process = Runtime.getRuntime().exec("netstat -nr");
            BufferedReader reader = new BufferedReader( new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
            process.waitFor();
        } catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
