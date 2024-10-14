package TicketReservationApp;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    // 2- koltuk sayısı, koltuk numaraları, plaka : özellikleri, field, alan

    private String numberPlate;

    private int numberOfSeat;

    private List<String> seats = new ArrayList<>();//"1", "2", "3"

    //3- parametreli constructor

    public Bus(String plaka, int koltukSayisi){
        this.numberPlate = plaka;
        this.numberOfSeat = koltukSayisi;
        for (int i = 1; i <= this.numberOfSeat; i++) {
            this.seats.add(String.valueOf(i));
        }
    }

    //getter
    public String getNumberPlate() {
        return numberPlate;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public List<String> getSeats() {
        return seats;
    }

    //setter

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }


}
