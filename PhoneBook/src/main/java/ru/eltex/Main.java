package ru.eltex;
import java.math.*;
import java.util.*;
class Main{
  public static void main(String[] args) {
    PhoneBook tmp = new PhoneBook();
    tmp.addUser("Мокаревич Иван Петрович","8-965-416-5162");
    tmp.addUser("Зеленцова Ольга Ахмедовна","8-903-215-8632");
    tmp.addUser("Жук Анна Ивановна","8-976-435-2135");
    tmp.addUser("Вьюнов Павел Игоревич","8-978-432-1355");
    tmp.addUser("Сельская Оксана Викторовна","8-932-154-6145");
    System.out.println("1 - добавление пользователя");
    System.out.println("2 - удаление пользователя");
    System.out.println("3 - поиск пользователя по ФИО");
    System.out.println("4 - поиск пользователя по телефону");
    System.out.println("5 - вывод на экран всех пользователей");
    Scanner in = new Scanner(System.in);
    boolean fl=true;
    int a;
    String s, ph;
    while(fl){
      System.out.println("Выберите действие(1,2,3,4,5)");
      a = in.nextInt();
      s = in.nextLine();
      switch(a){
        case 1:{
          System.out.println("Введите данные нового пользователя(ФИО телефон)");
          s = in.nextLine();
          ph = in.next();
          tmp.addUser(s,ph);
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
        default:{
          fl=false;
          break;
        }
      }
    }
  }
}
