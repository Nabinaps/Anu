package inheri;
class Sports 
{
	int players;
	void dis()
	{
		System.out.println(players);
	}
	public static void main(String[] args) 
	{
		Cricket c=new Cricket();
		c.players=11;
		c.teamName="India";
		Football f=new Football();
		f.leagueName="WC";
		c.dis();
		c.di();
		f.dis();
		f.d();
		
	}


}
class Cricket extends Sports
{
	String teamName;
	void di()
	{
		System.out.println(teamName);
	}
}
class Football extends Sports
{
	String leagueName;
	void d()
	{
		System.out.println(leagueName);
	}
}
/*class Driver
{
	public static void main(String[] args) 
	{
		Cricket c=new Cricket();
		c.players=11;
		c.teamName="India";
		Football f=new football();
		f.leagueName="WC";
		c.dis();
		c.di();
		f.dis();
		f.d();
		
	}
}*/
