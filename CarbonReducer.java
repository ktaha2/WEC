import java.io.File;
import java.util.*;


public class CarbonReducer {

    public Scanner scanner = new Scanner("filescraping.txt");
    
    public int address;
    public int redmeat;
    public String controller;
    public int grains;
    public String endPoint;
    public int dairy;
    public int cellPhone;
    public int tv;
    public int computer;
    public int newYearRes;
    public int car;
    public int walking;
    public int transport;

    public void match(String name){

        //turn next line into arraylist, split at " "
        //then see if it contains the name inputed 

        ArrayList<String> nameCheck = new ArrayList(Arrays.asList());

        String[] myArray = scanner.nextLine().split(" ");

        for(int i = 0; i < myArray.length; i++){
            nameCheck.add(myArray[i]);
        }

        if(nameCheck.contains(name)){
            
            controller = scanner.nextLine().split(" ")[1];
            car = Integer.parseInt(scanner.nextLine().split(" ")[1]);
            scanner.nextLine();
            walking = Integer.parseInt(scanner.nextLine().split(" ")[1]);
            transport = Integer.parseInt(scanner.nextLine().split(" ")[1]);
            scanner.nextLine();
            endPoint = (scanner.nextLine().split(" ")[1]);

            //call other method 





        }
        else{
            System.out.println("That username does not exist");
        }
        
        }

        public void
    

public static void main(String[] args) throws Exception {

    Scanner keyboard = new Scanner(System.in);
    File file = new File("filescraping.txt");



    while (true) {
        System.out.println("Enter the name of the WEC director who's carbon footprint you want to find");
        String name = keyboard.nextLine();
    }
    

} 
}