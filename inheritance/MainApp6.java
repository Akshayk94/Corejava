class Music//superclass
{
	void playMusic()
	{
		System.out.println("PLAYING MUSIC");
	}
}

class SonyMusic extends Music //subclass
{
	void playMusic()
	{
		System.out.println("PLAYING SONY MUSIC");
	}
}

class ZeeMusic extends Music //subclass
{
	void playMusic()
	{
		System.out.println("PLAYING ZEE MUSIC");
	}
}

class MainApp6
{
	public static void main(String[] args)
	{
		SonyMusic s1=new SonyMusic();
		s1.playMusic();

		ZeeMusic z1=new ZeeMusic();
		z1.playMusic();
	}
}