package logic;

public class OrderItem {
    private Item item;
    private int itemAmount;

    public Item getItem() {
        return item;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = Math.max(0,itemAmount);
    }

    public OrderItem(Item item,int amount) {
        this.item = item;
        setItemAmount(amount);
    }
    public void increaseItemAmount(int amount){
        setItemAmount(getItemAmount()+Math.max(0,amount));
    }
    public int calculateTotalPrice(){
        return item.getPricePerPiece()*getItemAmount();
    }
}
