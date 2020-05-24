package YinYangThreads;

public class YinYangClient {

	public YinYangClient() {
		YinYangThreads y1=new YinYangThreads("Yin");
		YinYangThreads y2=new YinYangThreads("Yang");
		
		y1.run();
		y2.run();
	}
	

}
