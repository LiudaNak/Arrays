import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] arg) {

        Product product1 = new Product("flower", 100, "Rose", Product.Category.Premium);
        Product product2 = new Product("vegetable", 20, "onion", Product.Category.Premium);
        Product product3 = new Product("fruit", 50, "apple", Product.Category.High);
        Product product4 = new Product("device", 100000, "iPhone", Product.Category.Low);
        Product product5 = new Product("Vegetable", 60, "cucumber", Product.Category.High);

        //Складаємо в масив
        Product[] productArray = {product1, product2, product3, product4, product5};


        // створюю нові масиви такої довжини, щоб точно всі продукти влізли, якщо всі будуть однієї категорії
        Product[] productsOfLowCategory = new Product[productArray.length];
        Product[] productsOfHighCategory = new Product[productArray.length];
        Product[] productsOfPremiumCategory = new Product[productArray.length];


        //тут не знайшла, як записати продукти в масиви за категоріями, не використовуючи при цьому колекцію, але завдання було - тільки масиви.
        //тому продукти за категоріями хоча б виведу на екран.
        // Мабуть, там треба використати метод toArray, але в мене ніяк не виходить
        for (Product i : productArray) {
            if (i.getCategory() == Product.Category.High) {
                System.out.println("High category is in " + i.getDescription());
            } else if (i.getCategory() == Product.Category.Premium) {
                System.out.println("Premiun category is in " + i.getDescription());
            } else if (i.getCategory() == Product.Category.Low) {
                System.out.println("Low catecory is in " + i.getDescription());
            } else {
                System.out.println("Something went wrong with Categories");
            }
        }

        //Цей код мав використовуватись для перевірки, якби я таки записала масиви з категоріями
        try {

            for (Product x : productsOfHighCategory) {
                System.out.println("Products with High category: " + x.getDescription());
            }
            for (Product x : productsOfPremiumCategory) {
                System.out.println("Products with Premium category: " + x.getDescription());
            }
            for (Product x : productsOfLowCategory) {
                System.out.println("Products with Low category: " + x.getDescription());
            }
        } catch (NullPointerException ex) {
            System.out.println("Null");
        }




//Посчитать количество продуктов с ценой ниже 100
        int countForPrice = 0;
        for (Product x : productArray) {
            if (x.getPrice() < 100) {
                countForPrice = countForPrice + 1;
            } else {
                continue;
            }
        }
        System.out.println("There are " + countForPrice + " products which price is less than 100 ghn");



        //Посчитать количество объектов которые имеют "vegetable" в названии
        int countForName = 0;
        for (Product x : productArray) {
            if (x.getName().equalsIgnoreCase("Vegetable")) {
                countForName = countForName + 1;
            } else {
                continue;
            }
        }
        System.out.println("There are " + countForName + " products which Name is \"Vegetable\"");

    }
}
