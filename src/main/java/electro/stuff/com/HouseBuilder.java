package electro.stuff.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HouseBuilder {

    private StufsDb stufsDb = new StufsDb();

    private List<ItemEntity> houseData = new ArrayList<>();

    public HouseBuilder(){
        createHouse();
    }

    //random create house data
    private void createHouse(){
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

    public void showOnlyTurnOn(){
        int power = 0;
        for (Iterator<ItemEntity> it = houseData.iterator(); it.hasNext(); ) {
            ItemEntity item = it.next();
            if(item.isOn()){
                power += item.getPower();
                printItemList(item);
                System.out.println("Total power = " + power + " Watt");
            }
        }
    }

    public void findByPowerAndType(int power, int type){
        for (Iterator<ItemEntity> it = houseData.iterator(); it.hasNext(); ) {
            ItemEntity item = it.next();
            if(item.getPower() == power && item.getItemType() == ItemEntity.ItemType.values()[type-1] ){
                printItemList(item);
            }
        }
    }

    public void findByType(int type){
        for (Iterator<ItemEntity> it = houseData.iterator(); it.hasNext(); ) {
            ItemEntity item = it.next();
            if(item.getItemType() == ItemEntity.ItemType.values()[type-1] ){
                printItemList(item);
            }
        }
    }

    public void findByPower(int power){
            for (ItemEntity item : houseData) {
            if(item.getPower() == power){
                printItemList(item);
            }
        }
    }

    public void sortItemList(){
        Collections.sort(houseData);
        IterationPrint(houseData);
    }

    private void IterationPrint(List<ItemEntity> stouncDB){
        for (Iterator<ItemEntity> it = stouncDB.iterator(); it.hasNext(); ) {
            ItemEntity stoneItem = it.next();
            printItemList(stoneItem);
        }
    }
    private void printItemList(ItemEntity itemEntity){
        System.out.print("Name:> " + itemEntity.getItemName());
        System.out.print("  ||_Power:> " + itemEntity.getPower() + " Watt" );
        System.out.print("  ||_Type:> " + itemEntity.getItemType());
        System.out.print("  ||_TurnOn:> " + itemEntity.isOn());
        System.out.println();
    }
 }
