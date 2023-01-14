import java.io.File;
import java.util.*;


public class CarbonReducer {

    public Scanner scanner = new Scanner("filescraping.txt");
    
    public int address;
    public int redMeat;
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

    public void search(String name){

        //turn next line into arraylist, split at " "
        //then see if it contains the name inputed 

        while(true){
            if(scanner.hasNext()){

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

        //call other method 
    
    }

    public void match(){

        while(true){
            if(scanner.hasNextLine()){
                if(scanner.nextLine().split(" ")[0].equals("Address")){
                    address = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                    redMeat = Integer.parseInt(scanner.nextLine().split(" ")[1]);

                    if()

                    redMeat = Integer.parseInt(scanner.nextLine().split(" ")[1]);
                }

        }


    }
    }
    

public static void main(String[] args) throws Exception {

    Scanner keyboard = new Scanner(System.in);
    File file = new File("filescraping.txt");

}
}


    /*while (true) {
        System.out.println("Enter the name of the WEC director who's carbon footprint you want to find");
        String name = keyboard.nextLine();
    }*/
    


