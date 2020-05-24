package YinYangThreads;

public class YinYanglokalClass {

	public static void main(String[] args) {
		
		class LocalYinYangThread extends Thread{
			String text;
			public LocalYinYangThread(String text){
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
		
		LocalYinYangThread yyt1=new LocalYinYangThread("Yin");
		LocalYinYangThread yyt2=new LocalYinYangThread("Yang");
		yyt1.start();
		yyt2.start();
	}
}
