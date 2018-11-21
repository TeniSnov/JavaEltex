package ru.eltex;
abstract class User implements CSV{
  private static int ind;
  private String FIO;
  private String Phone;
  private int index=0;
  public void setFIO(String t){
    this.FIO=t;
  }
  public String getFIO(){
    return this.FIO;
  }
  public int getIndex(){
    return this.index;
  }
  User(String f, String p){
    this.FIO = f;
    this.Phone = p;
    this.index = ind +1;
    ind++;
  }
  public void setPhone(String t){
    this.Phone=t;
  }
  public String getPhone(){
    return this.Phone;
  }
  abstract public void println();
  public void fromCSV(){
  }
  public void toCSV(){
  }
}
