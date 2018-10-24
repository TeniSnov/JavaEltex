import java.util.LinkedList;
class PhoneBook{
  private LinkedList<User> book = new LinkedList();
  public void addUser(String f, String p){
    User t = new User();
    t.setFIO(f);
    t.setPhone(p);
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
