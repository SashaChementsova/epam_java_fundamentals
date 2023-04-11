package org.programming.with.classes.aggregation.and.coposition.Task5;

import java.util.ArrayList;

public class TravelAgent {
    private ArrayList<Voucher> vouchers = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();

    public TravelAgent() {
        base();
    }
    private void base(){

        vouchers.add(new Voucher( 9, Transport.BUS, TravelType.EXCURSIONS));
        vouchers.add(new Voucher( 24, Transport.TRAIN, TravelType.PILGRIMAGE));
        vouchers.add(new Voucher(15, Transport.PLANE, TravelType.REST));

        clients.add(new Client(324,"Ivan", "Ivanov"));
        clients.add(new Client(25,"Petr", "Petrov"));
        clients.add(new Client(534,"Sydor", "Sydorov"));
    }

    public Voucher clientsChoise(Transport choiceTr, TravelType choiceType, int days ){

        Voucher voucherSearched = new Voucher();
        for (Voucher v : vouchers) {

            if(v.getTransport().equals(choiceTr) && v.getType().equals(choiceType)
                     && v.getCountOfDays() == days){
                voucherSearched = v;
                System.out.println("Congratulation, you choosed our special offer!");
            }
        }
        return voucherSearched;
    }
    public Voucher clientsChoiseExlusive(Transport choiceTr, TravelType choiceType, int days ){

        Voucher voucherSearched = new Voucher();

        voucherSearched.setTransport(choiceTr);
        voucherSearched.setType(choiceType);
        voucherSearched.setCountOfDays(days);

        return voucherSearched;
    }
}
