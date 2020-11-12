public class ANS1 extends Thread
{
	public static void main(String[] args)
	{
		ANS1 c = new ANS1();
		c.start();
	}

	public void run()
	{
		System.out.println("Program started.");
		for(int i=1;i<=100;i++)
		{
			if (i%10 == 0)
			{
				System.out.println(i + " seconds passed.");
			}

			else
			{
				System.out.println(i);
			}
		
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}