package ru.eltex;
import java.io.*;
final class Phys extends User{
  private char Sex;
  protected void setSex(char t){
    this.Sex=t;
  }
  protected char getSex(char t){
    return this.Sex;
  }
  Phys(String fio, String ph,char sx){
    super(fio,ph);
    this.Sex=sx;
  }
  public void fromCSV(String filename){
  }
  public void toCSV(FileWriter fw){
    String s;
    s = this.getIndex() + ";" + this.getFIO() + ";" + this.getPhone() + ";" + this.Sex;
    try( FileWriter fwr = new FileWriter("phone.csv",false)){
      fw.write(s);
      fw.write('\n');
    }
    catch (IOException e){
      e.getMessage();
    }
  }
  public void println(){
    System.out.print(this.getIndex());
    System.out.print(" ");
    System.out.print(this.getFIO());
    System.out.print(" ");
    System.out.print(this.getPhone());
    System.out.print(" ");
    System.out.println(this.Sex);
  }
}
