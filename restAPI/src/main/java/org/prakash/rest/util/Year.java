package org.prakash.rest.util;

public class Year {

	public static int isValid(int a) {
		int counts = a ; 
			if (checkForRepeats(a) == false) {
				System.out.println("came here ");
			counts++; 
				
			}else
			{
				return counts;
			}
			

		return a;

	}
	
	public static boolean checkForRepeats(int a)
	{
		
		boolean isValid = false;
		int counter = 0;
		if (a >= 0) {

			
				String num = Long.toString( a);
				System.out.println("Value " + num);
				for (int i = 0; i <= 3; i++) {
					System.out.println("Loop " + i);
					for (int j = 0; j <=3; j++) {
						
						
						if (num.charAt(i) == num.charAt(j))

						{
							counter++;
							System.out.println("counter " + counter);
							
							
						}
						
					}
					

				}
				if (counter == 4) {
					isValid = true;

				} else {
					a++;
				}
			}

		System.out.println(isValid);

		return isValid;
	}

	public static void main(String[] args) {

		System.out.println(isValid(1234));

	}

}
