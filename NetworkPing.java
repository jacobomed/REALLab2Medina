/** Project: NetworkPing
 * Purpose Details: To ping a chosen URL
 * Course: IST242
 * Author:Jacobo Medina
 * Date Developed:2-08-2024
 * Last Date Changed:2-08-2024
 * Rev:2-08-2024

 */





import java.net.InetAddress;
import java.net.UnknownHostException;
public class NetworkPing {
    public static void main(){
        String hostName = "www.etcsnw374e.cm";

        try{
            InetAddress inetAddress = InetAddress.getByName(hostName);
            if (inetAddress.isReachable(5000)){
                System.out.println(hostName + " is reachable");
            } else {
                System.out.println(hostName + " is not reachable");
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + hostName);
        } catch (Exception e) {
            System.err.println("error while pinging" + hostName + ": " + e.getMessage());
        }
    }
}
