import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HouseBuilder {

    StufsDb stufsDb = new StufsDb();
    public List<ItemEntity> getStouncDB() {
        return houseData;
    }

    List<ItemEntity> houseData = new ArrayList<>();

    public HouseBuilder(){
        createHouse();
    }

    public void createHouse(){
        ItemEntity entity;
        for (int i = 0; i < stufsDb.getRoomArray().length; i++){
            entity = new ItemEntity(stufsDb.getItemArray(stufsDb.getRoomArray(), i), stufsDb.randPower(), ItemEntity.ItemType.ROOM, stufsDb.randIsOn() );
            houseData.add(entity);
       }
        for (int i = 0; i < stufsDb.getKidsrArray().length; i++){
            entity = new ItemEntity(stufsDb.getItemArray(stufsDb.getKidsrArray(), i), stufsDb.randPower(), ItemEntity.ItemType.KIDSROOM, stufsDb.randIsOn() );
            houseData.add(entity);
       }
        for (int i = 0; i < stufsDb.getKitchenArray().length; i++){
            entity = new ItemEntity(stufsDb.getItemArray(stufsDb.getKitchenArray(), i), stufsDb.randPower(), ItemEntity.ItemType.KITCHEN, stufsDb.randIsOn() );
            houseData.add(entity);
       }
        for (int i = 0; i < stufsDb.getServiceArray().length; i++){
            entity = new ItemEntity(stufsDb.getItemArray(stufsDb.getServiceArray(), i), stufsDb.randPower(), ItemEntity.ItemType.SERVICE, stufsDb.randIsOn() );
            houseData.add(entity);
       }
    }
    public void showAllData(){
        for (Iterator<ItemEntity> it = houseData.iterator(); it.hasNext(); ) {
            ItemEntity item = it.next();
            printItemList(item);
        }
    }
    private void printItemList(ItemEntity itemEntity){
        System.out.print("Name:> " + itemEntity.getItemName());
        System.out.print("  ||_Power:> " + itemEntity.getPower());
        System.out.print("  ||_Type:> " + itemEntity.getItemType());
        System.out.print("  ||_TurnOn:> " + itemEntity.isOn());
        System.out.println();
    }
}
