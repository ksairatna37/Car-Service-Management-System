class billformat {

    String customername;
    String mobilenumber;
    String date;
    String brancename;
    String brandname;
    String carmodel;
    String mechanicname;
    String mechanicid;

    public billformat(String customername, String mobilenumber, String date, String brancename, String brandname,
            String carmodel,String mechanicname,String mechanicid) {

        this.customername = customername;
        this.mobilenumber = mobilenumber;
        this.date = date;
        this.brancename = brancename;
        this.brandname = brandname;
        this.carmodel = carmodel;
        this.mechanicname=mechanicname;
        this.mechanicid=mechanicid;
    }

    void displaybillformat() {
        System.out.println("-----------------------------INVOICES-----------------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("           GALAXY CAR SERVICE CENTER INFORMATION SYSTEM           ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Date: " + date);
        System.out.println("Branch " + brancename);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Customer Details:\n");
        System.out.println("Customer Name : " + customername);
        System.out.println("Customer Mobile Number: " + mobilenumber);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Mechanic Details:\n");
        System.out.println("Mechanic Name : " + mechanicname);
        System.out.println("Mechanic Id: " + mechanicid);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Car Details:\n");
        System.out.println("Car Brand: " + brandname);
        System.out.println("Car Model: " + carmodel);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Services\t\t\t\t" + "Total\t\t");
        System.out.println("------------------------------------------------------------------");
    }

}

