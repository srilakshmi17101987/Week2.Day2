package strings;

public class Sumofdigitsfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum=0;
		String str=text.replaceAll("\\D","");
		System.out.println(str);
		char[] num=str.toCharArray();
		int size=num.length;
		System.out.println("size is"+size);
		
		for(int i=0;i<num.length;i++)
		{
			int j= Character.getNumericValue(num[i]);
			System.out.println(i +"th character is:"+num[i]);
			sum=sum+j;
			
		}
		
		System.out.println("The sum of digits "+sum);
		
		}

		

	}


