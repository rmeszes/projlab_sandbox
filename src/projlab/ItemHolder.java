package projlab;

public interface ItemHolder {
    public void destroy(Item item);
    public void pickUp(Item item);
    public boolean holdsItem(Item item);
}
