package projlab;

public interface Item {
    public String getName();
    public void changeHolder(ItemHolder o);
    public ItemHolder getHolder();
}
