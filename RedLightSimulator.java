import java.util.Scanner;
public class RedLightSimulator {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" The Duration of RED Light: ");
            int RED = input.nextInt();
            System.out.println(" The Duration of YELLOW Light: ");
            int YELLOW = input.nextInt();
            System.out.println(" The Duration of GREEN Light: ");
            int GREEN = input.nextInt();
            System.out.println(" RED light will glow from 0 to " + (RED) + ("seconds") );
            System.out.println(" YELLOW light will glow from  " + (RED) +" to " +(RED+YELLOW) + (" seconds"));
            System.out.println(" GREEN light will glow from  " + (RED+YELLOW) + " to " + (RED+YELLOW+GREEN) + (" seconds"));
            System.out.println(" Enter the time : ");
            int time = input.nextInt();
            time = time%(RED + YELLOW + GREEN);
            if(time>0 && time<=RED)
                System.out.println(" Light will glow RED ");
            else if(time>RED && time<=RED + YELLOW)
                System.out.println(" Light will turn YELLOW ");
            else if(time>RED + YELLOW && time<= RED + YELLOW + GREEN)
                System.out.println(" Light Will turn GREEN ");

        if(time>0 && time<=RED)
            System.out.println("The traffic light will change into YELLOW after " + (RED - time) + " seconds ");
        else if(time>RED && time<=RED + YELLOW)
            System.out.println("The traffic light will change into GREEN after " + (RED + YELLOW - time) + " seconds ");
        else if(time>RED + YELLOW && time<= RED + YELLOW + GREEN)
            System.out.println("The traffic light will change into RED after " + (RED + YELLOW + GREEN - time) + " seconds");

    }
}
