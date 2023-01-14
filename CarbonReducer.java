import java.io.File;
import java.util.*;


public class CarbonReducer {

    public static Scanner scanner; 
    
    public static int address;
    public static int redMeat;
    public static String controller;
    public static int grains;
    public static String endPoint;
    public static int dairy;
    public static int cellPhone;
    public static int tv;
    public static int computer;
    public static int newYearRes;
    public static int car;
    public static int walking;
    public static int transport;

    public static void search(String name){

        //turn next line into arraylist, split at " "
        //then see if it contains the name inputed 

        while(true){
            if(scanner.hasNextLine()){

            ArrayList<String> nameCheck = new ArrayList(Arrays.asList());

            String[] myArray = scanner.nextLine().split(" ");

            for(int i = 0; i < myArray.length; i++){
                nameCheck.add(myArray[i]);
            }

            if(nameCheck.contains(name)){
                break;
            }
            }else{
                System.out.println("The usename you entered does not exist");
                break;
            }
        }

        //now store each value
            
            controller = scanner.nextLine().split(" ")[1];

            car = Integer.parseInt(scanner.nextLine().split("	          ")[1]);
            scanner.nextLine();

            walking = Integer.parseInt(scanner.nextLine().split("          ")[1]);
            transport = Integer.parseInt(scanner.nextLine().split(" ")[1]);
            scanner.nextLine();

            endPoint = (scanner.nextLine().split("         ")[1]);

            match();


    
    }

    public static void match(){

        while(true){
            if(scanner.hasNextLine()){
                while(true){
                if(scanner.nextLine().split(" ")[0].equals("Address")){
                    address = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                    redMeat = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                    
                    if(scanner.nextLine() == controller){
                        scanner.nextLine();
                        grains = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                        scanner.nextLine();
                    }else{
                        break;
                    }
                        if(scanner.nextLine() == endPoint){
                            scanner.nextLine();
                            dairy = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                            cellPhone = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                            tv = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                            computer = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                            newYearRes = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                        }
                        else{
                            break;
                        }
                    }

                }

        }
        else{
            scanner = new Scanner("filescraping.txt");
        }
    }
}
    

public static void main(String[] args) throws Exception {

    scanner = new Scanner("filescraping.txt");
 File file = new File("filescraping.txt");
    Scanner keyboard = new Scanner(System.in);
    
    while (true) {
        System.out.println("Enter the name of the WEC director who's carbon footprint you want to find");
        String name = keyboard.nextLine();

        search(name);


        System.out.println("Do you want to restart the program with another WEC director?\nType 'y' to continue, or any key to terminate the program");
        char choice = keyboard.next().charAt(0);
        if (choice != 'y'){
            System.out.println("Thank you! Have a great day");
            break;
        }
    }
    
    
   

    

}
public static void printResult(){
    System.out.println("Breakdown of " + name + "'s yearly carbon footprint\n==========================");
    double total;
    System.out.printf("Public Transportation: %.2f", lbToKg(transport) * 4.3);
    total = lbToKg(transport) * 4.3;
    System.out.printf("\nCar: %.2f", lbToKg(car) * 6.5);
    total = total + lbToKg(redmeat) * 8;
    System.out.printf("\nRed Meat: %.2f", lbToKg(redmeat) * 8);
    total = total + lbToKg(redmeat) * 8;
    System.out.printf("\nDairy: %.2f", lbToKg(dairy) * 6.3);
    total = total + lbToKg(dairy) * 6.3;
    System.out.printf("\nGrains: %.2f", lbToKg(grains) * 3.7);
    total = total + lbToKg(grains) * 3.7;
    System.out.printf("\nCell Phone: %.2f", cellPhone * 3.6);
    total = total + cellPhone * 3.6;
    System.out.printf("\nComputer: %.2f", computer * 4.2);
    total = total + computer * 4.2;
    System.out.printf("\nTV: %.2f", tv * 6.8);
    total = total + tv * 6.8;

    System.out.printf("\n\nTotal Yearly Carbon Emissions: %.2f", total);
   
}

public static double lbToKg(int x){
    double converted = (double)x / 2.2046;
    return converted;
}
public static void projection() {
    double emissions = co2emissions*newyearpercent/100;
    System.out.printf("Your new years resolution is to reduce your carbon emissions by %d % which would bring your carbon emissions down to %f",newyearpercent,emissions);
    System.out.println("Which lifestyle change would you be most willing to change?");
    char choice;
    while (true) {
        System.out.println("\n==================\na:Transportation\nb:Food\nc:electronics\n==================");
        System.out.print("\nEnter your choice: ");
        choice = input.next().charAt(0);
        switch (choice) {
            case 'a':
                System.out.println("Using your personal vehicle undoubtedly is the worst possible mode of transportation\n for the environment. Consider other alternatives that are cheaper are release significantly less\n GHG such as biking, skateboarding, walking, or even public transportation.\n");
                break;
            case 'b':

                System.out.println("Although red meat provides an excellent source of protein, its impact on the\n environment and land is vast. You should consider exploring other protein sources that provide\n the same nutritional value with less impact on the environment such as chicken, pork, or other\n proteins from plants.\n");
                break;
            case 'c':

                System.out.println("Of all the electronics listed, TV is the worst for the environment with the highest CO2\n emissions. It’s unrealistic to completely cut TV out from your lifestyle, however, picking up other\n hobbies as an engineer is important (no one wants engineering to be the topic of conversation\n all day, just saying).");
                break;


        }
    }

}
}


    /*while (true) {
        System.out.println("Enter the name of the WEC director who's carbon footprint you want to find");
        String name = keyboard.nextLine();
    }*/
    


