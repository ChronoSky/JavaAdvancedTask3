package part2;

public class Part2 {

    public static void main(String[] args) {

        Candy candy = new Candy("Ромашка", 53.48, 100, "Россия");
        Jellybean jellybean = new Jellybean("Мамба", 295.67, 500, "Клубника");
        Marshmallow marshmallow = new Marshmallow("Шармэль", 154.00, 350, 8);

        Sweet[] box = {candy, jellybean, marshmallow};
        double boxPrice = 0;
        int boxWeight = 0;
        for (Sweet sweet : box) {
            boxPrice += sweet.getPrice();
            boxWeight += sweet.getWeight();
        }
        System.out.printf("Общий вес подарка : %d гр.\n", boxWeight);
        System.out.printf("Общая стоимость подарка : %.2f руб.\n", boxPrice);

        for (Sweet sweet : box) {
            System.out.println(sweet.toString());
        }
    }
}
