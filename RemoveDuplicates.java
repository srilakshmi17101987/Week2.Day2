package strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0,i,j;
		String[] array = text.split(" ");
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("****************");
		String temp=null;
		for(i=0;i<array.length-1;i++)
		{
			for(j=i;j<array.length-1;j++)
			{
				if(array[i].equals(array[j]))
				{
					temp=array[i];
					count++;
					
				}
				
				
			}
			
			
			
		}
		if(count>1)
		{
			System.out.println(text.replace(temp, " "));
		}
		
		
		}

	}


