import java.util.Random;

public class ItemEntity implements Comparable<ItemEntity>{

        enum ItemType{
            ROOM,
            KIDSROOM,
            KITCHEN,
            SERVICE
        }

    private ItemType itemType;

    public ItemType getItemType() {
        return itemType;
    }

    public String getStoneName() {
        return stoneName;
    }

    private String stoneName;
        private Integer power;
        private boolean isOn;

        public ItemEntity() {
            }

    public ItemEntity(String name, int power, ItemType type, boolean turnon) {
        stoneName = name;
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

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
            return "Item [price=" + power + "]";
        }

    @Override
    public int compareTo(ItemEntity o) {
            return this.getPower().compareTo(o.getPower());
        }
}


