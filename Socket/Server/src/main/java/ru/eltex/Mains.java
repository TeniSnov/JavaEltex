package ru.eltex;
import java.io.*;
import java.util.*;
import java.net.*;
class Mains{
    public static void main(String[] args) {
      try{
      ServerSocket s = new ServerSocket(2018);
      Socket client = s.accept();
      InputStream instream = client.getInputStream();
      OutputStream outstream = client.getOutputStream();
      Scanner in = new Scanner(instream);
      PrintWriter out = new PrintWriter(outstream);
      String st;
      System.out.println("Wait for messages");
      while ((st = in.nextLine()) != null) {
        if (st.equalsIgnoreCase("exit")) break;
        out.println("S ::: "+st);
        out.flush();
        System.out.println(st);
      }
      System.out.println("Прием клиента окончен");
      out.close();
      in.close();
      client.close();
      s.close();
    }
    catch (Exception e){
      e.getMessage();
    }
  }
}
