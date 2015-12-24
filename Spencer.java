import java.util.*;
import java.io.*;
public class Spencer
{
	public static void main(String[] args)throws IOException
	{
		String[] fortunes =  {"Tonight, you may or may not have a really bad dream.",
		"Sometimes when you're sad, something will come along to make you happy, but you will lose a loved one in the process.",
		 "You will find Rp. 50,000 on the ground. You will use it all on chicken nuggets.",
		 "Remember when you decided not to leave the party early? Had you left, you would've met the girl of your dreams.",
		 "Your favourite TV character will be killed off, but hey, oreos are on discount.",
		 "Life is hard, but you will be too, because that Panadol you took was actually Viagra.",
		 "Shit happens, but mostly to you.",
		 "You will win an award, however, it will be \"most likely to fail at life\". ",
		 "Your phone will break. You'll get a new one. That will break too. "
		 };
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Spencer, would you like a fortune?");
		int counter = 0;
		while(counter == 0)
		{
		System.out.println("1. Fortune \n2.Share \n3. Exit");
		int choice = kb.nextInt();
		if (choice == 1)
		{
			Random rand = new Random();
			int  n = rand.nextInt(8) + 1;
			String fortune = fortunes[n];
			System.out.println(fortune);

		}
		if (choice == 3)
		{
			System.out.println("the weakness within you is strong. Goodbye.");
			counter = 1;
		}
		if (choice == 2)
		{
			System.out.println("Facebook? Twitter? Instagram? Google+? We're joking, no one uses Google+.");
		}
		}
	}
}
