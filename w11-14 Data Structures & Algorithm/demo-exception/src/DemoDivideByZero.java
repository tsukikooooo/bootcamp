public class DemoDivideByZero {  //Unchecked Exception: NPE, ArithmeticException
    public static void main(String[] args) {
     int amount = 0;
     System.out.println(divide(10, 3));//3
    // System.out.println(divide(10, amount)); //exception 

     //approach 1 specify 一件事

     if (amount != 0){
        System.out.println(divide(10, amount));
     } else{
        System.out.println(0); 
     }
     //   int result = 10 / 0; //int / int 


     //Approach 2 : Handle Exception
     //Unchecked Exception (Runtime Exception) - Implicitly
     //意外

     try{
        int x = divide(10, 0); //
        //....lines of code....
        String s = "hello";
        s =null;
        System.out.println(s.charAt(2)); //NullPointer Exception
        System.out.println(x);// hello! Divided by Zero:10/0

     } catch (ArithmeticException e){ //補捉依個意外
        //send email ..to... log..
        //insert to DB.
        //意外發生時, 補求措施

        System.out.println("hello! Divided by Zero:" + 10 + "/" + amount);//<handle左
        //VS approch1 : try catch 可以好多行code. 唔同情況

     } catch (NullPointerException e){ 
        System.out.println("NPE: Please check.");  //NPE: Null pointer Exception -> 自己整既意外, 要避開
     }

     try{ 
        double averageExpense = CalculateExpensePerEmpolyee2();
     } catch (ArithmeticException e){
        System.out.println("something to fix....");
     }
     //main() -> CalculateExpensePerEmpolyee() -> getDepartemntExpense() & getEmployeeCount()
    
     try{
        CalculateExpensePerEmpolyee3();
     } catch(EmployeeCountZeroException e){
        //specific handing for employee count = 0.....
     }
    
    }
     //return int 兩回事
     //throw ArithmeticException (Implicitly) (java背後throw左俾你)   throw 只會係throw exception 
     public static int divide(int x, int y){
        return x /y;
    }
//-------Example 2
// Approach 1 補捉到, fix左 , hv solution
    public static int CalculateExpensePerEmpolyee() { //發現BUG, 邊到handle bug >> try catch
    try {
      return getDepartemntExpense() / getEmployeeCount(); // bug
    } catch (ArithmeticException e) {
      return getDepartemntExpense(); // fix
    }
  }

  // Approach 2 懶得理, 有無意下唔理, 掉返出去, 俾A理
  // When a method throw unchecked exception without handling, the exception will be thrown back to caller. (無try catch) caller會出事
  public static int CalculateExpensePerEmpolyee2() {  //A call B, B call C ,B可以handle error
    return getDepartemntExpense() / getEmployeeCount();
  }

  // Approach 3 我捕捉 但同caller講我唔識handle, technical cannot need to change
  //更加表達到問題...spec..人數變左0, 針對employee count zero
  //better handling to caller
  //搵到意外throw 去第到
  public static int CalculateExpensePerEmpolyee3() {
    try {
      return getDepartemntExpense() / getEmployeeCount();
    } catch (ArithmeticException e) { 
      throw new EmployeeCountZeroException(); //throw 去依到
    }
  }

  public static int getEmployeeCount() {
    return 0;
  }

  public static int getDepartemntExpense() {
    return 140000;
  }
}
    //When a method throw unchecked exception with out hangling, the exception will be thrown back to caller
    

//App 2: 咩都唔做
//App 3:因應個別情況做DESIGN, HANDLE /7  
//THROW, WRITE METHOD.
//本質, 淋立場..定位
//nullpointer 明明可以solve 到,要修複

//Summary: 
//補捉意外 > 次序  > 分類
//try: 發生意外個到寫
