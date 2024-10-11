import java.util.Scanner;

public class Contact extends Gla implements utility{


    @Override
    public void init_userinput(){
        Scanner sc = new Scanner(System.in);
        int menuchoice = 100;
        while (menuchoice!=0){
            System.out.println();
            System.out.println("=============================== *** GOA LEGISLATURE CONTACT *** ===============================");
            System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
            System.out.println();
            System.out.println("1] GENERAL CONTACT DETAILS \t\t\t 2] SECRETARY'S OFFICE \t\t\t 3] LEGISLATION BRANCH ");
            System.out.println();
//            System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
            System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
            System.out.println();
            print_assembly_year();
            System.out.print("=>");
            menuchoice = sc.nextInt();
            switch (menuchoice){
                case 1:
                    System.out.println("GENERAL CONTACT DETAILS:");
                    GeneralContact();
//                    System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
                    System.out.println("=============================== *** ENTER 0 FOR MAIN MENU *** ===============================");
                    System.out.print("=>");
                    menuchoice = sc.nextInt();
                    break;
                case 2:
                    System.out.println("SECRETARY'S OFFICE: ");
                    Secretarys_office();
                    break;
                case 3:
                    System.out.println("LEGISLATION BRANCH");
                    legislation_branch();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("PLEASE ENTER VALID INPUT");
            }
        }
    }
}
