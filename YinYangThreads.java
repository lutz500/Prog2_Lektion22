package YinYangThreads;

public class YinYangThreads extends Thread {
	String text;
	public YinYangThreads(String text) {
		this.text=text;
	}
	@Override
	public void run() {
		try {
			sleep(5000);
			System.out.println(this.text);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
