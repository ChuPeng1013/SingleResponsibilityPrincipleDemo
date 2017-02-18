package SingleResponsibilityPrinciple;

public class Allen implements PersonBehavior 
{
	
	public boolean programming(boolean study) 
	{
		if(study)
		{
			System.out.println("该学习了，快去编程......");
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean playing(boolean game) 
	{
		if(game)
		{
			System.out.println("该休息了，快去玩耍......");
			return true;
		}
		else
		{
			return false;
		}
	}
}
