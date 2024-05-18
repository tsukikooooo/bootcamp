public class DemoLoop {
    public static void main(String[] args) {
        int x = 3;
        x *= 3; // 9
        x *= 3; // 27
        x *= 3; // 81

        // For Loop 直接離開LOOP
        // initialization ( variable declaration & assignment) ; continue criteria; incrementa operation
        // Step 1: "int i = 0"
        // Step 2: check is i < 4? Yes
        // Step 3: print hello
        // Step 4: i++ >> i become 1
        // Step 5: Check is i < 4 ? Yes
        // Step 6: print hello
        // Step 7: i++ >> i become 2
        // Step 8: check i < 4 ? Yes
        // Step 9: print hello
        // Step 10: i++ >> i become 3
        // Step 11: check i < 4 ? Yes
        // Step 12: print hello
        // Step 13: i++ >> i = 4
        // Step 14: check if i <4? No
        // Step 15:

        for (int i = 0; i < 4; i++) { // 0,1,2,3 write <<< XX <= 4
            System.out.println("hello"); // out put hello x4
        }
        int y = 3;
        for (int i = 0; i < 3; i++) {
            y *= 3;
            System.out.println("y: " + y);
        }

        // print out 2 4 6
        for (int i = 0; i < 7; i++) {
            if (i != 0 && i % 2 == 0) { // loop + if >> % ,, !=
                System.out.println(i);
            }
        }
        // 1 + 2 + 5 .....10
        int sum = 0;
        for (int i = 0; i < 11; i++) { // (i) XX 10
            sum += i; // sum += i + 1 (me ans , but dont use it because need to count)
        }
        System.out.println("sum: " + sum); // 55

        // 2 + 4 + 6 + 8
        int sum2 = 0;
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                sum2 += i;
                System.out.println("sum:" + sum2); //20
            }
        } 
        // 8 
        // 6 
        // 4 
        ///\ 2
        for (int i = 9; i > 0; i-- ){ //    倒序 
            if (i%2 == 0){
                System.out.println("sum3: " + i);
            }
        }
    
        // break
        for (int i = 0; i < 10; i++) {
            if (i > 7){ /// break until 7 ..
                break;  //exit loop
            } //main logic 最好將 break 放最頂部
            System.out.println(i);
        }
     // 0
     //1
     //....
     // 7 
     for (int i=0;i<8;i++){
        System.out.println("ABC: "+i);
     }

     // Continue
     int total = 0;
     for (int i = 0; i < 5; i++){
        if (i > 3){ 
          continue; //直上返i++ when i = 4, skip "total += i" goes to "i++" 會上返去
        }
        total += i; //  0 +1, 1+1, XX2+1, 3+1, 4+1
        System.out.println("total = " + total);

        // i = 0 
        // i = 1 0+1
        // i = 2 1+1 < i is 3 ,-------> so continue 去返i++ (dont show)
        // i = 3 2+1 < i is 4
        // i = 4  <<<< i > 3, continue
        // i = 5 <<<< i > 3, continue
        /// sum :0 + 1 + 2 + 3 = 6
     }
    
    }
}
