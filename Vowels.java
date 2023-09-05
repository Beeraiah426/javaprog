class Vowels
{
	public static void main(String[] args)
	{
		char be='A';
		if(be>=65 && be<=90)
		{
			if(be=='A' || be=='E' || be=='I' ||be=='O' || be=='U')
			{
				System.out.println("it is VOWEL");
			}
			else
			{
				System.out.println("it is CONSONANT");
			}
		}
		else if(be>=97 && be<=122)
			{
				if(be=='a' || be=='e' || be=='i' || be=='o' || be=='u')
				{
					System.out.println("it is vowel");
				}
				else
				{
					System.out.print("consonant");
				}
			}
		else
		{
			System.out.println("it is not a vowel");
		}
		
		}
}