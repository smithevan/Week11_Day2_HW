import java.util.ArrayList;

public class Library {

    private String name;
    private Book book;
    private int capacity;
    private ArrayList<Book> catalogue;


    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.catalogue = new ArrayList<Book>();
    }

    public int numberOfBooks() {
        return this.catalogue.size();
    }

//    public void addPassenger(Passenger passenger) {
//        if (this.passengerList.size() < capacity)
//            this.passengerList.add(passenger);
//    }

    public void addBook(Book book1) {
        if (this.catalogue.size() < capacity)
            this.catalogue.add(book1);
    }

    public void fillLibrary() {
        for(int b=1;b<=1000;b++){
            catalogue.add(book);
        }
    }

//    @Test
//    public void checkCanAddPassengerToBusNotOverCapacity(){
//        for(int p=1;p<=40;p++){
//            bus.addPassenger(passenger);
//        }
//        assertEquals(40,  bus.passengerListCount());
//    }



}
