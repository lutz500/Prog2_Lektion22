package YinYangThreads;

public class YinYangInterface implements Runnable {
	String text;
	public YinYangInterface(String text) {
		this.text=text;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
				System.out.println(this.text);
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
	}
}


