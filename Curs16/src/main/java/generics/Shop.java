package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem> {

    private List<T> itemList;

    public Shop(List<T> itemList) {
        this.itemList = new ArrayList<>(itemList);
    }

    public void addItem(T item) {
        this.itemList.add(item);
    }


    public List<T> findByCategory(Category category) {
        List<T> list = new ArrayList<>();
        for (T item : itemList) {
            if (item.category().name().equals(category.name())) {
                list.add(item);
            }
        }
        return list;
    }


    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> list = new ArrayList<>();
        for (T item : itemList) {
            if (item.price() < maxPrice) {
                list.add(item);
            }
        }
        return list;
    }


    public Optional<T> findByName(String name) {
        Optional<T> element = Optional.empty();
        for (T item : itemList) {
            if (item.name().equals(name)) {
                element = Optional.ofNullable(item);
            }
        }
        return element;
    }


    public Optional<T> removeItem(String name) {
        T element = null;
        for (int i = 0; i < itemList.size() - 1; i++) {
            if (itemList.get(i).name().equals(name)) {
                element = itemList.get(i);
                itemList.remove(i);
            }
        }
        return Optional.ofNullable(element);
    }

    public void getAllItems() {
        System.out.println(itemList);
    }


}
