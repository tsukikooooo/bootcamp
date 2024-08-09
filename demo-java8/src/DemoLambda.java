import java.util.LinkedList;
import java.util.List;

public class DemoLambda {
    public static void main(String[] args){
        //before java 8
        Swimable p = new Swimable() {
            @Override
            public void swim(){
                System.out.println("I am swimming...");
            }
        };
        p.swim();

      //After java 8
      // Lambda experssion (咁岩interface都係method)
      // The reason that we can use "() -> implementation" is that interface contains one abstract only.
      Swimable person = () -> System.out.println("I am swimming...");//因為得一個method...所以一寫得依個
      System.out.println(person.toString()); //DemoLambda$$Lambda$1/0x000002df47000400@f6f4d33
      person.swim();

      //selfish...only for self use only
      //Another object
        person = () -> System.out.println("I am running!!");
        System.out.println(person.toString()); //prove differnt object. //DemoLambda$$Lambda$2/0x000002df47001800@3f99bd52
        person.swim(); //changed the object 同一個指針, 唔同object.

        //有abstubutr參數ver
        Calculator sumCalculator = (a,b) -> a + b;  //no need "return" , 
        System.out.println(sumCalculator.calculate(10, 3)); //13

        Calculator multipleCalculator = (a,b) -> a * b ;  //no need to write 4 methods. only lazy to create object.. diff.: the change of systax
        System.out.println(multipleCalculator.calculate(10, 3)); //30


        //More than one line of implementation
        //1.Then u hv to use "return " keyword within the implemention block
        //2. if there is only one parameter, then you dont hv to use(x), u can simple use x

        Drivable father = (x) -> { // 可 x 不用()
             if (x ==3)
                return false;
             return true;
        }; //create drivable object
        System.out.println(father.drive(3)); //T
        System.err.println(father.drive(4));//F


        
        List<String> strings = new LinkedList<>();
        strings.add("abc");
        strings.add("def");
        strings.add("abcsd");

        //for each loop  //統計 可以, lamba cannot
        String t = "";
        for (String s : strings){
            System.out.println(s);
            t += s;
        }
        System.out.println(t); //

        //Lambda forEach 封閉..不能接受外來的..
        strings.forEach(s -> System.out.println(s));//本身list 有for each method... 
        
        strings.forEach(s -> {  //more than one line
            
            if (s.length()> 3){
                System.out.println(s);
            
       //     t +=s complier error, 不能改變出邊GE 事, 要s 完成晒先可以改邊出邊, for loop但有限制, 唔能改出面參數
            }else{
                System.out.println("hello");
            }
        });



    }
}
