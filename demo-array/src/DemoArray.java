import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) throws Exception {
        int x1 = 10;
        int x2 = 20;
        int x3 = 30; //30 is int value , while x3 is variable

        // When you create an array object, you have to define the length og it.
        int[] arr = new int[3]; // length > 3   int[3]  , right side is store object.
        // arr[index]
        arr[0] = 10; // only store same type that you defined in line 8
        arr[1] = 20;
        arr[2] = -3;

        // Compile-time Exception (didnt run yet but got red line error)
        // arr[0] = "hello"; // Java Compiler knows that "arr" is an int array which stores int vlaue
        System.out.println(arr[0]);

        System.out.println(arr[1]);

        System.out.println(arr[2]);

        arr[2] = 100;
        System.out.println(arr[2]); // 100

        // Run-time Exception after run error
        // arr[3]=200;
        // System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsExpection

        // intput method 2
        int[] arr2 = new int[] {10, 20, -3};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        // String array > "hello", "abc" , "ijk"
        String[] arr3 = new String[] {"hello", "bye", "abc"};

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        // try bytes, long, double ( double can upgrade to int)


        // Arrays. to print out array in one line.
        System.out.println(Arrays.toString(arr3)); // [hello, bye, abc]
        System.out.println(Arrays.toString(arr2));

        ////for loop
        int[] arr4 = new int[] {9, -3, -100, 90, 66, -4};
        for (int i = 0; i < arr4.length; i++) { // String.length() , int no need
            System.out.println(arr4[i]);


            // find the max value from arr4
            int max = Integer.MIN_VALUE; // <<<<<<the min. value of int
            for (i = 0; i < arr4.length; i++) {
                if (arr4[i] > max) {
                    max = arr4[i];


                }
            }
            System.out.println("MAX: " + max);
        }
        // find min. value
        // int min = Integer.MAX_VALUE;
        // for (i = 0; i < arr4.length; i++);
        // if (arr4[i] < min){
        // min = arr4[i];
        // }
        // System.out.println("Min" + min);
        // }

        //
        char[] arr5 = new char[] {'l', 'e', 'e', 'r', 'q'};
        // 1. count the number of 'e'


        int value = 0;
        for (int j = 0; j < arr5.length; j++) {
            if (arr5[j] == 'e') {
                value++;
            }
        }
        System.out.println(value);

        // 2. boolean result to store if 'r' exists
        boolean isrExist = false;
        for (int j = 0; j < arr5.length; j++) {
            if (arr5[j] == 'r') {
                isrExist = true;
                break;
            }
        }
        System.out.println("Does character r exist? " + isrExist);

        // 3. String result to store "qreel"
        String s = "";
        for (int j = arr5.length - 1; j >= 0; j--) {
            s += arr5[j];
        }
        System.out.println("Reversed char[] = " + s);

        // 4. Given two char[] result
        char[] c1 = new char[] {'o', 'a', 'k', 'p'};
        char[] c2 = new char[] {'a', 'b', 'f', 't'};
        // a. result > "oakpabft" , append all char. to a string value.
        // 4b. result > when even index, the value form c1. WHen odd index, get the vlaue from c2
        //method 1
        String ab = "";
        String cd = "";
        for (int j = 0; j < c1.length; j++) {
            ab += c1[j]; // String value + char >> String
        }
        for (int i = 0; i < c2.length; i++) {
            cd += c2[i];
        }
        System.out.println(ab + cd);

        // 4b. result -> "obkt". when even index, get the value from c1. when odd index, get the value from c2
        String r = "";  //wrong method
        String r1 = "";
        for(int i = 0; i < c1.length; i++){
            if (i % 2 ==0){
                r += c1[i];
            }
        }
        for(int i = 0; i < c2.length; i++){
            if (i % 2 ==1){
                r1 += c2[i];
            }
        }
        System.out.println(r + r1);

        //method 2
        String result2 ="";
        int length = c1.length > c2.length ? c1.length : c2.length;
        for(int i = 0; i<c1.length;i++){
            if (i%2 ==0){
                result2 += c1[i];
            } else {
                result2 += c2[i];
            }
        }
        System.out.println(result2);

        char[] c3 = new char[] {'o', 'a', 'k', 'p', 'a','b'};
        char[] c4 = new char[] {'a', 'b', 'f', 't'};
        //print obkta 
        String result3 = "";
        int lenth = c3.length > c4.length ? c3.length : c2.length;
        for (int i = 0; i < c1.length;i++){
            if (i % 2 == 0 && i <c3.length){
                result3 += c3[i];
            }else if (i % 2 ==1 && i < c4.length){
                result3+=c4[i];
            }
        }
        System.out.println(result3);
    }
}
