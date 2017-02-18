package SingleResponsibilityPrinciple;

public interface person 
{	
	//身高属性
	public void setHeight(double height);
	public double getHeight();
	//体重属性
	public void setWeight(double weight);
	public double getWeight();
	//学习行为
	public boolean programming(boolean study);
	//娱乐行为
	public boolean playing(boolean game);
}