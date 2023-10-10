// Immutable Vs Mutable String

public class Astring {
    public static void main(String[] args) {
        String brand = "pwskill" ;
        System.out.println(brand);
        brand.concat("bengaluru");
        System.out.println(brand);
    

        StringBuilder brand1 = new StringBuilder("pwskill");
        System.out.println(brand1);
        brand1.append("bengaluru");
        System.out.println(brand1);

    }
}
