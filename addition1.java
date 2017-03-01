public class addition1{

     public static void main(String []args){
        add(20, 10);
     }
     public static void add(int a, int b){
     
        int b1 = a-- - --a;
        System.out.println(" Value of b1= " + b1 );
        int c = a--;
        System.out.println(" Value of c= " + c );
        int d = a>>2;
        System.out.println(" Value of d= " + d );
        int e = a&b;
        System.out.println(" Value of e= " + e );
     }

}