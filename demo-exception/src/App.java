import java.util.EmptyStackException;

public class App {
    public static void main(String[] args) {
     int amount = 0;
     System.out.println(divide(10, 2));//5.0
     System.out.println(divide(10, amount)); //exception 

     //approach 1

     if (amount != 0){
        System.out.println(divide(10, amount));
     } else{
        System.out.println(0);
     }
     //   int result = 10 / 0; //int / int 


     //Approach 2 : Handle Exception
     //Unchecked Exception (Runtime Exception) - Implicitly
    
     try{
        divide(10, 2);
        //....lines of code....
        String s = "hello";
        s =null;
        System.out.println(s.charAt(2)); //NullPointer Exception

     } catch (ArithmeticException e){ //補捉依個意外
        //send email ..to... log..insertXX in DB.
        System.out.println("hello! Divided by Zero:" + 10 + "/" + amount);
     } catch (NullPointerException e){
        System.out.println("NPE: Please check.");
     }
     try{
        CalculateExpersPerEmoyedee()
        //specific handing for employee count = 0.....
     }
     //java.lang.ArithmeticException : / by Zero
    
     public static int divide(int x, int y){
        return x /y;
    }


    //return int
    //throw ArithmeticException(Implicitly) (java背後throw左俾你)
  
    public int expensePerEmoloyee(){
        return getDepartmentExpense() / 
    public static int getEmployeeCount(){
        return 0;
    }

    public static int getDepartmentExpense(){
        return 140000;
    }

    //Apprach 3
    public static int CalculateExpersPerEmoyedee(3)
    try{
        return getDepartmentExpense() / getDepartmentExpense();
    }catcj(ArithmeticException e){
        throw new EmptyStackException();
    }
    //When a method throw unchecked exception with out hangling, the exception will be thrown back to caller
    
}
//App 2: 咩都唔做
//App 3:因應個別情況做DESIGN, HANDLE /7  
//THROW, WRITE METHOD.
//本質, 淋立場..定位
//nullpointer 明明可以solve 到
