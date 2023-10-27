class discount extends cost
{
    static double labour = (0.1) * cost;
       static double Total ;
       static double dis ;
       static double gst ;
       static double netTotal ;
       static double grandTotal ;
    
    
    public discount(){

    }

    
    void extracharges(){

        labour = (0.1) * cost;
        Total = 0.0;
        dis = 0.0;
        gst = 0.0;
        netTotal = 0.0;
        grandTotal = 0.0;

        Total = labour + cost;
        System.out.println("Labour Charges\t\t\t\t" + Math.round(labour));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Sub Total\t\t\t\t" + Math.round(Total));
        if (Total < 5000) {
            dis = 0.05 * Total;
            netTotal = Total - dis;
            System.out.println("Discount @5%s\t\t\t\t" + Math.round(dis));
        } else if (Total >= 5000 && Total <= 10000) {
            dis = 0.08 * Total;
            netTotal = Total - dis;
            System.out.println("Discount @8%s\t\t\t\t" + Math.round(dis));
        } else if (Total > 10000) {
            dis = 0.12 * Total;
            netTotal = Total - dis;
            System.out.println("Discount @12%s\t\t\t\t" + Math.round(dis));
        } else {
            System.out.println("Error!");
        }
        System.out.println("------------------------------------------------------------------");

        System.out.println("Net total\t\t\t\t" + Math.round(netTotal));
        gst = 0.18 * netTotal;
        grandTotal = netTotal + gst;

        System.out.println("GST @18%s\t\t\t\t" + Math.round(gst));
        System.out.println("------------------------------------------------------------------");
        System.out.printf("Grand total\t\t\t\t" + Math.round(grandTotal));
        System.out.println("\n------------------------------------------------------------------");
    }
}
