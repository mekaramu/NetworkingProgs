import java.net.*;
import java.io.*;
public class ServerDatagram1
{
 public static void main(String a[]) throws Exception
 {
	DatagramSocket ds=new DatagramSocket(8);
	byte b[]=new byte[50];
	DatagramPacket in=new DatagramPacket(b,b.length);
	ds.receive(in);
	System.out.println("In SERVER...."+new String(b));
	String str=" Hello client...";
	byte buff[]=str.getBytes();
	DatagramPacket out=new DatagramPacket		(buff,buff.length,in.getAddress(),in.getPort());
	ds.send(out);
	ds.close();
 }
}
	