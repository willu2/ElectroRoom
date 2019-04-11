package electro.stuff.com;

public class ItemEntity implements Comparable<ItemEntity>{

        //types of house zone
        enum ItemType{
            ROOM,
            KIDSROOM,
            KITCHEN,
            SERVICE
        }

    private ItemType itemType;

    private String itemName;

    private Integer power;
    private boolean isOn;

    public ItemEntity() {
            }

    public ItemEntity(String name, int power, ItemType type, boolean turnon) {
        itemName = name;
        this.power = power;
        this.itemType = type;
        this.isOn = turnon;

    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Integer getPower() {
        return power;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
            return "Item [power=" + power + "]";
        }

    @Override
    public int compareTo(ItemEntity o) {
            return this.getPower().compareTo(o.getPower());
        }
}


