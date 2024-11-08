package model.entities;

import java.time.LocalDateTime;

public class CarRental{

    private static LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){
    }

    @SuppressWarnings("static-access")
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle){
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        
    }

    public static LocalDateTime getStart(){
        return start;
    }

     @SuppressWarnings("static-access")
	public void setStart(LocalDateTime start){
        this.start = start;
    }

    public LocalDateTime getFinish(){
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