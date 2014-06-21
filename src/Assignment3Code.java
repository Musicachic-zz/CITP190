/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 6/16/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

public class Assignment3Code
{
	public static void main(String args[])
	{
		multiplicationTable();
		System.out.println();
		System.out.println();
		squareTable();
		System.out.println();
		System.out.println();
		multiplicationSquareTable();

	}

	public static void multiplicationTable()
	{
		int x;
		int y;
		for (x = 1; x < 11; x++)
		{
			System.out.print("\t\t" + x);
		}
		for (x = 1; x < 11; x++)
		{
			System.out.print("\n" + x);
			for (y = 1; y < 11; y++)
			{

				System.out.print("\t\t" + (x * y));
			}

		}
	}

	public static void squareTable()
	{
		int x;

		for (x = 1; x < 11; x++)
		{
			System.out.print(x + "\t\t" + (x * x) + "\n");
		}
	}

	public static void multiplicationSquareTable()
	{
		int x;
		int y;
		for (x = 1; x < 11; x++)
		{
			System.out.print("\t\t" + x);
		}
		for (x = 1; x < 11; x++)
		{
			System.out.print("\n" + x);
			for (y = 1; y < 11; y++)
			{
				int z = (int) (Math.pow(x, 2) + (Math.pow(y, 2)));
				System.out.print("\t\t" + z);
			}

		}

	}
}

