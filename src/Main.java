public class Main {
    public static void main(String[] args) {

        int startBalance = 120;
        int replenishment = 1001;
        int minSumForBonus = 1000;
        int stepBonus = 100;

        if (replenishment > minSumForBonus) {
            System.out.println("Текущий баланс - "+(startBalance+replenishment+replenishment/stepBonus) + " рублей");
            System.out.println("Бонусные рубли - "+(replenishment/stepBonus));
        } else {
            System.out.println("Текущий баланс - "+(startBalance+replenishment) + " рублей");
            System.out.println("Бонусные рубли - 0");
        }
    }
}
