

//#############AUTHER: SAISH NAIK############
//#############ROLLNO: 39###############


import java.util.*;
import java.lang.*;

interface utility {
    void init_userinput();
}

public class Main {
    static public void main_menu() {
        System.out.println();
        System.out.println();
        System.out.println("======================= *** AUTHOR:SAISH NAIK *** =======================");
        System.out.println("======================= *** ROLLNO:39 *** =======================");
        System.out.println();
        System.out.println("======================= *** WELCOME TO GOA LEGISLATIVE ASSEMBLY PORTAL *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("A] LEGISLATURE \t\t\t B] GOVERNMENT \t\t\t C] LINKS");
        System.out.println();
        System.out.println("D] CONTACT");
        System.out.println();
        System.out.println("=============================== *** ENTER X TO EXIT *** ===============================");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gla Gla = new Gla();
        Legislature legislature = new Legislature();
        Government gov = new Government();
        Links links = new Links();
        Contact contact = new Contact();

        char choice = '#';

        while (choice!='X' || choice!='x'){
            main_menu();
            System.out.print("=>");
            choice = sc.next().charAt(0);
            if(choice=='A' || choice=='a'){
                legislature.init_userinput();
            } else if (choice=='B' || choice=='b') {
                gov.init_userinput();
            } else if (choice=='C' || choice=='c') {
                links.init_userinput();
            } else if (choice=='D' || choice=='d') {
                contact.init_userinput();
            } else if (choice=='X' || choice=='x') {
                System.exit(0);
            }else {
                System.out.println("ENTER VALID INPUT!!");
            }
        }


    }

}