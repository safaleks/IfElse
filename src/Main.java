public class Main {
    public static void main(String[] args) {

        int startBalance = 120;
        int replenishment = 980;
        int minSumForBonus = 500;
        int stepBonus = 150;

        if (replenishment >= minSumForBonus) {
            System.out.println("Текущий баланс - "+(startBalance+replenishment+replenishment/stepBonus) + " рублей");
            System.out.println("Бонусные рубли - "+(replenishment/stepBonus));
        } else {
            System.out.println("Текущий баланс - "+(startBalance+replenishment) + " рублей");
            System.out.println("Бонусные рубли - 0");
        }
    }
}
