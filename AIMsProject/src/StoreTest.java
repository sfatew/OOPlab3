public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci. Fi", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        store.removeDVD(dvd2);
    }

}
