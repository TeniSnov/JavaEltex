package ru.eltex;
import java.io.*;
final class Jurid extends User{
  private String INN;
  protected void setINN(String t){
    this.INN=t;
  }
  protected String getINN(String t){
    return this.INN;
  }
  public void fromCSV(String filename){
  }
  public void toCSV(FileWriter fw){
    String s;
    s = this.getIndex() + ";" + this.getFIO() + ";" + this.getPhone() + ";" + this.INN;
    try( FileWriter fwr = new FileWriter("phone.csv",false)){
      fw.write(s);
      fw.write('\n');
    }
    catch (IOException e){
      e.getMessage();
    }
  }
  Jurid(String fio,String ph,String inn){
    super(fio,ph);
    this.INN=inn;
  }
  public void println(){
    System.out.print(this.getIndex());
    System.out.print(" ");
    System.out.print(this.getFIO());
    System.out.print(" ");
    System.out.print(this.getPhone());
    System.out.print(" ");
    System.out.println(this.INN);
  }
}
