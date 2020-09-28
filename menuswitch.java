import java.util.Scanner;

class character 
{
	public static void main(String[] args) 
	{
		Scanner Char = new Scanner (System.in);

		System.out.println("Enter Character");
		char  actualChar = Char.next().charAt(0);
		
		switch (actualChar)
		{
		case 'r':System.out.println("RED");
					break;
		case 'g':System.out.println("GREEN");
					break;
		case 'b':System.out.println("BLUE");
					break;
		default : System.out.println("InvalidSelection");
		
		}
		
	}
}