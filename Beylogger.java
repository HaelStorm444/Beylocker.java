

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Beylogger.java 's purpose is to create the beylocker that holds all the
 * information on each individual beyblade
 */
public class Beylogger {
    //private variables to read in data from csv file
    public static final int TOTAL_BEYBLADE = 57;
    private static final String BEYBLADE_FILE_PATH = "beyblade.csv";
    private List<Beyblade> beyLocker;
    private Beyblade currBeyblade;
    private ArrayList<Beyblade> beybladeList;

    //constructor that creates the arraylist and sizes it
    public Beylogger(){
        beyLocker = new ArrayList<>();
        currBeyblade = new Beyblade();
        beybladeList = new ArrayList<>(Beylogger.TOTAL_BEYBLADE);
        for (int i = 0; i < Beylogger.TOTAL_BEYBLADE; i++) {
            beybladeList.add(currBeyblade);
        }



        try {
            createBeyLogger(BEYBLADE_FILE_PATH);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    //reads in the file and fills the arraylist of beyblades
    private void createBeyLogger(String file)throws IOException{
        FileInputStream fInStream = new FileInputStream(file);
        Scanner scan = new Scanner(fInStream);

        while (scan.hasNextLine()){
            String []line = scan.nextLine().split(",");
            Beyblade beyblade = new Beyblade( Integer.parseInt(line[0]), line[1], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]),
                    line[6], line[7], line[8], line[9],Integer.parseInt(line[10]),Integer.parseInt(line[11]),Integer.parseInt(line[12]),line[13]);
            beyLocker.add(beyblade);

        }

        fInStream.close();
        scan.close();



    }
    // gets current beyblades
        public Beyblade getCurrBeyblade(){
        currBeyblade = beyLocker.get(beyLocker.size()-1);
        return currBeyblade;
        }
        //prints all beyblades
        public void printBeyblades(){
            for (int i = 0; i < beybladeList.size();i++) {
                System.out.println(beybladeList.get(i));
            }

        }
        //changes the arraylist of beyblades to a stack of beyblades
        private void arrayToStack(){
            Stack<Beyblade> stackOfBeyblades = new Stack<Beyblade>();
            stackOfBeyblades.addAll(beybladeList);
        }
        //search through beycodes to find a particular beyblade
    public static void binarySearch(int arr[], int first, int last, int val) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < val) {
                first = mid + 1;
            }
            else if (arr[mid] == val) {
                System.out.println("Beyblade is found at index: " + mid);
                break;
            }
            else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
            if (first > last) {
            System.out.println("Beyblade does not exist");
        }
    }



    }

