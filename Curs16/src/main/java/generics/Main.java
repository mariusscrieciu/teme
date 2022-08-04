package generics;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Clothes> clothes = List.of(
                 new Clothes("Shirt",30,Category.NEW),
                 new Clothes("Suits",45,Category.ON_SALE),
                new Clothes("Shorts",12,Category.REFURBISHED),
                new Clothes("Coats",300,Category.NEW)
        );


        List<Fruits> fruits = List.of(
                new Fruits("mango",25,Category.NEW),
                new Fruits("pineapple",14,Category.ON_SALE),
                new Fruits("orange",16,Category.NEW),
                new Fruits("apple",2,Category.NEW)
        );

        List<Electronics> electronics = List.of(
                new Electronics("TV",750,Category.NEW),
                new Electronics("Laptop",1400,Category.ON_SALE),
                new Electronics("Mobile",690,Category.NEW),
                new Electronics("Mouse",125,Category.NEW)
        );



        Shop<Clothes> shopClothes = new Shop(clothes);
        System.out.println("Adding new elements");
        shopClothes.getAllItems();
        shopClothes.addItem(new Clothes("Swimwear",21,Category.ON_SALE));
        shopClothes.getAllItems();

        System.out.println("Find an element by category");
        System.out.println(shopClothes.findByCategory(Category.NEW));

        System.out.println("Find an element lower that price mentioned as argument");
        System.out.println(shopClothes.findWithLowerPrice(45));

        System.out.println("Find user by name");
        System.out.println(shopClothes.findByName("Suits").get());

        System.out.println("Remove element from list using name attribute");
        shopClothes.getAllItems();
        System.out.println(shopClothes.removeItem("Shirt").get());
        shopClothes.getAllItems();


        Shop<Electronics> shopElectronics = new Shop(electronics);

        Shop<Fruits> shopFruits = new Shop(fruits);


    }
}
