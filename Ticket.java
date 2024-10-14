package TicketReservationApp;

public class Ticket {

    //4-mesafe (km), yolculuk tipi, koltuk no, fiyat, otobüs

    private double distance;

    private int typeNo; //1- tek yön 2- çift yön

    private String seatNo;

    private double price;

    //composition: bir sınıfın başka bir sınıfın örneğine sahip olmasıdır.
    private Bus bus; // bu bilet hangi otobüse ait

    public Ticket(double distance, int typeNo, String seatNo, Bus bus) {
        this.distance = distance;
        this.typeNo = typeNo;
        this.seatNo = seatNo;
        this.bus = bus;
    }

    public double getDistance() {
        return distance;
    }

    public int getTypeNo() {
        return typeNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public double getPrice() {
        return price;
    }

    public Bus getBus() {
        return bus;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setTypeNo(int typeNo) {
        this.typeNo = typeNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public void setPrice(int age) {
        double total=0;

        int seat=Integer.valueOf(this.seatNo);
        switch(this.typeNo){
            case 1: //tek yön
                if(seat%3==0){
                    total = this.distance * 1.2;
                }else{
                    total = this.distance * 1;
                }
                System.out.println("Toplam tutar: "+total);
                break;
            case 2: //çift yön
                if(seat%3==0){
                    total = this.distance * 2.4;
                }else{
                    total = this.distance * 2;
                }
                System.out.println("Toplam tutar: "+total);
                total=total*0.8;
                System.out.println("Çift yön indirimli tutar: "+total);
                break;
        }

        //yaş indirimi
        if(age<12){
            total=total*0.5;
            System.out.println("12 yaş indirimli tutar: "+total);
        }else if(age>=65){
            total=total*0.7;
            System.out.println("65 yaş indirimli tutar: "+total);
        }

        this.price=total;

    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    //6- bilet dökümünü yazdıralım
    public void printTicket(String name){
        System.out.println("*".repeat(42));
        System.out.println("---Bilet Detayı---");
        System.out.println("Sayın "+ name);
        System.out.println("Otobüs Plaka: "+this.bus.getNumberPlate());
        System.out.println("Mesafe: "+this.distance);
        System.out.println("Yolculuk Tipi: "+(this.typeNo==1 ? "Tek Yön" : "Çift Yön"));
        System.out.println("Koltuk No: "+this.seatNo);
        System.out.println("Toplam tutar: "+this.price);
        System.out.println("Keyifli Yolculuklar Dileriz.");
        System.out.println("*".repeat(42));
    }

}
