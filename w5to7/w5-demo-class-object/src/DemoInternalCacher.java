public class DemoInternalCacher {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; // 3 int value > autobox >  Integer object (heap momory)

    // Internal cache(For number)
    i1 = 127; // i1 = object reference, 127 > (1st) create Interger Object
    i2 = 127;//i2 = obj ref. 127> Interger obj. (2nd reuse the original Integer object)

    System.out.println(i1==i2); // true >>  is asking"Are they same object?"
    //基制: -128  to +127 >> reuse the original object

    Integer i3 = 128; // > 1st create Interger Object
    Integer i4 =128; // 2nd create Interger Object
    System.err.println(i3 == i4); //false >>WHY? (coz out of Internal cache) out of the rules.
    // please reference the graph of vincent who sd out 

    //Important !! 
    //For Class,, u should always compare their objects value by METHOD!! 
    // why dont use == 
    System.out.println(i3.compareTo(i4));//0 
    
    //Useless
    //System.out.println(i3>= i4);/////XX false unmeaningful
    //System.out.println(i1>=i2);//false

    //Float, Double (No internal Cache in JVM) -java virual machine
    Float f1 = 10.12345f;  // autobox : float value >> Float Object
    
    Float f2 = 10.12345f;  // autobox : float value >> Float Object
    System.out.println(f1 == f2); //false , coz float no above, -127-128 (XX interal cache)

    
    Double d1 = 10.12345d;  // autobox : double value >> Double Object
    Double d2 = 10.12345d;  // autobox : double value >> Double Object

    Boolean b1 = true;  // autobox : boolean value >> Boolean Object
    Boolean b2 = true;
    System.out.println(b1 == b2); //true 

    Character c1 = 'c';
    Character c2 = 'c';
    System.out.println(c1==c2); //true
  
    Character c3 = '我'; 
    Character c4 = '我';
    System.out.println(c3 == c4); //false  (same -127 +128 range)

    ///小心蒙湖正確!!! 留意
  }
}
