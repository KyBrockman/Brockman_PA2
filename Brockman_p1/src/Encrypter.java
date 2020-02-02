
public class Encrypter {

	public Encrypter() {
	}
		public void Encrypt(int code) {
			
			int i,temp;
		
		
		//break the code into ints
		int[] brokenCode = new int[4];
		brokenCode[0] = code/1000;
		brokenCode[1] = (code/100)%10;
		brokenCode[2] = (code/10)%10;
		brokenCode[3] = code%10;
		
		// add 7 to each value
		for(i = 0;i<4;i++) {
			
			brokenCode[i] = brokenCode[i]+7;
			
		//results:7,8,9,10,11,12,13,14,15,16
		//%10 each value
			
			brokenCode[i] = brokenCode[i]%10;
		//results 7,8,9,0,1,2,3,4,5,6
	}
		//swap first and third digit
		temp = brokenCode[0];
		brokenCode[0] = brokenCode[2];
		brokenCode[2] = temp;
		
		//swap second and fourth digit
		
		temp = brokenCode[1];
		brokenCode[1] = brokenCode[3];
		brokenCode[3] = temp;
		
		//print new code
		for(i=0; i<4; i++) {
			System.out.print(brokenCode[i]);
		}
	}
}
