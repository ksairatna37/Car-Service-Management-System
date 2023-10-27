
public class cost {

    int brand;
    int[] serv_input = new int[10];
    int costofotherservice;
    static int cost;
    public static int []serv_cost = new int[10];
    static String otherservice;

    public cost() {

    }

    public cost(int brand, int[] serv_input, int costofotherservice, String otherservice) {

        this.brand = brand;
        this.serv_input = serv_input;
        this.costofotherservice = costofotherservice;
        this.otherservice = otherservice;

        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int x6 = 0;
        int x7 = 0;
        int x8 = 0;

        if (brand == 1) {
            x1 = 100;
            x2 = 2000;
            x3 = 300;
            x4 = 3000;
            x5 = 500;
            x6 = 6000;
            x7 = 700;
            x8 = 400;
        }

        else if (brand == 2) {
            x1 = 120;
            x2 = 2200;
            x3 = 320;
            x4 = 3200;
            x5 = 520;
            x6 = 6200;
            x7 = 720;
            x8 = 400;
        }

        else if (brand == 3) {
            x1 = 130;
            x2 = 2300;
            x3 = 330;
            x4 = 3200;
            x5 = 530;
            x6 = 6300;
            x7 = 730;
            x8 = 400;
        }

        else if (brand == 4) {
            x1 = 140;
            x2 = 2400;
            x3 = 340;
            x4 = 3200;
            x5 = 540;
            x6 = 6400;
            x7 = 740;
            x8 = 400;
        }

        else if (brand == 5) {
            x1 = 150;
            x2 = 2500;
            x3 = 350;
            x4 = 3200;
            x5 = 550;
            x6 = 6500;
            x7 = 750;
            x8 = 400;
        }

        else if (brand == 6) {
            x1 = 160;
            x2 = 2600;
            x3 = 360;
            x4 = 3200;
            x5 = 560;
            x6 = 6600;
            x7 = 760;
            x8 = 400;
        }

        serv_cost[0] = x1 * serv_input[0];

        serv_cost[1] = x2 * serv_input[1];

        serv_cost[2] = x3 * serv_input[2];

        serv_cost[3] = x4 * serv_input[3];

        serv_cost[4] = x5 * serv_input[4];

        serv_cost[5] = x6 * serv_input[5];

        serv_cost[6] = x7 * serv_input[6];

        serv_cost[7] = x8 * serv_input[7];

        serv_cost[8] = costofotherservice;

        cost = 0;
        for (int i = 0; i < 9; i++) {
            cost = cost + serv_cost[i];
        }

    }

    void displaycost() {

        String mm = "No";

        System.out.println("Break Pads\t\t\t\t" + serv_cost[0]);
        System.out.println("Tyres\t\t\t\t\t" + serv_cost[1]);
        System.out.println("AC Filters\t\t\t\t" + serv_cost[2]);
        System.out.println("Rubbing Polish\t\t\t\t" + serv_cost[3]);
        System.out.println("Wheel Alignment\t\t\t\t" + serv_cost[4]);
        System.out.println("Dent Repair and Painting\t\t" + serv_cost[5]);
        System.out.println("Infotenment System\t\t\t" + serv_cost[6]);
        System.out.println("Engine Oil\t\t\t\t" + serv_cost[7]);

        if (otherservice.equalsIgnoreCase(mm)) {
            System.out.println("No Other Services");
        } else {
            System.out.println(otherservice + "\t\t\t\t" + serv_cost[8]);
        }

    }

}
