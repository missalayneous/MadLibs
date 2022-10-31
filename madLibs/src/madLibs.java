//Import scanner
import java.util.Scanner;

public class madLibs {
    public static void main(String args[]) {

        //Assign variable to scanner
        Scanner input = new Scanner(System.in);

        //declare response variable as yes so the loop runs at least once
        String response = "yes";

        //begin while loop
        while (response.equalsIgnoreCase("yes")) {

            //Greeting
            System.out.println("Get ready for some Madlibs!!!\n");

            //Refresher of input types
            System.out.println("First, a quick refresher:\nNoun - A person, place, or thing\n" +
                    "Adjective - Describes a noun. E.g: shiny, dull\n" +
                    "Verb - What you do. E.g: Run, Jump, Swim\n" +
                    "Adverb - How something is done. E.g: slowly, quickly\n" +
                    "Exclamation - Yikes!, Gadzooks!\n");

                //Choose Category
                System.out.println("Please select a story theme: Computers, Gaming, or Art.");
                String theme = input.next();

                //if they choose computers
                if (theme.equalsIgnoreCase("Computers")) {

                    //confirm Computers input statement
                    System.out.println("You chose Computers. A great choice!\n");

                    //Get first comp input
                    System.out.println("Please enter an adverb!");
                    String s1 = input.next();

                    //Get second comp input
                    System.out.println("Please enter an adjective!");
                    String s2 = input.next();

                    //Get third comp input
                    System.out.println("Please enter a noun!");
                    String s3 = input.next();

                    //Get fourth comp input
                    System.out.println("Please enter a verb!");
                    String s4 = input.next();

                    //Get fifth comp input
                    System.out.println("Please enter a part of the body, plural!");
                    String s5 = input.next();

                    //Get sixth comp input
                    System.out.println("Please enter a noun!");
                    String s6 = input.next();

                    //Get seventh comp input
                    System.out.println("Please enter an exclamation!");
                    String s7 = input.next();

                    //Get eight comp input
                    System.out.println("Please enter a past tense verb!");
                    String s8 = input.next();

                    //Get ninth comp input
                    System.out.println("Please enter a place!");
                    String s9 = input.next();

                    //make variable to hold Computers Story
                    String Computers = ("My computer was running so " + s1 +
                            " lately! I decided to open the " + s2 + " case and see what was inside.\n" +
                            "I grabbed a " + s3 + " and began to " + s4 + " the case. I couldn't believe my " + s5 + "!! There was a "
                            + s6 + " where the CPU should be!\nI yelled, '" + s7 + "!!' and " + s8 + " my computer to the nearest " + s9 + ". \n");

                    //Print out Madlib
                    System.out.println("Your Madlib:\n");
                    System.out.println(Computers);

                }//end computers if statement

                //else if they choose gaming
                else if (theme.equalsIgnoreCase("Gaming")) {

                    //confirmation statement
                    System.out.println("You chose Video Games. A great choice!\n");

                    //Get first vg input
                    System.out.println("Please enter an adjective!");
                    String v1 = input.next();

                    //Get second vg input
                    System.out.println("Please enter a noun!");
                    String v2 = input.next();

                    //Get third vg input
                    System.out.println("Please enter a past tense verb!");
                    String v3 = input.next();

                    //Get fourth vg input
                    System.out.println("Please enter an adverb!");
                    String v4 = input.next();

                    //Get fifth vg input
                    System.out.println("Please enter a verb!");
                    String v5 = input.next();

                    //Get sixth vg input
                    System.out.println("Please enter a number greater than 1!");
                    String v6 = input.next();

                    //Get seventh vg input
                    System.out.println("Please enter a past tense verb!");
                    String v7 = input.next();

                    //Get eighth vg input
                    System.out.println("Please enter a verb!");
                    String v8 = input.next();

                    //Get ninth vg input
                    System.out.println("Please enter an adverb!");
                    String v9 = input.next();

                    //Get tenth vg input
                    System.out.println("Please enter an adjective!");
                    String v10 = input.next();

                    //Get eleventh vg input
                    System.out.println("Please enter a plural noun!");
                    String v11 = input.next();

                    //Get twelfth vg input
                    System.out.println("Please enter an exclamation!");
                    String v12 = input.next();


                    //make variable to hold Video Games Story
                    String videoGames = ("The first edition of " + v1 + " " + v2 + " Baddies came out today! " +
                            "I " + v3 + " to the store as " + v4 + " as I could. \n" +
                            "I had to " + v5 + " in line for " + v6 + " hours, but it was worth it. " +
                            "I " + v7 + " home and put the disk into my " + v8 + "station and waited " + v9 + ". \n" +
                            "The machine made a " + v10 + " sound and " + v11 + " began to pour out of the sides. \n" +
                            "'Oh, " + v12 + "!!' I yelled. I wouldn't get to play today after all...\n");

                    //Print out Madlib
                    System.out.println("Your Madlib:\n");
                    System.out.println(videoGames);

                }//end Video Games if statement

            //else if they choose Art
                else if (theme.equalsIgnoreCase("Art")) {

                    //confirmation statement
                    System.out.println("You chose Art. A great choice!\n");

                    //Get first Art input
                    System.out.println("Please enter a place!");
                    String a1 = input.next();

                    //Get second Art input
                    System.out.println("Please enter a number greater than 1!");
                    String a2 = input.next();

                    //Get third Art input
                    System.out.println("Please enter an adjective!");
                    String a3 = input.next();

                    //Get fourth Art input
                    System.out.println("Please enter a noun!");
                    String a4 = input.next();

                    //Get fifth Art input
                    System.out.println("Please enter a verb ending in -ing!");
                    String a5 = input.next();

                    //Get sixth Art input
                    System.out.println("Please enter an adjective!");
                    String a6 = input.next();

                    //Get seventh Art input
                    System.out.println("Please enter an adverb!");
                    String a7 = input.next();

                    //Get eighth Art input
                    System.out.println("Please enter an adjective!");
                    String a8 = input.next();

                    //Get ninth Art input
                    System.out.println("Please enter a noun!");
                    String a9 = input.next();

                    //Get tenth Art input
                    System.out.println("Please enter a flower or plant!");
                    String a10 = input.next();

                    //make variable to hold Art Story
                    String Art = ("Today, we are going to the " + a1 + " of Art! I could spend " + a2 + " hours there. \n" +
                            "There are so many " + a3 + " artists to see there. One of my favorites is the Girl with a " + a4 + " Earring by Johannes Vermeer. \n" +
                            "The painting is in the Baroque style which is classified by " + a5 + " colors, movement, and " + a6 + " details. \n" +
                            "Impressionism is another famous style of painting, " + a7 + " seen in Vincent Van Gogh's work " +
                            "The " + a8 + " Night or Claude Monet's The " + a9 + " " + a10 + " Pond.\n");

                    //Print out Madlib
                    System.out.println("Your Madlib:\n");
                    System.out.println(Art);

                }//end Art if statement

                //Ask user if they want to enter another word
                System.out.println("Would you like to play again? [Yes/No]");

                //get answer from user
                response = input.next();

        }//end while loop

    }//end class
    }//end main

