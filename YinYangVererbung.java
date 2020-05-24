package YinYangThreads;

public class YinYangVererbung extends Thread {

	public static void main(String[] args) {
		YinYangVererbung y1=new YinYangVererbung();
		y1.start();
		for(int i=0;i<100;i++) {
			
			runYin();

		}
	}
	public static void runYin() {
		while(true) {
			try {
				sleep(500);
				System.out.println("Yin");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override 
	public void run() {
		while(true) {
			try {
				sleep(500);
				System.out.println("Yang");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
