package ru.eltex;
class User{
  private String FIO;
  private String Phone;
  public void setFIO(String t){
    this.FIO=t;
  }
  public String getFIO(){
    return this.FIO;
  }
  public void setPhone(String t){
    this.Phone=t;
  }
  public String getPhone(){
    return this.Phone;
  }
  public void println(){
    System.out.print(this.FIO);
    System.out.print(" ");
    System.out.println(this.Phone);
  }
}
