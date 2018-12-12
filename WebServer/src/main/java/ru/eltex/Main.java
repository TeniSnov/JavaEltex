package ru.eltex;
import java.io.*;
import java.util.*;
import java.net.*;
class Main{
    public static void main(String[] args) {
      try{
        ServerSocket s = new ServerSocket(8080);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
          Socket client = s.accept();
          Runnable r = new MyThread (client);
          Thread t = new Thread(r);
          t.start();
          Thread.sleep(100);
        }
      }
      catch (Exception e){
        System.out.println(e.getMessage());
      }
  }
}
