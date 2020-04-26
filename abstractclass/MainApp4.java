abstract class WhatsAppV1
{
	void chatting()
	{
		System.out.println("CHATTING FEATURE");
	}

	abstract void voiceCall();

	abstract void liveLocation();
}

abstract class WhatsAppV2 extends WhatsAppV1
{
	void voiceCall()
	{
		System.out.println("VOICE CALL FEATURE");
	}
}

class WhatsAppV3 extends WhatsAppV2
{
	void liveLocation()
	{
		System.out.println("SHARE LIVE LOCATION");
	}
}

class MainApp4
{
	public static void main(String[] args)
	{
		WhatsAppV3 w=new WhatsAppV3();
		w.chatting();
		w.voiceCall();
		w.liveLocation();

	}
}

