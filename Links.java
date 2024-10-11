    import java.util.Scanner;

    public class Links extends Gla implements utility{


        @Override
        public void init_userinput(){
            Scanner sc = new Scanner(System.in);
            int menuchoice = 100;
            while (menuchoice!=0){
                System.out.println();
                System.out.println("=============================== *** GOA LEGISLATURE LINKS *** ===============================");
                System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
                System.out.println();
                System.out.println("1] WEBSITES \t\t\t ");
                System.out.println();
    //            System.out.println("=============================== *** ENTER 10 TO FOR MAIN MENU *** ===============================");
                System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
                System.out.println();
                print_assembly_year();
                System.out.print("=>");
                menuchoice = sc.nextInt();
                switch (menuchoice){
                    case 1:
                        System.out.println("GOVERNOR FOR THE ASSEMBLY IS "+getlinks());
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
