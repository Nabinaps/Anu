package inheri;

public class MainHirerchical 
{

	public static void main(String[] args) 
	{
		BallPen p1=new BallPen();
		p1.type="xyz";
		p1.primaryUse();
		MarkPen p2=new MarkPen();
		p2.type="abc";
		p2.primaryUse();
		SketchPen p3=new SketchPen();
		p3.type="pqr";
		p3.primaryUse();
		pen p4=new pen();
		p4.t="asd";
		p4.primaryUse();

	}

}
class pen
{
	String t;
	void primaryUse()
	{
		System.out.println("type of the pen is " +t);
	}
}
class BallPen extends pen
{
	String type;
	void primaryUse()
	{
		System.out.println("type of the pen is "+type);
	}
}
class MarkPen extends pen
{
	String type;
	void primaryUse()
	{
		System.out.println("type of the pen is "+type);
	}
}
class SketchPen extends pen
{
	String type;
	void primaryUse()
	{
		System.out.println("type of the penn is "+type);
	}
}
