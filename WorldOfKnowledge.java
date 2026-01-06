import java.util.Scanner;

class WorldOfKnowledge 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        int category, book;

        System.out.println("THE WORLD OF KNOWLEDGE");
        System.out.println("WE WELCOME YOU");
        System.out.println("SELECT YOUR OPTIONS");
        System.out.println("1. FICTION");
        System.out.println("2. FANTASY");
        System.out.println("3. BUSINESS");
        System.out.println("4. PSYCHOLOGY");

        System.out.print("Enter category choice: ");
        category = sc.nextInt();

        switch (category) {

            /* ================= FICTION ================= */
            case 1:
                System.out.println("1. Rise of the Fallen");
                System.out.println("2. Shadows Rising");
                System.out.println("3. It Ends With Us");

                System.out.print("Select book: ");
                book = sc.nextInt();

                switch (book) {
                    case 1:
                        System.out.println("Rise of the Fallen");
                        System.out.println("Author: Abhishek Krishnan");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.300");
                        break;

                    case 2:
                        System.out.println("Shadows Rising");
                        System.out.println("Author: Rohan Monteiro");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.250");
                        break;

                    case 3:
                        System.out.println("It Ends With Us");
                        System.out.println("Author: Colleen Hoover");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.350");
                        break;

                    default:
                        System.out.println("Invalid Book Choice");
                }
                break;

            /* ================= FANTASY ================= */
            case 2:
                System.out.println("1. Compass and Blade");
                System.out.println("2. Blood Metal Bone");
                System.out.println("3. The Shadows Between Us");

                System.out.print("Select book: ");
                book = sc.nextInt();

                switch (book) {
                    case 1:
                        System.out.println("Compass and Blade");
                        System.out.println("Author: Rachel Greenlaw");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.370");
                        break;

                    case 2:
                        System.out.println("Blood Metal Bone");
                        System.out.println("Author: Lindsay Cummings");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.275");
                        break;

                    case 3:
                        System.out.println("The Shadows Between Us");
                        System.out.println("Author: Tricia Levenseller");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.304");
                        break;

                    default:
                        System.out.println("Invalid Book Choice");
                }
                break;

            /* ================= BUSINESS ================= */
            case 3:
                System.out.println("1. The Psychology of Money");
                System.out.println("2. Do It Today");
                System.out.println("3. Atomic Habits");

                System.out.print("Select book: ");
                book = sc.nextInt();

                switch (book) 
				{
                    case 1:
                        System.out.println("The Psychology of Money");
                        System.out.println("Author: Morgan Housel");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.300");
                        break;

                    case 2:
                        System.out.println("Do It Today");
                        System.out.println("Author: Darius Foroux");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.100");
                        break;

                    case 3:
                        System.out.println("Atomic Habits");
                        System.out.println("Author: James Clear");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.350");
                        break;

                    default:
                        System.out.println("Invalid Book Choice");
                }
                break;

            /* ================= PSYCHOLOGY ================= */
            case 4:
                System.out.println("1. Dark Psychology Secrets");
                System.out.println("2. Power of Subconscious Mind");
                System.out.println("3. The Courage to Be Disliked");

                System.out.print("Select book: ");
                book = sc.nextInt();

                switch (book) 
				{
                    case 1:
                        System.out.println("Dark Psychology Secrets & Manipulation");
                        System.out.println("Author: Amy Brown");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.300");
                        break;

                    case 2:
                        System.out.println("The Power of Your Subconscious Mind");
                        System.out.println("Author: Joseph Murphy");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.100");
                        break;

                    case 3:
                        System.out.println("The Courage to Be Disliked");
                        System.out.println("Author: Ichiro Kishimi & Fumitake Koga");
                        System.out.println("Language: English");
                        System.out.println("Rate: Rs.350");
                        break;

                    default:
                        System.out.println("Invalid Book Choice");
                }
                break;

            default:
                System.out.println("Invalid Category Choice");
        }

        System.out.println("Thank you for using me");
    }
}