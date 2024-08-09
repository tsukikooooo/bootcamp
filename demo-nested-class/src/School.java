public class School { //method 內有class, 再自私D 做法 //local inner class

  public static void createSubject(){

    class Subject{
    
    }

    Subject subject = new Subject();
  }

    public class Subject{ //可以class 拎出黎用

    }
  public static void main(String[] args) {
    //School class can be only used by createSubject() method

  }
  
}
