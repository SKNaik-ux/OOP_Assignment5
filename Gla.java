public class Gla {

    //general data
    private int Assembly_year = 2024;
    private String Political_groupsArray[] = {"1. BHARATIYA JANATA PARTY(28)",
    "2. MAHARASHRAWADI GOMANTAK PARTY(2)",
    "3. INDEPENDANT(3)",
    "4. INDIAN NATIONAL CONGRESS(3)",
    "5. AAM AADMI PARTY(2)",
    "6. REVOLUTIONARY GOANS PARTY(1)"};
    String Political_groups = String.join("\n\n", getPoliticalGroups());

    //encapsulation
    // getters for GLA
    public int getAssemblyYear() {
        return Assembly_year;
    }

    public String getPoliticalGroups() {
        return Political_groups;
    }




    //government data
    private String Governor = "Shri. P. S. Sreedharan Pillai";
    private String CM = "Shri. Pramod Sawant";
    private String COM_Array[] = {"SHRI. PRAMOD SAWANT",
            "SHRI. VISHWAJIT RANE",
            "SHRI. MAUVIN GODINHO",
            "SHRI. RAVI NAIK",
            "SHRI. SUBHASH SHIRODKAR",
            "SHRI. ROHAN KHAUNTE",
            "SHRI. GOVIND GAUDE",
            "SHRI. ATANASIO MONSERRATE",
            "SHRI. RAMKRISHNA ALIAS SUDIN DHAVALIKAR",
            "SHRI. NILKANTH HALARNKAR",
            "SHRI. SUBHASH PHAL DESSAI",
            "SHRI. ALEIXO SEQUEIRA"};
    private String COM = String.join("\n\n", COM_Array);

    //encapsulation
    //getters for government
    public String getGovernor() {
        return Governor;
    }

    public String getCM() {
        return CM;
    }

    public String getCouncilOfMinisters() {
        return COM;
    }





    //legislature data
    private String speaker = "Shri. Ramesh Tawadkar";
    private String duty_speaker = "Shri. Joshua De Souza";
    private String oppo_leader = "Shri. Yuri Alemao";
    private String MLA_Array[] = {"SHRI. JIT AROLKAR\n",
            "SHRI. PRAVIN ARLEKAR\n",
            "SHRI. CHANDRAKANT SHETYE\n",
            "SHRI. NILKANTH HALARNKAR\n",
            "SHRI. JOSHUA DE SOUZA\n",
            "SMT. DELILAH LOBO\n",
            "SHRI. KEDAR NAIK\n",
            "SHRI. MICHAEL LOBO\n",
            "SHRI. ROHAN KHAUNTE\n",
            "SHRI. CARLOS FERREIRA\n",
            "SHRI. ATANASIO MONSERRATE\n",
            "SMT. JENNIFER MONSERRATE\n",
            "SHRI. RODOLFO FERNANDES\n",
            "SHRI. VIRESH BORKAR\n",
            "SHRI. RAJESH FALDESSAI\n",
            "SHRI. PREMENDRA SHET\n",
            "SHRI. PRAMOD SAWANT\n",
            "SMT. DEVIYA RANE\n",
            "SHRI. VISHWAJIT RANE\n",
            "SHRI. GOVIND GAUDE\n",
            "SHRI. RAVI NAIK\n",
            "SHRI. SUBHASH SHIRODKAR\n",
            "SHRI. RAMKRISHNA ALIAS SUDIN DHAVALIKAR\n",
            "SHRI. SANKALP AMONKAR\n",
            "SHRI. KRISHNA SALKAR\n",
            "SHRI. MAUVIN GODINHO\n",
            "SHRI. ANTONIO VAS\n",
            "SHRI. ALEIXO SEQUEIRA\n",
            "SHRI. ALEIXO LOURENCO\n",
            "SHRI. VIJAI SARDESAI\n",
            "SHRI. DIGAMBAR KAMAT\n",
            "SHRI. VENZY VIEGAS\n",
            "SHRI. ULHAS TUENKAR\n",
            "SHRI. YURI ALEMAO\n",
            "SHRI. CRUZ SILVA\n",
            "SHRI. ALTONE D’COSTA\n",
            "SHRI. NILESH CABRAL\n",
            "SHRI. GANESH GAONKAR\n",
            "SHRI. SUBHASH PHAL DESSAI\n",
            "SHRI. RAMESH TAWADKAR\n"};
    private String MLA_leaders = String.join("\n\n", MLA_Array);
    private String Secretary = "Smt. Namrata Ulman";
    private String RTI_Array[] = {"SHRI MOHAN GAONKAR","SMT N. ULMAN"};
    private String RTI_officers = String.join("\n\n", RTI_Array);

    //encapsulation
    //getterss for legilature
    public String getSpeaker() {
        return speaker;
    }

    public String getDutySpeaker() {
        return duty_speaker;
    }

    public String getOppositionLeader() {
        return oppo_leader;
    }

    public String getMLALeaders() {
        return MLA_leaders;
    }

    public String getSecretary(){
        return Secretary;
    }

    public String getRTI_officers(){
        return RTI_officers;
    }








    //contact data
    public void GeneralContact(){
        System.out.println("Goa Legislature Secretariat:");
        System.out.println("Assembly Complex - Alto Porvorim Goa Pin 403521.");
        System.out.println("Tel No: 0832-2493315");
        System.out.println("Fax: 91-0832 -2411054");
        System.out.println("Direct No: 0832 - 2410917");
        System.out.println("Email: sec-leg.goa@nic.in");
    }

    public void Secretarys_office(){
        String[][] contactData = {
                {"Perpetual Theresa Fernandes", "Reporter & P.A. to Secretary", "R. No S201, 2nd Floor Goa Legislature Secretariat Porvorim Bardez Goa", "832-2493315, 2410917", "08322411054", ""},
                {"Chaitanya Joshi", "St. Grade II", "R. No S201, 2nd Floor Goa Legislature Secretariat Porvorim Bardez Goa", "0832-2493315", "", ""},
                {"Timothy Quadros", "MTS", "R. No S201, 2nd Floor Goa Legislature Secretariat Porvorim Bardez Goa", "832-2493315", "", ""},
                {"Rahul Bale", "MTS", "R. No S201, 2nd Floor Goa Legislature Secretariat Porvorim Bardez Goa", "0832-2493315", "", ""}
        };

        // Accessing and printing the contact information
        for (int i = 0; i < contactData.length; i++) {
            System.out.println("Contact " + (i + 1));
            System.out.println("Name: " + contactData[i][0]);
            System.out.println("Designation: " + contactData[i][1]);
            System.out.println("Address: " + contactData[i][2]);
            System.out.println("Phone Number: " + contactData[i][3]);
            System.out.println("Fax: " + contactData[i][4]);
            System.out.println("Email: " + contactData[i][5]);
            System.out.println();
        }
    }

    public void legislation_branch(){
        String[][] contactData = {
                {"Farida Muzawar", "1st Floor, Goa Legislature Secretariat Porvorim Bardez Goa", "Section Officer", "08322-493244, 2413830"},
                {"Shewta Naik", "1st Floor, Goa Legislature Secretariat Porvorim Bardez Goa", "Senior Assistant", "08322-493244, 2413830"},
                {"Patricia Machado", "1st Floor, Goa Legislature Secretariat Porvorim Bardez Goa", "Assistant", "08322-493244, 2413830"},
                {"Nivedita Munj", "1st Floor, Goa Legislature Secretariat Porvorim Bardez Goa", "Junior Assistant", "08322-493244, 2413830"},
                {"Tulshidas Vengurlekar", "R. No. S116 First Floor Goa Legislature Secretariat Porvorim Bardez Goa", "MTS", "08322493244, 0832-2413830"},
                {"Laxmi Naik", "R. No. S116 First Floor Goa Legislature Secretariat Porvorim Bardez Goa", "MTS", "08322493244, 0832-2413830"}
        };

        // Displaying the contact details
        for (int i = 0; i < contactData.length; i++) {
            System.out.println("Contact " + (i + 1));
            System.out.println("Name: " + contactData[i][0]);
            System.out.println("Address: " + contactData[i][1]);
            System.out.println("Designation: " + contactData[i][2]);
            System.out.println("Phone Number: " + contactData[i][3]);
            System.out.println();
        }
    }
    //contact data end









    //links data
    private String websites_array[] = {"RAJBHAVAN- https://rsn337u7yjoyik3szrrr2k3lbch35s.oastify.com/",
            "GOA UNIVERSITY- https://www.unigoa.ac.in/",
            "GOVT PRINTING PRESS- https://goaprintingpress.gov.in/",
            "HIGH COURT OF BOMBAY AT GOA- https://hcbombayatgoa.nic.in/",
            "DIRECTORATE OF HEALTH SERVICES- https://www.dhsgoa.gov.in/",
            "DEPT OF WATER RESOURCES- https://www.goawrd.gov.in/",
            "DIRECTORATE OF PANCHAYATS- https://www.panchayatsgoa.gov.in/",
            "GOA GOVERNMENT- https://www.goa.gov.in/",
            "DEPT OF TOURISM- https://www.goatourism.gov.in/",
            "KADAMBA TRANSPORT SERVICES GOA- https://ktclgoa.com/",
            "oHERALDO- https://www.heraldgoa.in/"};
    private String websites = String.join("\n\n", websites_array);

    //encapsulation
    //getters for links
    public String getlinks(){
        return websites;
    }






    //disclaimer
    void print_assembly_year(){
        System.out.println("######## NOTE: INFORMATION OF THE GOA LEGISLATURE IS UPTO THE FISCAL YEAR "+ getAssemblyYear() +". ########");
    }

}
