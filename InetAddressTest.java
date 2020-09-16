// Demonstrate InetAddress.
import java.net.*;
public class InetAddressTest
{
public static void main(String args[]) throws UnknownHostException {
InetAddress Address = InetAddress.getLocalHost();
System.out.println(Address);
Address = InetAddress.getByName("google.co.in");
//Address = InetAddress.getByName("rgmcet.edu.in");
System.out.println(Address);
InetAddress SW[] = InetAddress.getAllByName("www.google.co.in");
//InetAddress SW[] = InetAddress.getAllByName("rgmcet.edu.in");
for (int i=0; i<SW.length; i++)
System.out.println(SW[i]);
}
}