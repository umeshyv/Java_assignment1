import java.util.Scanner;

public class printstars{

	public static void main (String[] arg){
		Scanner keyboard =new Scanner (System.in);
		System.out.println(" Please type a number  :");
		int num=keyboard.nextInt();
		drawCross(num);
	}

private static void drawCross(int num) {
 		char[] chars = new char[num];
 		for (int i = 0; i < num; i++) {
 			chars[i] = 'x';
 			chars[num - 1 - i] = 'x';
 			for (int j = 0; j < num; j++) 
  			{
    			if (j == i || j == (num - 1 - i)) 
      			{
        			continue;
      			}
  				chars[j] = '-';
  			}
			System.out.println(new String(chars));
		}
	}
}
