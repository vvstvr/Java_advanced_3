package Home_work_3_gift;

public class Gift {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Леденцы", 9, 67.2, "Маме");
        Candy candy2 = new Candy("M&M", 10, 19.0, "Папе");
        Jellybean ch1 = new Jellybean("Халва", 11, 15.7, "Рассыпчатая");
        Jellybean ch2 = new Jellybean("Шоколад", 20, 100.1, "Горький");

        double sum = 0;
        int weight = 0;

        Present [] gift = {candy1, candy2, ch1, ch2};
        for (Present ny: gift) {
            System.out.println(ny);
            sum += ny.getPrice();
            weight += ny.getWeight();
        }
        System.out.println("Общий вес = "+ weight+ ", Общая сумма = " +sum);
    }
}

