package genericlib;
/**
 * @author Thirumala
 */

import java.util.Random;

public class JavaUtil {
	/**
	 * this method is used toget random number
	 * @return num
	 */
	
	public int getRandomNumber() {
		Random random=new Random();
		int num=random.nextInt();
		
		return num;
		
	}

}
