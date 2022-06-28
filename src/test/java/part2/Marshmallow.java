package part2;

public class Marshmallow extends Sweet {

    private int quantity;

    public Marshmallow(String name, double price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Зефир :")
                .append("\n").append("Количество штук - ").append(quantity)
                .append("\n").append("Наименование - ").append(getName())
                .append("\n").append("Цена - ").append(getPrice()).append(" руб.")
                .append("\n").append("Вес - ").append(getWeight()).append(" гр.");
        return sb.toString();
    }
}
