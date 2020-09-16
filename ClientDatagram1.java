import java.net.*;
import java.io.*;
public class ClientDatagram1
{
 public static void main(String a[]) throws Exception
 {
	InetAddress ia=InetAddress.getLocalHost();
	DatagramSocket ds=new DatagramSocket(102,ia);
	String str="Hello Server...";
	byte b[]=str.getBytes();
	DatagramPacket out=new DatagramPacket(b,b.length,ia,8);
	ds.send(out);
	System.out.println("Sending to Server...:"+(new String(b)));
	byte buff[]=new byte[50];
	DatagramPacket in=new DatagramPacket(buff,buff.length);
	ds.receive(in);
	System.out.println("Received From Server....:"+new String(buff));
	ds.close();
 }
} 