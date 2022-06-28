package part2;

public class Candy extends Sweet{

    private String country;

    public Candy(String name, double price, int weight, String country) {
        super(name, price, weight);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Конфеты :")
                .append("\n").append("Страна производитель - ").append(country)
                .append("\n").append("Наименование - ").append(getName())
                .append("\n").append("Цена - ").append(getPrice()).append(" руб.")
                .append("\n").append("Вес - ").append(getWeight()).append(" гр.");
        return sb.toString();
    }
}
