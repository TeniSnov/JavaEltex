package ru.eltex;
import java.util.LinkedList;
import java.io.*;
class PhoneBook implements CSV{
  private LinkedList<User> book = new LinkedList();
  public void addUser(String f, String p, String in){
    Jurid t = new Jurid(f,p,in);
    book.add(t);
  }
  public void addUser(String f, String p, char sx){
    Phys t = new Phys(f,p,sx);
    book.add(t);
  }
  public void removeUser(String f, String p){
    for(User a : book){
      if (f.equals(a.getFIO())&&p.equals(a.getPhone())){
        System.out.println("Пользователь удален");
        book.remove(a);
        break;
      }
    }
  }
  public void fromCSV(String filename){
    int i, len, index=0, last=0;
    String inS, fio="", ph="", inn="", nom="";
    char sx='r';
    int a=0;
    try( FileReader fr = new FileReader(filename)){
      BufferedReader inStr = new BufferedReader(fr);
      while((inS = inStr.readLine())!= null) {
        len=inS.length();
        for(i=0;i<len;i++){
          if(inS.charAt(i)==';'){
            if(a==0) {
              nom =  inS.substring(0,i);
              index=i+1;
            }
            if(a==1) {
              last=i-1;
              fio = inS.substring(index,i);
              index = i+1;
            }
            if(a==2){
              ph = inS.substring(index,i-1);
              index = i+1;
              if (index==len-1) {
                sx=inS.charAt(index);
                this.addUser(fio,ph,sx);

              }
              else {
                inn = inS.substring(i+1);
                this.addUser(fio,ph,inn);
              }
            }
            a++;
          }
        }
        index=0;
        a=0;
      }
      fr.close();
    }
    catch (IOException e){
      e.getMessage();
    }
  }
  public void toCSV(FileWriter fw){
    for(User th : book){
      th.toCSV(fw);
    }
  }
  public void searchFIO(String t){
    boolean flag=false;
    for(User a : book){
      if (t.equals(a.getFIO())){
        System.out.println("Пользователь найден");
        a.println();
        flag=true;
        break;
      }
    }
    if(!flag){
      System.out.println("Пользователь не найден:");
    }
  }
  public void searchPhone(String t){
    boolean flag=false;
    for(User a : book){
      if (t.equals(a.getPhone())){
        System.out.println("Пользователь найден:");
        a.println();
        flag=true;
        break;
      }
    }
    if(!flag){
      System.out.println("Пользователь не найден:");
    }
  }
  public void printALL(){
    for(User a : book){
      a.println();
    }
  }
}
