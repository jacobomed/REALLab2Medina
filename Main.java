import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        Scanner scanner = new Scanner((System.in));
        NetworkPing networkPing = new NetworkPing();
        NetworkInfo networkInfo= new NetworkInfo();
        PortScan portScan = new PortScan();
        RouterTable routerTable = new RouterTable();

        displayMenu();
        int choice;
        choice = Integer.parseInt((scanner.nextLine()));


        switch (choice) {
            case 1:
                System.out.println("Will ping coded host");
                NetworkPing.main();
                break;
            case 2:
                RouterTable.main();
                System.out.println("Your Routing Table: ");
                break;
            case 3:
                System.out.println("Your Network Info: ");
                NetworkInfo.main();
            case 4:
                System.out.println("Your Port Scan: ");
                PortScan.main();



        }
    }

    private static void displayMenu() {

        System.out.println("1. Ping Host");
        System.out.println("2. Show Router Table");
        System.out.println("3. Show Network Info");
        System.out.println("4. Scan Your Ports");
        System.out.println("Which option do you wish to perform? ");
    }
}
