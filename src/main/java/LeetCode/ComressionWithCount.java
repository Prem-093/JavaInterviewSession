package LeetCode;

public class ComressionWithCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//i=1
		//i-1=0
		//count=2
		//i=2
		//i-1=1
		//count=3
		//i=3
		//i-1=2
		//count=4
		//i=4
		//i-1=3
		//ss=count
		//count=1
		//ss=b
		//a4b
		//i=5
		//i-1=4
		//count=2
		//i=6
		//i-1=5
		//ss=count
		//count=1
		//ss=curr
		//a4b2c
		//i=7
		//i-1=6
		//count=1
		//ss=curr
		//a4b2cd
		//i=8
		//i-1=7
		//count=2
		//i=9
		//i-1=8
		//count=3
		//i=10
		//loop terminate
		String s = "aaaabbcddd";
		String ss = s.charAt(0) + "";
		int count = 1;

		
		for (int i = 1; i <= s.length() - 1; i++) {
			char curr = s.charAt(i);
			char prev = s.charAt(i - 1);

			if (curr == prev) {
				count++;
			} else {
				if (count > 1) {
					ss += count;
					count = 1;
					
				}
				ss += curr;
			}

		}

		if (count > 1) {
			ss += count;
			count=1;
			
		}
		
		
		System.out.println(ss);
		

	}

}
