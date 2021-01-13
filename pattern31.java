
public class pattern31
{
	public static void main(String[] args) 
	{
		System.out.println("program started");
		int lines=5;
		int star=5;
		int mid=(lines+1)/2;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=star;j++)
			{
				if(i==1||j==1||j==lines||i==mid||i==lines)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("program ended");
		
	}

}
