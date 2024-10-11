import java.util.Scanner;

public class Legislature extends Gla implements utility{


    @Override
    public void init_userinput(){
        Scanner sc = new Scanner(System.in);
        int menuchoice = 100;
        while (menuchoice!=0){
            System.out.println();
            System.out.println("=============================== *** GOA LEGISLATURE DETAILS *** ===============================");
            System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
            System.out.println();
            System.out.println("1] SPEAKER \t\t\t 2] DUTY SPEAKER \t\t\t 3] OPPOSITION LEADER");
            System.out.println();
            System.out.println("4] LIST OF MLA'S \t\t\t 5] SECRETARY \t\t\t 6] RTI OFFICERS");
            System.out.println();
//            System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
            System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
            System.out.println();
            print_assembly_year();
            System.out.print("=>");
            menuchoice = sc.nextInt();
            switch (menuchoice){
                case 1:
                    System.out.println("SPEAKER FOR THE ASSEMBLY IS "+getSpeaker());
//                    System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
                    System.out.println("=============================== *** ENTER 0 FOR MAIN MENU *** ===============================");
                    System.out.print("=>");
                    menuchoice = sc.nextInt();
                    break;
                case 2:
                    System.out.println("DUTY SPEAKER FOR THE ASSEMBLY IS "+getDutySpeaker());
//                    System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
                    System.out.println("=============================== *** ENTER 0 FOR MAIN MENU *** ===============================");
                    System.out.print("=>");
                    menuchoice = sc.nextInt();
                    break;
                case 3:
                    System.out.println("OPPOSITION LEADER IS "+getOppositionLeader());
//                    System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
                    System.out.println("=============================== *** ENTER 0 FOR MAIN MENU *** ===============================");
                    System.out.print("=>");
                    menuchoice = sc.nextInt();
                    break;
                case 4:
                    System.out.println("----LIST OF MLA'S---- \n\n"+getMLALeaders());
//                    System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
                    System.out.println("=============================== *** ENTER 0 FOR MAIN MENU *** ===============================");
                    System.out.print("=>");
                    menuchoice = sc.nextInt();
                    break;
                case 5:
                    System.out.println("SECRETARY IS "+getSecretary());
//                    System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
                    System.out.println("=============================== *** ENTER 0 FOR MAIN MENU *** ===============================");
                    System.out.print("=>");
                    menuchoice = sc.nextInt();
                    break;
                case 6:
                    System.out.println("----RTI OFFICERS ARE---- \n\n"+getRTI_officers());
//                    System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
                    System.out.println("=============================== *** ENTER 0 FOR MAIN MENU *** ===============================");
                    System.out.print("=>");
                    menuchoice = sc.nextInt();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("PLEASE ENTER VALID INPUT");

            }
        }

    }

}
