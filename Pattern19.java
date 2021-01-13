

public class Pattern19 
{
	public static void main(String[] args) 
	{
		int lines =5;
		int star=5;
		int space=0;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=star;j++)
			{
				if(i==1||j==3)
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
		
		
	}
	

}
