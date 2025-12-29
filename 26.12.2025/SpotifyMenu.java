import java.util.Scanner;

class SpotifyMenu 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        int artist, category, song;

        System.out.println("SPOTIFY WELCOMES YOU");
        System.out.println("1. A.R. RAHMAN");
        System.out.println("2. ANIRUDH");
        System.out.println("3. HARISH JEYARAJ");
        System.out.println("4. ILLAIYARAJA");
        System.out.println("5. U1");

        System.out.print("Enter artist choice: ");
        artist = sc.nextInt();

        switch (artist) 
		{

            /* ================= A.R. RAHMAN ================= */
            case 1:
                System.out.println("1. Melody");
                System.out.println("2. Kuthu");
                System.out.println("3. Motivational");
                System.out.println("4. Sad");
				
				System.out.print("Enter artist choice: ");
                category = sc.nextInt();

                switch (category)
				{

                    case 1: // Melody
                        System.out.println("1. Ennavale Adi Ennavale");
                        System.out.println("2. Enna Solla Pogirai");
                        System.out.println("3. Netru Illadha Maatram");
                        System.out.println("4. Malargale Malargale");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Ennavale Adi Ennavale ");
							break;
                            case 2: System.out.println("Playing Enna Solla Pogirai "); 
							break;
                            case 3: System.out.println("Playing Netru Illadha Maatram ");
							break;
                            case 4: System.out.println("Playing Malargale Malargale "); 
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 2: // Kuthu
                        System.out.println("1. Thaiya Thaiya");
                        System.out.println("2. Mukkala Mukkabala");
                        System.out.println("3. Urvashi Urvashi");
                        System.out.println("4. Aathichudi");
                        song = sc.nextInt();

                        switch (song)
						{
                            case 1: System.out.println("Playing Thaiya Thaiya "); 
							break;
                            case 2: System.out.println("Playing Mukkala Mukkabala ");
							break;
                            case 3: System.out.println("Playing Urvashi Urvashi "); 
							break;
                            case 4: System.out.println("Playing Aathichudi ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 3: // Motivational
                        System.out.println("1. Vande Mataram");
                        System.out.println("2. Oruvan Oruvan");
                        System.out.println("3. Shakthi Kodu");
                        System.out.println("4. Kappal Yeri Poyachu");
                        song = sc.nextInt();

                        switch (song)
						{
                            case 1: System.out.println("Playing Vande Mataram "); 
							break;
                            case 2: System.out.println("Playing Oruvan Oruvan "); 
							break;
                            case 3: System.out.println("Playing Shakthi Kodu "); 
							break;
                            case 4: System.out.println("Playing Kappal Yeri Poyachu ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 4: // Sad
                        System.out.println("1. Poongatrile");
                        System.out.println("2. Marudaani");
                        System.out.println("3. Minnale En Vazhvin");
                        System.out.println("4. Oru Poiyavathu Sol");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Poongatrile ");
							break;
                            case 2: System.out.println("Playing Marudaani "); 
							break;
                            case 3: System.out.println("Playing Minnale En Vazhvin "); 
							break;
                            case 4: System.out.println("Playing Oru Poiyavathu Sol ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    default:
                        System.out.println("Invalid Category");
                }
                break;

            /* ================= ANIRUDH ================= */
            case 2:
                System.out.println("1. Melody");
                System.out.println("2. Kuthu");
                System.out.println("3. Motivational");
                System.out.println("4. Sad");
				
				System.out.print("Enter artist choice: ");
                category = sc.nextInt();

                switch (category) 
				{

                    case 1: // Melody
                        System.out.println("1. Neeyum Nanum Anbe");
                        System.out.println("2. Velicha Poove");
                        System.out.println("3. Po Indru Neeyaga");
                        System.out.println("4. Nee Partha Vizhigal");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Neeyum Nanum Anbe ");
							break;
                            case 2: System.out.println("Playing Velicha Poove "); 
							break;
                            case 3: System.out.println("Playing Po Indru Neeyaga ");
							break;
                            case 4: System.out.println("Playing Nee Partha Vizhigal "); 
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 2: // Kuthu
                        System.out.println("1. Vaathi Raid ");
                        System.out.println("2. Naa Ready");
                        System.out.println("3. Badass");
                        System.out.println("4. Vandha Edam");
                        song = sc.nextInt();

                        switch (song)
						{
                            case 1: System.out.println("Playing Vaathi Raid "); 
							break;
                            case 2: System.out.println("Playing Naa Ready ");
							break;
                            case 3: System.out.println("Playing Badass "); 
							break;
                            case 4: System.out.println("Playing Vandha Edam ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 3: // Motivational
                        System.out.println("1. Vellai Illa Pattathari");
                        System.out.println("2. Boomi Enna Suthuthu");
                        System.out.println("3. Ethir Neechal");
                        System.out.println("4. Surviva");
                        song = sc.nextInt();

                        switch (song)
						{
                            case 1: System.out.println("Playing  Vellai Illa Pattathari "); 
							break;
                            case 2: System.out.println("Playing Boomi Enna Suthuthu "); 
							break;
                            case 3: System.out.println("Playing Ethir Neechal "); 
							break;
                            case 4: System.out.println("Playing Surviva ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 4: // Sad
                        System.out.println("1. Porkanda Singam");
                        System.out.println("2. Kanave Kanave");
                        System.out.println("3. Kannaana kanney");
                        System.out.println("4. Jodi Nilave");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Porkanda Singam ");
							break;
                            case 2: System.out.println("Playing Kanave Kanave "); 
							break;
                            case 3: System.out.println("Playing Kannaana kanney "); 
							break;
                            case 4: System.out.println("Playing Jodi Nilave ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    default:
                        System.out.println("Invalid Category");
                }
                break;
                   
            /* ================= HARISH JEYARAJ ================= */
            case 3:
                System.out.println("1. Melody");
                System.out.println("2. Kuthu");
                System.out.println("3. Sad");
				
				System.out.print("Enter artist choice: ");
                category = sc.nextInt();

                switch (category)
				{

                    case 1: // Melody
                        System.out.println("1. Unnale Unnale");
                        System.out.println("2. Annul maele");
                        System.out.println("3. Vaseegara");
                        System.out.println("4. Partha Muthal");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Unnale Unnale ");
							break;
                            case 2: System.out.println("Playing Annul maele "); 
							break;
                            case 3: System.out.println("Playing Vaseegara ");
							break;
                            case 4: System.out.println("Playing Partha Muthal "); 
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 2: // Kuthu
                        System.out.println("1. Tirunelveli Halwa da");
                        System.out.println("2. Aradi Katre");
                        System.out.println("3. Soda Bottle");
                        System.out.println("4. Aruva Meesai");
                        song = sc.nextInt();

                        switch (song)
						{
                            case 1: System.out.println("Playing Tirunelveli Halwa da "); 
							break;
                            case 2: System.out.println("Playing Aradi Katre ");
							break;
                            case 3: System.out.println("Playing Soda Bottle "); 
							break;
                            case 4: System.out.println("Playing Aruva Meesai ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 3: // Sad
                        System.out.println("1. Venmathiye");
                        System.out.println("2. Oh maname");
                        System.out.println("3. Yamma Yamma");
                        System.out.println("4. Othaiyile");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Venmathiye ");
							break;
                            case 2: System.out.println("Playing Oh maname "); 
							break;
                            case 3: System.out.println("Playing Yamma Yamma "); 
							break;
                            case 4: System.out.println("Playing Othaiyile ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    default:
                        System.out.println("Invalid Category");
                }
                break;


            /* ================= ILLAIYARAJA ================= */
            case 4:
                System.out.println("1. Melody");
                System.out.println("2. Kuthu");
                System.out.println("3. Sad");
				
				System.out.print("Enter artist choice: ");
                category = sc.nextInt();

                switch (category)
				{

                    case 1: // Melody
                        System.out.println("1. Oru Kili Uruguthu");
                        System.out.println("2. Kuzhaloodhum Kannanuku");
                        System.out.println("3. Ennai Thottu");
                        System.out.println("4. Raja Raja cholan");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Oru Kili Uruguthu ");
							break;
                            case 2: System.out.println("Playing Kuzhaloodhum Kannanuku"); 
							break;
                            case 3: System.out.println("Playing Vaseegara ");
							break;
                            case 4: System.out.println("Playing Raja Raja cholan"); 
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 2: // Kuthu
                        System.out.println("1. Ooruvittu Ooruvanthu");
                        System.out.println("2. Nooru Varusam");
                        System.out.println("3. Aasai Nooruvagai");
                        System.out.println("4. Aasai Athigam Vachu");
                        song = sc.nextInt();

                        switch (song)
						{
                            case 1: System.out.println("Playing Ooruvittu Ooruvanthu "); 
							break;
                            case 2: System.out.println("Playing Nooru Varusam ");
							break;
                            case 3: System.out.println("Playing Aasai Nooruvagai "); 
							break;
                            case 4: System.out.println("Playing Aasai Athigam Vachu ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 3: // Sad
                        System.out.println("1. Kanne Kalaimane");
                        System.out.println("2. Thene Thenpaandi Neeye");
                        System.out.println("3. Paadi Parantha Kili");
                        System.out.println("4. Nilave Vaa");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Kanne Kalaimane");
							break;
                            case 2: System.out.println("Playing Thene Thenpaandi Neeye "); 
							break;
                            case 3: System.out.println("Playing Paadi Parantha Kili "); 
							break;
                            case 4: System.out.println("Playing Nilave Vaa ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    default:
                        System.out.println("Invalid Category");
                }
                break;

            /* ================= U1 ================= */
            case 5:
                System.out.println("1. Melody");
                System.out.println("2. Kuthu");
                System.out.println("3. Motivational");
                System.out.println("4. Sad");
				
				System.out.print("Enter artist choice: ");
                category = sc.nextInt();

                switch (category)
				{

                    case 1: // Melody
                        System.out.println("1. Aathadi Mnasuthan");
                        System.out.println("2. Chinna Sirisu");
                        System.out.println("3. Venmeggam");
                        System.out.println("4. Iayyayyo");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Aathadi Mnasuthan ");
							break;
                            case 2: System.out.println("Playing Chinna Sirisu "); 
							break;
                            case 3: System.out.println("Playing Venmeggam ");
							break;
                            case 4: System.out.println("Playing Iayyayyo "); 
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 2: // Kuthu
                        System.out.println("1. Machi Open The Bottle");
                        System.out.println("2. Saroja Saman Nikalo");
                        System.out.println("3. No Money No Money");
                        System.out.println("4. Villayadu Mankatha");
                        song = sc.nextInt();

                        switch (song)
						{
                            case 1: System.out.println("Playing Machi Open The Bottle "); 
							break;
                            case 2: System.out.println("Playing Saroja Saman Nikalo ");
							break;
                            case 3: System.out.println("Playing No Money No Money "); 
							break;
                            case 4: System.out.println("Playing Villayadu Mankatha ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 3: // Motivational
                        System.out.println("1. Edhirthu Nil");
                        System.out.println("2. Oru Nalil");
                        System.out.println("3. Nimirnthu Nil");
                        System.out.println("4. Ungakkule Mirugam");
                        song = sc.nextInt();

                        switch (song)
						{
                            case 1: System.out.println("Playing Edhirthu Nil "); 
							break;
                            case 2: System.out.println("Playing Oru Nalil "); 
							break;
                            case 3: System.out.println("Playing Nimirnthu Nil "); 
							break;
                            case 4: System.out.println("Playing Ungakkule Mirugam ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    case 4: // Sad
                        System.out.println("1. Kadhal Valarthen");
                        System.out.println("2. Yedho Ondru Ennai");
                        System.out.println("3. Pogadhe");
                        System.out.println("4. Ninaithu Ninaithu");
                        song = sc.nextInt();

                        switch (song) 
						{
                            case 1: System.out.println("Playing Kadhal Valarthen");
							break;
                            case 2: System.out.println("Playing Yedho Ondru Ennai "); 
							break;
                            case 3: System.out.println("Playing Pogadhe "); 
							break;
                            case 4: System.out.println("Playing Ninaithu Ninaithu ");
							break;
                            default: System.out.println("Invalid Song");
                        }
                        break;

                    default:
                        System.out.println("Invalid Category");
                }
                break;
		}
     	 System.out.println("Thank you for using Spotify");
	}
}