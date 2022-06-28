package part2;

public class Jellybean extends Sweet{
    private String taste;

    public Jellybean(String name, double price, int weight, String taste) {
        super(name, price, weight);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Мармелад :")
                .append("\n").append("Вкус - ").append(taste)
                .append("\n").append("Наименование - ").append(getName())
                .append("\n").append("Цена - ").append(getPrice()).append(" руб.")
                .append("\n").append("Вес - ").append(getWeight()).append(" гр.");
        return sb.toString();
    }
}
