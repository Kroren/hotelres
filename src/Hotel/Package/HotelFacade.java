package Hotel.Package;

/* Facade Design pattern
    Denoted in main_menu as *Facade
 */
public class HotelFacade {
    private Hotel hotel0;

    public HotelFacade() {
        try {
            hotel0 = new Hotel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listAvailable() {
        hotel0.listavai();
    }

    public void listOccupied() {
        hotel0.listocc();
    }

    public void listClosed() {
        hotel0.listclosed();
    }

    public void changeVaccency(int rmNum) {
        hotel0.changeVacc(rmNum);
    }

    public void closeRoom(int rmNum) {
        hotel0.closeRoom(rmNum);
    }
}