/**
*this program counts numbers from 1 to 100. 
when the counter reaches a number dividable by 3 it jumps 4 steps. 
when the counter reaches a number divida by 4 it jumpes 3 steps.
*/
class Loop {
	public static void main(String[] args) {
		int n;
		for (int i = 1; i <= 100; i += n) {
			System.out.println(i);
			if (i % 4 == 0 && i % 3 == 0) {
				n = 7; 
			} else if (i % 4 == 0) {
			    n = 3;
			} else if (i % 3 == 0) {
				n = 4;
			} else {
				n = 1;
			}	
		}			
	}
}