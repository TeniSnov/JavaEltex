package ru.eltex;
import java.io.*;
import java.util.*;
import java.net.*;
class MyThread implements Runnable{
  private static Socket clientDialog;
  public MyThread(Socket client) {
        MyThread.clientDialog = client;
  }
  public void run(){
    try{
      InputStream instream = clientDialog.getInputStream();
      OutputStream outstream = clientDialog.getOutputStream();
      Scanner in = new Scanner(instream);
      PrintWriter out = new PrintWriter(outstream);
      int i;
      String entry = in.nextLine();
      System.out.println("Прочитано: " + entry);
      if(entry.toCharArray()[5]==' '){
        entry = "index.html";
      }
      else{
        for (i=6;i<entry.length();i++){
          if(entry.toCharArray()[i]==' ') break;
        }
        entry = entry.substring(5,i);
      }
      String ans = "HTTP/1.1 200 OK\r\nContent-Length: ";
      Integer len = new Integer(0);
      String inS, temp="";
      try (FileReader fr = new FileReader(entry)){
        BufferedReader inStr = new BufferedReader(fr);
        while((inS = inStr.readLine())!= null) {
          len += inS.length();
          temp += inS;
        }
        fr.close();
        ans += Integer.toString(len) + "\r\n\r\n" + temp;
        out.println(ans);
        out.flush();
      }
      catch (IOException e){
        e.getMessage();
      }
      System.out.println(ans);
      System.out.println("Прием клиента окончен");
      out.close();
    }
    catch (Exception e){
      e.getMessage();
    }
  }
}
