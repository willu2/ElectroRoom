

public class ElectroStufs {
    public static void main(String[] args) {

        HouseBuilder houseBuilder = new HouseBuilder();
        MenuBuilder menu = new MenuBuilder();

        boolean exit = false;

        do {
            int pos = 0;


            menu.mainManu();

           // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            switch (menu.menuTotalPowerEnter()) {
                case 1:
                    houseBuilder.showAllData();
                    break;
                case 2:
                    houseBuilder.showOnlyTurnOn();
                    break;
                case 3:
                    houseBuilder.sortItemList();
                    break;
                case 4:
                    menu.powerEnter();
                    pos = menu.menuTotalPowerEnter();
                    houseBuilder.findByPower(pos);
                    break;
                case 5:
                    menu.typeShow();
                    pos = menu.menuTotalPowerEnter();
                    houseBuilder.findByType(pos);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again...");
            }

        }while (!exit);
    }
}
