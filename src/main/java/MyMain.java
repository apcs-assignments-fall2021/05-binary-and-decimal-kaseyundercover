import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
       String x="";
       if(decimal==0){
           return "0";
       }
        while(decimal>0){
           int mod=decimal%2;
            decimal=decimal/2;
           x=mod+x;


       }
        return x;


    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number in binary format");
        String binary = scan.nextLine();
        System.out.println(binaryToDecimal(binary));

        System.out.println("enter a number in decimal format");
        int decimal = scan.nextInt();
        System.out.println(decimalToBinary(decimal));
    }
}
