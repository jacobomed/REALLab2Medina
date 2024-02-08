
import java.net.InetAddress;
import java.net.UnknownHostException;
public class NetworkPing {
    public static void main(String[] args){
        String hostName = "www.disney.com";

        try{
            InetAddress inetAddress = InetAddress.getByName(hostName);
            if (inetAddress.isReachable(6000)){
                System.out.println(hostName + "is reachable");
            } else {
                System.out.println(hostName + "is not reachable");
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + hostName);
        } catch (Exception e) {
            System.err.println("error while pinging" + hostName + ": " + e.getMessage());
        }
    }
}
