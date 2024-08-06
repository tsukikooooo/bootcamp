package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.spec.DESKeySpec;

public abstract class Shape {
  abstract double area();

  //小心有2個, 1 method , 1 abstract 
  //public Shape(){}

  public static double area(List<Shape> shapes){  //Big demicale 用new 會出事, 要用valueOf
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for(Shape shape : shapes){
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  //approach 2 死背, java rule *** useful systax
  //<T extends Shape>  : is to describe the parent relationship 
  public static <T extends Shape> double area2(List<T> shapes){  //approch1 & appraoch 2 are same now when add<T extends Shape> 
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for(Shape shape : shapes){
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();

    //Question1 
    //List<Object> vs List<T> ?? Difference?

  } //開method 控制Object 入黎範圍, polymopyium 後無Area, 極限到shape area()

  public static double area3(List<? extends Shape> shapes){
    return -1.0;
  }
  public static void main(String[] args) {

    //Circle VS Shape - > Parents
    //List<Shape> vs List<Circle> - > NOT parent
    List<Shape> shapes = new LinkedList<Shape>(); //list已經定左 做 shape LIST,  //做 shape 但 shape 可做其他野?
    shapes.add(new Circle(3.0));
    shapes.add(new Circle(4.2));
    System.out.println(Shape.area(shapes));
    System.out.println(Shape.area2(shapes));
    shapes.add(new Square(5.0));
    //ArrayList<Square> object
    //ArrayList<Circle> object
    List<? extends Shape> shapes2 = new ArrayList<>();// new
    shapes2 = new ArrayList<Square>(); //理解type
    //? extends 係可以 放Circle 


    List<? super Shape> shapes2 = new ArrayList<>(); //why use ? super 放入generics 先可以add  右邊係object , 左邊係type!!
    //Why? new ArrayList<> 只可以放shape 以上, "Object"
    //List 未定
    //範圍闊
   // 51VS 53 object reference maybe assign to Square /Circle (logic is not OK!)
    //add
  //   shapes2.add(new Circle(3.0));
  //   shapes2.add(new Circle(4.2));
  //  shapes2.add(new Square(5.0)); //NOT OK, during compile-time, we do not know the actual type of object reference by shape2
    //shapes2.add(new Object())

    List<? super Shape> shapes3 = new ArrayList<Object>(); //當5 guiartine 就唔可以@ bird., super 用法, 因為佢包底, 包晒成個square, shape.
    shapes3.add(new Circle(3.4));
    shapes3.add(new Square(3.4));
    shapes.add(new Bird()); //NOT OK?因為係shape ArrayList, Object ArrayList 就可以
    //During compile-time, we DO not know type of shapes3. no guardine.
    //只要有arraylist 放到shape 

   // List<Object> objects = new ArrayList<Circle>(); //NOT OK (Parent)
    Object object = new Circle(2.4);//OK  普通polymoysium

   // ? extends ng guradine circle /shape., super 咁岩鎖定左,
  } 
  }

  
