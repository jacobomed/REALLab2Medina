/** Project:Port Scan
 * Purpose Details:
 * Course:IST 242
 * Author:Jacobo Medina
 * Date Developed: 2/02/2024
 * Last Date Changed: 2/04/2024
 * Rev:2/04/2024

 */



import java.net.Socket;
import java.io.IOException;
/**
 * Jacobo Medina.
 */
//Public class PortScan ;

/**
 * Scans ports on local host
 *
 * XX port is open!
 * XX port id open!
 * etc.
 */


public class PortScan {
    public static void main(String[] args) {
        String targetHost = "localhost";
        int maxPort = 65535;
        int minPort = 1;
        System.out.println("System will scan ports on " + targetHost + ". Here are the open ones ...");
        for(int port = maxPort; port>= minPort; port--){
            try{
                Socket socket = new Socket(targetHost, port);
                System.out.println("Port" + port + " is open");
                socket.close();
            } catch (IOException e){
            }
        }
        System.out.println("Port scan now complete.");
    }
}
