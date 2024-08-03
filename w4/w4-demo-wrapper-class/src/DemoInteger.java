public class DemoInteger {
    public static void main(String[] args)  {
        int x=1;
        Integer x2 = 1;
        System.out.println(x);
        System.out.println(x2);

        x = x +3;
        x-=10;

        x2 = x2 +3;
        x2 -= 10;
        // Integer is a wrapper class
        // class has method
        short s = (short) x;

        x2+=60000; // short only 30000something
        short s2 = x2.shortValue(); //overflow, similar to explicit conversion 強行做, 命令
        System.out.println(s2);

        double d1 = x2.doubleValue();
        System.out.println(d1);

        //Comparsion (>, < >=, <=,== ,!=) < FOR premivisive not int value
        float s3 = x2.floatValue();
        System.out.println(s3);

        //For Integer (Warapper class comparsion), compareTo()
        Integer x3 = 4;
        Integer x4 = 8;
        Integer x5 = 0;
        boolean result = x4>x3; // true (compare int value)

        System.out.println(x4.compareTo(x3));      
        System.out.println(x3.compareTo(x4));
        System.out.println(x4.compareTo(x5));

        boolean result2 = x4.compareTo(x3) >0; // compare Interger value)
        boolean result3 = x4.compareTo(x3) <0;
        boolean result4 = x4.compareTo(x5) == 0; // << more safe     
        
        //DOuble, byte, short, integer , long , double, float
        
        Float f1 = 10.0f; //10.0 f is a float value > autobox > float value
        Float f2 = new Float(10.0); //out day, xx auto box, create float object, storing a floar value
        Long l2 = f2.longValue();
        
        double d3 = new Double("10.3");
      //  long l3 = d3.longValue();
      //  System.out.println(l3); //10

        Character c1 = new Character('a');
        char c2 = Character.toUpperCase('b'); //static method
        System.out.println(c2);
       // System.out.println(Character.toLowerCase("M"));  // Class name . method name

        Boolean b3 = new Boolean(false);
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(true);
        System.out.println(b3.compareTo(b4)); // -1  , == means 0 ,, so if use "==" will easy got mistake.
        System.out.println(b5.compareTo(b4));

        System.out.println(b3 == b4);//false
        System.out.println(b5 == b4); // false ??!! this beacase of "object".

        // Autobox VS unbox
         Integer i7 = 9; //9 is an int valur > autobox > Integer object   
         int i8 = i7; // i7 is Integer object >> unbox ( from i7 to i8)

         Integer i9 = new Integer(9); //UP
         int i10 = i9.intValue(); // DOWN  this is an order !!  to do this .

         Integer i11 = Integer.valueOf(9); //static method, the result is as same as"new Integer(9)"" ,, memeory has diifferent as new Interger()
         int i12 = Integer.parseInt("10"); //  XX"10a"\
         System.out.println(i12);

         Integer i13 = Integer.parseInt("10a");
         System.out.println(i13);

         System.out.println(new Byte("10")); //int  //byte 
         System.out.println(new Byte(byte)10); // maybe over > 127




    }
}
