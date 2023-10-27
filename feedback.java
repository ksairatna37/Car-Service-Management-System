import java.util.*;
import java.io.*;

interface feedback {
    void showfeedback();
}

class feed extends filewriting implements feedback{

    public feed(){
        
    }
    public void showfeedback(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to give us feedback and 0 for skip");
        int feedbackinp = 0;
        feedbackinp=sc.nextInt();
        String feedback="";
        if (feedbackinp == 1) {
            System.out.println("\nGive us Feedback:");
            feedback = sc.nextLine();
            feedback = sc.nextLine();
            System.out.println("\nThank you for giving us Feedback");
        
        } 

            System.out.println("\nThank You for Choosing Our Services !");
    

        try{

            String recordpath="Record.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(newpath,true));
            BufferedWriter b = new BufferedWriter(new FileWriter(recordpath,true));
            bw.write("\n------------------------------------------------------------\n");
            b.write("\n------------------------------------------------------------\n");
            bw.write("Feedback :\n");
            b.write("Feedback :\n");
            if(feedbackinp!=1){
                bw.write("No Feedback!");
                bw.write("\n------------------------------------------------------------\n");
                b.write("No Feedback!");
                b.write("\n------------------------------------------------------------\n");
            }
            else{
            bw.write(feedback);
            b.write("\n------------------------------------------------------------\n");
            b.write(feedback);
            b.write("\n------------------------------------------------------------\n");
            }
            b.close();
            bw.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("\nBill Receipt Named : " + newpath + " is generated");
    }
}
