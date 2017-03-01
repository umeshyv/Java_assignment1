public class addition{

     public static void main(String []args){
        System.out.println(" Sum of 110 add 200 is : " + add(110, 200));



     }
     public static int add(int a, int b){
     while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
     }

}