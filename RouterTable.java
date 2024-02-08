import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RouterTable {
    public static void main(){
        try {
            Process process = Runtime.getRuntime().exec("route print");
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
