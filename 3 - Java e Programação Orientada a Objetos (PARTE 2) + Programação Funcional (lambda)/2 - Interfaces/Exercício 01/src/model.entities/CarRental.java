package model.entities;

import java.time.LocaDateTime;

public class CarRental{

    private LocaDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle, Invoice invoice){
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public LocaDateTime getStart(){
        return start;
    }

     public void setStart(LocalDateTime start){
        this.start = start;
    }

    public LocaDateTime getFinish(){
        return finish;
    }

    public void setFinish(LocalDateTime finish){
            this.finish = finish;
        }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle){
            this.vehicle = vehicle;
        }

    public Invoice getInvoice(){
        return invoice;
    }

    public void setInvoice(Invoice invoice){
        this.invoice = invoice;
    }
}