import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RouterTable {
    public static void main(String[] args){
        String[] command = {"nmap", "localhost"};

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
