import java.util.*;

public class Main {
    static final int PRIZE_KG = 4;

    public static void main(String[] args) {
        int priceAll = 0;

        Map<Address, Integer> costPerAddress = new HashMap<>();
        Set<String> uniqueCountry = new HashSet<>();

        costPerAddress.put(new Address("Россия", "Волгоград"), 11);
        costPerAddress.put(new Address("Россия", "Пенза"), 8);
        costPerAddress.put(new Address("Россия", "Тула"), 4);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int price = 0;
            int weight = 0;
            System.out.print("Заполнение нового заказа.\n" +
                    "Введите страну  или end: ");
            String inputCountry = scanner.nextLine();
            if ("end".equals(inputCountry)) {
                break;
            }
            System.out.print("Введите город: ");
            String inputCity = scanner.nextLine();
            Address inputaddress = new Address(inputCountry, inputCity);
            System.out.print("Введите вес (кг): ");
            try {
                weight = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите вес товара числом!\n");
            }
            if (costPerAddress.containsKey(inputaddress) == false) {
                System.out.println("Tакой адрес не обслуживается:\n");
            } else {
                uniqueCountry.add(inputCountry);
                price = (weight * PRIZE_KG);
            }
            System.out.println("Стоимость доставки составит: " + price);
            System.out.println("Общая стоимость всех доставок: " + (priceAll += price));
            System.out.println("Заказы были оформлены в страны:" + uniqueCountry + "\n");
        }
        System.out.println("ПРОГРАММА ЗАВЕРШЕНА!");
    }
}