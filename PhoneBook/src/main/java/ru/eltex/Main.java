package ru.eltex;
import java.math.*;
import java.util.*;
import java.io.*;
class Main{
  public static void main(String[] args) {
    int a=0;
    PhoneBook tmp = new PhoneBook();
    tmp.fromCSV("phone.csv");
    System.out.println("1 - добавление пользователя");
    System.out.println("2 - удаление пользователя");
    System.out.println("3 - поиск пользователя по ФИО");
    System.out.println("4 - поиск пользователя по телефону");
    System.out.println("5 - вывод на экран всех пользователей");
    System.out.println("6 - вывод всех пользователей в файл");
    Scanner in = new Scanner(System.in);
    boolean fl=true;
    String s, ph, inn, tmp1;
    char sx;
    int x;
    while(fl){
      System.out.println("Выберите действие(1,2,3,4,5,6)");
      a = in.nextInt();
      s = in.nextLine();
      switch(a){
        case 1:{
          System.out.println("Какого пользователя хотите добавить? 0 - Юр, 1 - Физ");
          x = in.nextInt();
          s = in.nextLine();
          if(x==0){
            System.out.println("Введите данные(ФИО, телефон, ИНН)");
            s = in.nextLine();
            ph = in.nextLine();
            inn = in.next();
            tmp.addUser(s,ph,inn);
          }
          else {
            System.out.println("Введите данные(ФИО, телефон, пол)");
            s = in.nextLine();
            ph = in.nextLine();
            tmp1 = in.next();
            tmp.addUser(s,ph,tmp1.charAt(0));
          }
          break;
        }
        case 2:{
          System.out.println("Введите данные удаляемого пользователя(ФИО телефон)");
          s = in.nextLine();
          ph = in.next();
          tmp.removeUser(s,ph);
          break;
        }
        case 3:{
          System.out.println("Введите ФИО для поиска");
          s = in.nextLine();
          tmp.searchFIO(s);
          break;
        }
        case 4:{
          System.out.println("Введите телефон для поиска");
          s = in.nextLine();
          tmp.searchPhone(s);
          break;
        }
        case 5:{
          tmp.printALL();
          break;
        }
        case 6:{
          try( FileWriter fwr = new FileWriter("phone.csv",false)){
            tmp.toCSV(fwr);
            fwr.close();
          }
          catch (IOException e){
            e.getMessage();
          }
          break;
        }
        default:{
          fl=false;
          break;
        }
      }
    }
  }
}
