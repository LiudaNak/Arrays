import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] arg) {

        Product product1 = new Product("flower", 100, "Rose", Product.Category.Premium);
        Product product2 = new Product("vegetable", 20, "onion", Product.Category.Premium);
        Product product3 = new Product("fruit", 50, "apple", Product.Category.High);
        Product product4 = new Product("device", 100000, "iPhone", Product.Category.Low);
        Product product5 = new Product("Vegetable", 60, "cucumber", Product.Category.High);

        //Переводжу масив у ліст
        Product[] productArray = {product1, product2, product3, product4, product5};
        List<Product> listOfProducts = Arrays.asList(productArray);


        //З аналізу на лекції
        /*Product[] productWithHighCat = new Product[productArray.length];
        Product[] productWithPremiumCat = new Product[productArray.length];
        Product[] productWithLowCat = new Product[productArray.length];

        for (int i = 0; i < productArray.length; i++) {
            if (productArray[i].getCategory().equals(Product.Category.High)) {
                productWithHighCat[i] = productArray[i];
            }
            if (productArray[i].getCategory().equals(Product.Category.Premium)) {
                productWithPremiumCat[i] = productArray[i];
            }
            if (productArray[i].getCategory().equals(Product.Category.Low)) {
                productWithLowCat[i] = productArray[i];
            }
        } */

        //Створюю лісти
        List<Product> listOfHighCatgory = new ArrayList<>();
        List<Product> listOfLowCategoty = new ArrayList<>();
        List<Product> listOfPremiumCategory = new ArrayList<>();


        //за категоріями
        for (Product i : listOfProducts) {
            if (i.getCategory() == Product.Category.High) {
                listOfHighCatgory.add(i);

            } else if (i.getCategory() == Product.Category.Premium) {
                listOfPremiumCategory.add(i);

            } else if (i.getCategory() == Product.Category.Low) {
                listOfLowCategoty.add(i);

            } else {
                System.out.println("Something went wrong with Categories");
            }
        }


        System.out.println("Products with high category: " + listOfHighCatgory);
        System.out.println("Products with premium category: " + listOfPremiumCategory);
        System.out.println("Products with low category" + listOfLowCategoty);


//Посчитать количество продуктов с ценой ниже 100
        int countForPrice = 0;
        for (Product x : listOfProducts) {
            if (x.getPrice() < 100) {
                countForPrice = countForPrice + 1;
            } else {
                continue;
            }
        }
        System.out.println("There are " + countForPrice + " products which price is less than 100 ghn");


        //Посчитать количество объектов которые имеют "vegetable" в названии
        int countForName = 0;
        for (Product x : listOfProducts) {
            if (x.getName().equalsIgnoreCase("Vegetable")) {
                countForName = countForName + 1;
            } else {
                continue;
            }
        }
        System.out.println("There are " + countForName + " products which Name is \"Vegetable\"");


        //sorting by Comparable
       // System.out.println("Before sorting: " + listOfProducts);
        //Collections.sort(listOfProducts);
        //System.out.println("After sorting: " + listOfProducts);


        Comparator priceComparator = new ComparatorByPrice();
        Collections.sort(listOfProducts, priceComparator);
        System.out.println("Sorted by price - " + listOfProducts);

        Comparator nameComparator = new ComparatorByName();
        Collections.sort(listOfProducts, nameComparator);
        System.out.println("Sorted by name - " + listOfProducts);
    }
}
