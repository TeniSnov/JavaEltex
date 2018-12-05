package ru.eltex;
import java.io.*;
import java.util.*;
import java.net.*;
class Mainc{
    public static void main(String[] args) {
      /*try{
        InetAddress addr = InetAddress.getByName("google.ru");
        System.out.println(addr);
        byte[] addrArr= addr.getAddress();
        for(byte a: addrArr){
          System.out.print(a);
        }
        System.out.println(" ");
      }
      catch (Exception e){
        e.getMessage();
      }
      try{
        InetAddress[] addrAll = InetAddress.getAllByName("yandex.ru");
        for(InetAddress a: addrAll){
          System.out.println(a);
        }
      }
      catch (Exception e){
        e.getMessage();
      }*/
      try{
        Socket sock = new Socket("127.0.0.1",2018);
        InputStream instream = sock.getInputStream();
        OutputStream outstream = sock.getOutputStream();
        Scanner in = new Scanner(instream);
        PrintWriter out = new PrintWriter(outstream);
        Scanner inu = new Scanner(System.in);
        String str, fserver;
        str = " H e l l o W o r l d ";
        while ((str = inu.nextLine())!=null) {
          out.println(str);
          out.flush();
          fserver = in.nextLine();
          System.out.println(fserver);
          if (str.equalsIgnoreCase("close")) break;
          if (str.equalsIgnoreCase("exit")) break;
        }
        sock.close();
      }
      catch (Exception e){
        e.getMessage();
      }
    }
}
