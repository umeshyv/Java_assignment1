public class printascii
{
    public static void main(String args[])
    {
	
        String ch;
        int i;
        for(i=65; i<=90; i++)
        {
            ch = new Character((char)i).toString();
            System.out.print("ASCII value of " + i + " -> " + ch + "\n");
        }
		
    }
}