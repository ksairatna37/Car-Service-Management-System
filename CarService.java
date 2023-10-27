import java.util.*;

public class CarService {
public static int[]serv_input = new int[10];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("           GALAXY CAR SERVICE CENTER INFORMATION SYSTEM           ");
        System.out.println("------------------------------------------------------------------");

        System.out.println("Enter the Branch Name:");
        String brancename = sc.nextLine();

        System.out.println("Enter Date");
        String date = sc.nextLine();

        // brance name
        /*System.out.println("1.Customer Details");
        System.out.println("2.Mechanic Details");
        System.out.println("3.Car Details");
        System.out.println("4.Service Details");
        System.out.println("5.Payment Details");
        System.out.println("6.Bill Receipt");
        System.out.println("7.EXIT");

        int choice=sc.nextInt();

        switch(choice){

        }*/
        // customer details
        System.out.println("Customer Details");

        System.out.println("1. Enter Customer Name:");
        String customername = sc.nextLine();

        System.out.println("2. Enter Mobile Number:");
        String mobilenumber = sc.nextLine();

        // mechanic details
        System.out.println("Mechanic Details");
        System.out.println("1. Enter Mechanic Name:");
        String mechanicname = sc.nextLine();

        System.out.println("2. Enter the Mechanic Id:");
        String mechanicid = sc.nextLine();

        // car information
        System.out.println("1. Select Brand Name:");
        System.out.println(
                "Enter 1 : HONDA\nEnter 2 : HYUNDAI\nEnter 3 : MARUTI SUZUKI\nEnter 4 : TATA\nEnter 5 : TOYOTA\nEnter 6 : OTHERS\n");
        int brand = sc.nextInt();
        String brandname = "";
        switch (brand) {
            case 1:
                brandname = "HONDA";
                break;
            case 2:
                brandname = "HYUNDAI";
                break;
            case 3:
                brandname = "MARUTI SUZUKI";
                break;
            case 4:
                brandname = "TATA";
                break;
            case 5:
                brandname = "TOYOTO";
                break;
            case 6:
                System.out.println("Please Enter Car Brand Name:");
                brandname = sc.next();
                break;
            default:
                System.out.println("Wrong Choice!!!");
                System.out.println("Please Try Again!");
                System.exit(0);
                break;

        }
        System.out.println("Enter Car Model:");
        String carmodel = sc.nextLine();
        carmodel = sc.nextLine();

        // SERVICE KEYPOINT INFORMATION
        
        

        System.out.println("\nSELECT THE SERVICES");
        System.out.println("\nPress 1 for Yes and 0 for No");

        System.out.print("Were the Break Pads changed: ");
        serv_input[0] = sc.nextInt();
        System.out.print("Were the Tyres changed, if yes then how many tyres? : ");
        serv_input[1] = sc.nextInt();
        System.out.print("Were the AC Filters changed: ");
        serv_input[2] = sc.nextInt();
        System.out.print("Suspension Check: ");
        serv_input[3] = sc.nextInt();
        System.out.print("Wheel Alignment: ");
        serv_input[4] = sc.nextInt();
        System.out.print("Dent Repair and Painting: ");
        serv_input[5] = sc.nextInt();
        System.out.print("Infotainnment System Repair: ");
        serv_input[6] = sc.nextInt();
        System.out.print("Were Engine Oil changed: ");
        serv_input[7] = sc.nextInt();

        System.out.println("Please mention other service and its cost ,if any:");
        String otherservice = sc.nextLine();
        otherservice = sc.nextLine();
        int costofotherservice=0;
        String m = "No";
        if (otherservice.equalsIgnoreCase(m)) {
            System.out.print("\033[H\033[2J");
        } else {
            System.out.println("Cost of " + otherservice);
            costofotherservice = sc.nextInt();
        }

       

        billformat bi = new billformat(customername, mobilenumber, date, brancename, brandname, carmodel, mechanicname,
                mechanicid);
        bi.displaybillformat();

        
        cost co = new cost(brand, serv_input,costofotherservice, otherservice);
        co.displaycost();

        discount dis = new discount();
        dis.extracharges();

        filewriting f = new filewriting(customername, mobilenumber, date, brancename, brandname, carmodel, mechanicname,mechanicid);
        f.writefile();
        
        feed f1 = new feed();
        f1.showfeedback();
        
        
    }
}
