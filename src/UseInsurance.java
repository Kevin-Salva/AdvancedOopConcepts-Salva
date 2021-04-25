import java.util.Scanner;
public class UseInsurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1) Life Insurance or 2) Health Insurance");
        String input_User = input.next();
        int insurance = Integer.parseInt(input_User);



        if (insurance == 1) {
            insuranceLife();



        }


        if (insurance == 2) {
            insuranceHealth();

        } else {
            System.out.println("number not in choices");
        }



    }
    public static void insuranceLife(){
        Life iL = new Life();
        iL.display();
    }
    public static void insuranceHealth(){
        Health iH = new Health();
        iH.display();

    }
}
