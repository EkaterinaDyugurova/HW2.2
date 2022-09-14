public class Main {
    public static void main(String[] args) {

        int balance1 = 100;
        int refill = 100;
        int balance2 = balance1 + refill;
        int bonus;
        //System.out.print(balance2);

        if (refill >= 1000) {
            bonus = balance2/100;
        } else {
            bonus = 0;
        }
        System.out.print(bonus);



    }
}
