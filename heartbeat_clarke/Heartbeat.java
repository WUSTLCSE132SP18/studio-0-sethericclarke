
public class Heartbeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sleep =0.0;

		while(true) {

			try {
				
				
				Thread.sleep(1000);
				sleep += 1;
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(sleep);
		}
	}
}
