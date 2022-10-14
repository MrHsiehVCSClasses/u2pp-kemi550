package projectName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        //Welcomes to store
        System.out.println("\n");
        System.out.println("Welcome to the Winter Sports Store! I'll be showing you around.");
        System.out.println("\n");
        //Instantiates and gives general stats of preset values 
        winterSportInfo mywinterSportInfo = new winterSportInfo("intermediate",5.8);
        System.out.println("For reference my here are some of my general stats:");
        System.out.println(mywinterSportInfo.toString());
        System.out.println("\n");
        //Instantiates and gives my own personal snowbaord setup (preset values)
        snowboard mysnowboard = new snowboard("intermediate", 5.8, "medium-flex", 152.00, "medium-stiff",10);
        System.out.println("I perfer snowboarding, here is my setup:");
        System.out.println(mysnowboard.toString());
        //Instantiates myski
        ski myski = new ski("beginner", 5.8, true,160.00,11);

        System.out.println("\n");
        System.out.println("Enough about me, let's make a setup for you so you can enjoy all that winter sports have to offer!");
        
        Scanner input = new Scanner(System.in);
        int choice = 1;

        while(choice > 0) {
            //Lets user decided what they want to learn/setup (Snowboard or Ski)
            System.out.println("First of all, what winter sport are you interested in? \nEnter 1 for Snowboarding, 2 for Skiing, or 0 to quit.");
            choice = input.nextInt();
            input.nextLine();
            if(choice == 1) {
                //Gets user Skill Level 
                System.out.println("First of all, what is your skill level?");
                String skillLvlInput = input.nextLine();
                mysnowboard.setnewSkillLvl(skillLvlInput);
                System.out.println("Cool you are a " + mysnowboard.getSkillLvl()+ "!");
                System.out.println("\n");
                //Gets user Binding Type
                System.out.println("Now, what type of bindings would you like?\nHere are some general guidelines:\n Soft: Less Control More Flexibility\n Stiff: More Control Less Flexibility\n Medium: The best of both worlds");
                String bindingInput = input.nextLine();
                mysnowboard.setnewBinding(bindingInput);
                System.out.println("Great a " + mysnowboard.getBinding() + " seems like a good fit.");
                System.out.println("\n");
                //Gets user Height
                System.out.println("What is your height?");
                double heightInput = input.nextDouble();
                mysnowboard.setnewHeight(heightInput);
                System.out.println("Wow you are " + mysnowboard.getHeight() + "?\ncool beans");
                System.out.println("\n");
                //Gets user Board Length
                System.out.println("Next probably the most important part, board length\nA general rule of thumb is to have your board up to your neck or to your chin\nThe smaller the board the more control\nEnter your board length in cms ");
                double boardlengthInput = input.nextDouble();
                mysnowboard.setnewBoardLength(boardlengthInput);
                System.out.println("Nice your board is " + mysnowboard.getBoardLength() + " cms long");
                System.out.println("\n");
                //Gets user Boot Type
                System.out.println("Next, lets choose what type of boot you would like\nJust like bindings boots have a variety of Stiffness: Soft, Medium, and Stiff\nStiffer boots tend to give you more control but some prefer Soft boots for their flexbility");
                String boottypeInput = input.next();
                mysnowboard.setnewBootType(boottypeInput);
                System.out.println("Wicked you have " + mysnowboard.getBootType() + " type boots");
                System.out.println("\n");
                //Gets user Boot Size
                System.out.println("Finally let's get your boot size\nwhat size are your grippers");
                int bootsizeInput = input.nextInt();
                mysnowboard.setnewBootSize(bootsizeInput);
                System.out.println("Bro fr got " + mysnowboard.getBootSize() + " size feet :skullemoji:");
                System.out.println("\n");
                //Gives user summary of Stats and Snowboard Build
                System.out.println("Looks like we are all done here are your stats and setup: " + "\n" + mysnowboard.toString());
                //System.out.println("Looks like we are all done here are your stats and setup: " + "\nSkill Level: " + mysnowboard.getSkillLvl() + "\nHeight: " + mysnowboard.getHeight() + "\nBinding Type: " + mysnowboard.getBinding() + "\nBoard Length: " + mysnowboard.getBoardLength() + "\nBoot Type: " + mysnowboard.getBootType() + "\nBoot Size: " + mysnowboard.getBootSize());
            } else if(choice == 2) {
                //Gets user Skill Level
                System.out.println("First of all, what is your skill level?");
                String skillLvlInput = input.nextLine();
                myski.setnewSkillLvl(skillLvlInput);
                System.out.println("Cool you are a " + myski.getSkillLvl()+ "!");
                System.out.println("\n");
                //Gets if user wants to use ski poles or not 
                System.out.println("Many Skiers like to use poles to help better balance and sometimes even use them to gain speed\nwould you like use poles (true or false) ");
                boolean skipolesInput = input.nextBoolean();
                myski.setnewSkiPoles(skipolesInput);
                System.out.println("So its " + myski.getSkiPoles() + " that you want ski poles?");
                System.out.println("\n");
                //Gets user height
                System.out.println("What is your height?");
                double heightInput = input.nextDouble();
                myski.setnewHeight(heightInput);
                System.out.println("Wow you are " + myski.getHeight() + "?\ncool beans");
                System.out.println("\n");
                //Gets user Ski Length
                System.out.println("Next probably the most important part, ski length\nThe smaller the ski the more control\nEnter your ski length in cms ");
                double skilengthInput = input.nextDouble();
                myski.setnewSkiLength(skilengthInput);
                System.out.println("Nice your ski's are " + myski.getSkiLength() + " cms long");
                System.out.println("\n");
                //Gets user Boot Size 
                System.out.println("Finally let's get your boot size\nwhat size are your grippers");
                int bootsizeInput = input.nextInt();
                myski.setnewBootSize(bootsizeInput);
                System.out.println("Bro fr got " + myski.getBootSize() + " size feet :skullemoji:");
                System.out.println("\n");
                //Gives user summary of Stats and Ski Build
                System.out.println("Looks like we are all done here are your stats and setup: " + "\n" + myski.toString());
            } else if(choice >=3) {
                System.out.println("That's not a choice silly");
            }
        }
        input.close();
    }
}
