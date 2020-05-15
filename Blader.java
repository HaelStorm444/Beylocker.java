import java.util.Scanner;

/**
 * Blader.java's purpose is to hold Blader information such as
 *  name, the Blader's prefferd user Type(attack,defense,stamina,balance)
 *  and his/her age
 */
public abstract class Blader {
    Scanner scan = new Scanner(System.in);
    String userType,name;
    int age;
    //Blader profile
    public void bladerStats(){
        age = scan.nextInt();
        userType = scan.nextLine();
        name = scan.nextLine();
        System.out.println("Blader: "+ name+"\n"+ "Age: "+ age +"\n"+ "Preferred type: "+ "\n"+ userType);
    }
}
