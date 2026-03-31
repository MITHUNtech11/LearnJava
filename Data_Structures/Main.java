package Data_Structures;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cost per unit area
        double hc = sc.nextDouble(); // herbivores
        double cc = sc.nextDouble(); // carnivores
        double ac = sc.nextDouble(); // aquatic animals

        // Minimum space required per animal
        double hs = sc.nextDouble(); // herbivores
        double cs = sc.nextDouble(); // carnivores
        double as = sc.nextDouble(); // aquatic animals

        // Number of animals required
        int hn = sc.nextInt(); // herbivores
        int cn = sc.nextInt(); // carnivores
        int an = sc.nextInt(); // aquatic animals

        // Total land available
        double L = sc.nextDouble();

        // Minimum total area needed
        double herbArea = hn * hs;
        double carnArea = cn * cs;
        double aquaArea = an * as;

        double totalRequired = herbArea + carnArea + aquaArea;

        if (totalRequired > L) {
            System.out.println("Allocation not possible");
        } else {
            double totalCost = (herbArea * hc) + (carnArea * cc) + (aquaArea * ac);

            System.out.println("Allocation possible");
            System.out.println("Herbivores area = " + herbArea);
            System.out.println("Carnivores area = " + carnArea);
            System.out.println("Aquatic animals area = " + aquaArea);
            System.out.println("Total area used = " + totalRequired);
            System.out.println("Unused land = " + (L - totalRequired));
            System.out.println("Minimum total cost = " + totalCost);
        }

        sc.close();
    }
}