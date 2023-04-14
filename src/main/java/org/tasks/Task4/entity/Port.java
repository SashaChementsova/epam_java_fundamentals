package org.tasks.Task4.entity;



import java.util.ArrayList;
import java.util.List;

public class Port {
    private List<Ship> ships;
    {
        ships=new ArrayList<>();
    }
    private double capacity;
    public Port(){
        capacity=1000;
    }
    public Port(List<Ship> ships) {
        this.ships = ships;
        this.capacity = 1000;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public double getCapacity() {
        return capacity;
    }

    public double sumCarryingOfShips(){
        double sum=0;
        for(Ship ship:ships) sum+=ship.getCarrying();
        return sum;
    }

    public boolean addShip(Ship ship){
        if(ship.getCarrying()+sumCarryingOfShips()<=capacity){
            ships.add(ship);
            return true;
        }
        else return false;
    }

    public void deleteShip(int id){
        for(Ship s:ships){
            if(s.getId()==id){ ships.remove(s); break;}
        }
    }
    public String getShipsLikeString(){
        String str="";
        for(Ship ship:ships){
            str+=ship.toString();
            str+="\n";
        }
        return str;
    }
}
