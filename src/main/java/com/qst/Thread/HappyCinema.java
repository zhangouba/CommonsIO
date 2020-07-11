package com.qst.Thread;

import java.util.ArrayList;
import java.util.List;

public class HappyCinema {
    public static void main(String[] args) {

        List<Integer> seats=new ArrayList<>();
        for (int i=1;i<=20;i++){
            seats.add(i);
        }

        List<Integer> chooseseats0=new ArrayList<>();
        chooseseats0.add(1);
        chooseseats0.add(2);
        List<Integer> chooseseats1=new ArrayList<>();
        chooseseats1.add(4);
        chooseseats1.add(5);
        chooseseats1.add(7);

        Cinema cinema=new Cinema("sxt",seats);
        new  Thread(new Persons(cinema,chooseseats0)).start();
        new  Thread(new Persons(cinema,chooseseats1)).start();

    }
}

class Cinema{
    String CinemaName;
    List<Integer> seats;
    public Cinema(String cinemaName, List<Integer>  seats) {
        CinemaName = cinemaName;
        this.seats = seats;
    }
}

class Persons implements  Runnable{
    Cinema cinema;
    List<Integer> chooseseats;

    public Persons(Cinema cinema, List<Integer> chooseseats) {
        this.cinema = cinema;
        this.chooseseats = chooseseats;
    }

    @Override
    public void run() {
        te();
    }
    public  boolean te(){
        if (chooseseats.size()>cinema.seats.size()
             ){
            return false;
        }
        synchronized(cinema){
           List<Integer> copy=new ArrayList<>();
           copy.addAll(cinema.seats);
           copy.removeAll(chooseseats);


            if (cinema.seats.size()!=chooseseats.size()+copy.size()){

                return false;
            }
            cinema.seats=copy;
            System.out.println(Thread.currentThread().getName()+"恭喜你reserve成功"+chooseseats+"张票");
            System.out.println("剩余座位为"+cinema.seats);
           return true;
        }
    }
}