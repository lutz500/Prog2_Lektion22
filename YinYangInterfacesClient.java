package YinYangThreads;

public class YinYangInterfacesClient {

	public static void main(String[] args) {
		YinYangInterface yi1=new YinYangInterface("Yin");
		YinYangInterface yi2=new YinYangInterface("Yang");
		Thread t1=new Thread(yi1);
		Thread t2=new Thread(yi2);
		t1.start();
		t2.start();
	}

}
