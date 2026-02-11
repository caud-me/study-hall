import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        // normally, currency in programming uses the double datatype for decimal support
        double srp_bolt = 5.25;
        double srp_nut = 30.0;
        double srp_washer = 10.50;

        // here, we import scanner from javas utility library so our program is interactive.
        // scanner allows for user to interact with the program.
        Scanner sc = new Scanner(System.in);

        // unnecessary decorative greeting, lists out the srp of bobs items
        System.out.println(
                "\n[Bob] Hello. Welcome to Bob's store, we offer bolts, nuts, washer for\nyour mechanical needs... What would you like to order?\n" +
                "\nBy the way, here's the pricing...\n" +
                "------------------------------------------------------------------------------\n" +
                "Item" + "\t\t" + "SRP\n" +
                "------------------------------------------------------------------------------\n" +
                "Bolt" + "\t\t" + srp_bolt + "\n" +
                "Nut" + "\t\t\t" + srp_nut + "\n" +
                "Washer" + "\t\t" + srp_washer + "\n"
        );


        // in this section, the program asks the user how many items they would like to order from bob
        System.out.print("How many bolts do you want? ");
        int count_bolt = sc.nextInt();

        System.out.print("How many nuts do you want? ");
        int count_nut = sc.nextInt();

        System.out.print("How many washers do you want? ");
        int count_washer = sc.nextInt();

        // we no longer need the user to interact after that, so we close the scanner
        // in java, this is a recommended practice for memory efficiency
        sc.close();

        // here, we calculate the total price of each item by multiplying its suggested retail price (srp) to the amount of items the user wants
        // or in programming logic: srp * value from scanner for each item.
        double total_bolt = srp_bolt * count_bolt;
        double total_nut = srp_nut * count_nut;
        double total_washer = srp_washer * count_washer;

        // this variable sums up all the total prices from the three items, this is how the user will be paying
        double total_price = total_bolt + total_nut + total_washer;

        // this checks if the user has ordered more bolts than nuts. if so, they will be given a notice, or a prompt. for them to re-check their order.
        // otherwise, the order will proceed
        // this uses a ternary operator, with a syntax of exp1 ? exp2 : exp3;
        System.out.println(count_bolt > count_nut ? "\n[Bob] hold on... can you check your order again?" : "\nOrder is OK.");

        // decorative total receipt using escape keys and symbols
        // despite the user getting a prompt or not, the program will still show the total receipt
        System.out.println(
                "------------------------------------------------------------------------------\n" +
                "#" + "\t\t" + "Item" + "\t\t" + "SRP" + "\t\t\t" + "Total\n" +
                "------------------------------------------------------------------------------\n" +
                count_bolt + "\t\t" + "Bolt" + "\t\t" + srp_bolt + "\t\t" + total_bolt + "\n" +
                count_nut + "\t\t" + "Nut" + "\t\t\t" + srp_nut + "\t\t" + total_nut + "\n" +
                count_washer + "\t\t" + "Washer" + "\t\t" + srp_washer + "\t\t" + total_washer + "\n" +
                "------------------------------------------------------------------------------\n" +
                "TOTAL\t\t\t\t\t\t\t" + total_price
        );
    }
}
