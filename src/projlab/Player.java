package projlab;

import java.util.ArrayList;

public class Player implements ItemHolder{
    private ArrayList<Item> itemsHeld = new ArrayList<>();
    public void destroy(Item item) {
        itemsHeld.remove(item);
    }
    public void pickUp(Item item) {
        itemsHeld.add(item);
        item.changeHolder(this);
    }

    @Override
    public boolean holdsItem(Item item) {
        return itemsHeld.contains(item);
    }
}
