import java.util.Random;

public class StufsDb {

    private String[] roomArray = {"TvSet", "Phone", "Air conditioning" };
    private String[] kidsrArray = {"SonyPlaystation", "LapTop", "ElectroCar" };
    private String[] kitchenArray = {"Microwave", "Refrigerator ", "Mixer", "Blender", "Stove", "Oven", "Dishwasher", "Toaster"};
    private String[] serviceArray = {"AlarmSystem", "Iron", "VakuumCleaner" };

    public String[] getRoomArray() {
        return roomArray;
    }
    public String getRoom(int i) {
        return roomArray[i];
    }
    public String getItemArray(String[] arr, int i) {
        return arr[i];
    }

    public String[] getKidsrArray() {
        return kidsrArray;
    }

    public String[] getKitchenArray() {
        return kitchenArray;
    }

    public String[] getServiceArray() {
        return serviceArray;
    }

    public int randPower(){
        Random random = new Random();
        int price = random.nextInt(200) + 50;
        return price;
    }
    public boolean randIsOn(){
        Random random = new Random();
        int price = random.nextInt(2);
        if(price == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
