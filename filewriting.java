import java.io.*;
import java.util.Random;

class filewriting extends cost {

    String customername;
    String mobilenumber;
    String date;
    String brancename;
    String brandname;
    String carmodel;
    String mechanicname;
    String mechanicid;
    String feedback;
    int costofotherservice;
    int cost;
    double labour;
    double Total;
    double dis;
    double gst;
    double netTotal;
    double grandTotal;
    static String newpath;

    public filewriting(String customername, String mobilenumber, String date, String brancename, String brandname,
            String carmodel, String mechanicname, String mechanicid) {
        this.customername = customername;
        this.mobilenumber = mobilenumber;
        this.date = date;
        this.brancename = brancename;
        this.brandname = brandname;
        this.carmodel = carmodel;
        this.mechanicname = mechanicname;
        this.mechanicid = mechanicid;
    }

    public filewriting() {

    }

    void writefile() {
        discount di = new discount();
        feed fee = new feed();
        try {

            Random r = new Random();
            String path = "Invoice1.txt";

            String data = "Record.txt";

            File f = new File(path);
            File  newf = new File(data);
            newpath = "";
            if (f.exists()) {
                int i = r.nextInt(100);
                newpath = "Invoice" + i + ".txt";
                f = new File(newpath);
            }
            BufferedWriter b1 = new BufferedWriter(new FileWriter(newf,true));

            BufferedWriter bw = new BufferedWriter(new FileWriter(f));

            b1.write("------------------------------------------------------------------------\n");
            b1.write("GALAXY CAR SERVICE CENTER INFORMATION SYSTEM           \n");
            b1.write("------------------------------------------------------------------------\n");
            b1.close();

            BufferedWriter b = new BufferedWriter(new FileWriter(newf,true));

            bw.write("--------------------CAR SERVICE----------------------\n");
            bw.write("------------------------------------------------------------\n");
            bw.write("Date :");
            b.write("Date :");
            bw.write(date);
            b.write(date);
            bw.write("\nBranch Name :");
            b.write("\nBranch Name :");
            bw.write(brancename);
            b.write(brancename);
            bw.write("\n------------------------------------------------------------\n");
            b.write("\n------------------------------------------------------------\n");
            bw.write("Mechanic Name :");
            b.write("Mechanic Name :");
            bw.write(mechanicname);
            b.write(mechanicname);
            bw.write("\nMechanic ID :");
            b.write("\nMechanic ID :");
            bw.write(mechanicid);
            b.write(mechanicid);
            bw.write("\n------------------------------------------------------------\n");
            b.write("\n------------------------------------------------------------\n");
            bw.write("Customer Name:");
            b.write("Customer Name:");
            bw.write(customername);
            b.write(customername);
            bw.write("\nCustomer Phone Number :");
            b.write("\nCustomer Phone Number :");
            bw.write(mobilenumber);
            b.write(mobilenumber);
            bw.write("\n------------------------------------------------------------\n");
            b.write("\n------------------------------------------------------------\n");
            bw.write("Car Name:");
            b.write("Car Name:");
            bw.write(brandname);
            b.write(brandname);
            bw.write("\nCar Model:");
            b.write("\nCar Model:");
            bw.write(carmodel);
            b.write(carmodel);
            bw.write("\n------------------------------------------------------------\n");
            b.write("\n------------------------------------------------------------\n");
            bw.write("SERVICE\t\t\t\tTotal\t\t\n");
            b.write("SERVICE\t\t\t\tTotal\t\t\n");
            bw.write("------------------------------------------------------------\n");
            b.write("------------------------------------------------------------\n");
            bw.write("Break Pads\t\t\t\t");
            b.write("Break Pads\t\t\t\t");
            String breakpads = String.valueOf(serv_cost[0]);
            bw.write(breakpads);
            b.write(breakpads);

            bw.write("\nTyres\t\t\t\t\t");
            b.write("\nTyres\t\t\t\t\t");
            String tyres = String.valueOf(serv_cost[1]);
            bw.write(tyres);
            b.write(tyres);

            bw.write("\nAC Filters\t\t\t\t");
            b.write("\nAC Filters\t\t\t\t");
            String ac = String.valueOf(serv_cost[2]);
            bw.write(ac);
            b.write(ac);

            bw.write("\nRubbing Polish\t\t\t");
            b.write("\nRubbing Polish\t\t\t");
            String polish = String.valueOf(serv_cost[3]);
            bw.write(polish);
            b.write(polish);

            bw.write("\nWheel Alignment\t\t\t");
            b.write("\nWheel Alignment\t\t\t");
            String wheel = String.valueOf(serv_cost[4]);
            bw.write(wheel);
            b.write(wheel);

            bw.write("\nDent Repair and Painting\t\t");
            b.write("\nDent Repair and Painting\t\t");
            String dent = String.valueOf(serv_cost[5]);
            bw.write(dent);
            b.write(dent);

            bw.write("\nInfotenment System\t\t");
            b.write("\nInfotenment System\t\t");
            String infotentment = String.valueOf(serv_cost[6]);
            bw.write(infotentment);
            b.write(infotentment);

            bw.write("\nEngine Oil\t\t\t\t");
            b.write("\nEngine Oil\t\t\t\t");
            String engine = String.valueOf(serv_cost[7]);
            bw.write(engine);
            b.write(engine);

            String mm = "No";
            if (otherservice.equalsIgnoreCase(mm)) {
                bw.write("\n" + "No Other Service" + "\t\t\t");
                b.write("\n" + "No Other Service" + "\t\t\t");
                String otherservice1 = String.valueOf(serv_cost[8]);
                bw.write(otherservice1);
                b.write(otherservice1);
            } else {
                bw.write("\n" + otherservice + "\t\t\t\t");
                b.write("\n" + otherservice + "\t\t\t\t");
                String otherservice1 = String.valueOf(serv_cost[8]);
                bw.write(otherservice1);
                b.write(otherservice1);
            }

            bw.write("\n------------------------------------------------------------\n");
            b.write("\n------------------------------------------------------------\n");
            bw.write("Labour Charges\t\t\t");
            b.write("Labour Charges\t\t\t");
            String labour1 = String.valueOf(Math.round(di.labour));
            bw.write(labour1);
            b.write(labour1);
            bw.write("\n------------------------------------------------------------\n");
            b.write("\n------------------------------------------------------------\n");

            bw.write("Sub Total\t\t\t\t");
            b.write("Sub Total\t\t\t\t");
            String subtotal1 = String.valueOf(Math.round(di.Total));
            bw.write(subtotal1);
            b.write(subtotal1);

            bw.write("\nDiscout\t\t\t\t");
            b.write("\nDiscout\t\t\t\t");
            String discount = String.valueOf(Math.round(di.dis));
            bw.write(discount);
            b.write(discount);

            bw.write("\n\nNet Total\t\t\t\t");
            b.write("\n\nNet Total\t\t\t\t");
            String nettotal = String.valueOf(Math.round(di.netTotal));
            bw.write(nettotal);
            b.write(nettotal);

            bw.write("\nGST @18%s\t\t\t\t");
            b.write("\nGST @18%s\t\t\t\t");
            String gst1 = String.valueOf(Math.round(di.gst));
            bw.write(gst1);
            b.write(gst1);

            bw.write("\n------------------------------------------------------------\n");
            b.write("\n------------------------------------------------------------\n");

            bw.write("Grand Total\t\t\t\t");
            b.write("Grand Total\t\t\t\t");
            String grandtotal = String.valueOf(Math.round(di.grandTotal));
            bw.write(grandtotal);
            b.write(grandtotal);

            bw.close();
            b.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
