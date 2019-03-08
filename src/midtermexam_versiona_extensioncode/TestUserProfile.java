/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author willem Wantenaar
 * 3/8/2019
 * 4:00pm
 */
public class TestUserProfile {
    Scanner in = new Scanner(System.in);
    
    UserProfile u1 = new UserProfile("null","null");
    System.out.println("Enter User Name:");
    String uname = in.nextLine();
    u1.setUserID(uname);
    
    System.out.println("Pick favourite genre: (R)OCK , R(A)P, or (C)OUNTRY");
    String genre = in.nextLine();
    String rock = "Rock";
    String rap = "Rap";
    String country = "Country";
    
    while (genre !=  rock || genre != rap || genre != country){
        if (genre == "r" || genre =="R"){
            u1.setGenre(rock);
        }
        else if (genre == "a" || genre =="A"){
            u1.setGenre(rap);
        }
        else if (genre == "c" || genre =="C"){
            u1.setGenre(country);
        }
    }
    System.out.println("Account Created.");
}
