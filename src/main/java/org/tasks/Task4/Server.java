package org.tasks.Task4;


import org.tasks.Task4.controller.ParserDOM;
import org.tasks.Task4.controller.ParserJDOM;
import org.tasks.Task4.entity.Port;
import org.tasks.Task4.entity.Ship;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class Server implements Runnable
{
    private final Socket clientSocket;

    public Server(Socket socket) {
        this.clientSocket = socket;
    }
    public void run() {
        ObjectInputStream instr = null;
        ObjectOutputStream outstr = null;
        try {
            ParserDOM pd=new ParserDOM();
            ParserJDOM pjd=new ParserJDOM();
            Port port=new Port();
            port.setShips(pd.readXMLFile());
            List<Ship> ships;
            Ship ship;
            instr = new ObjectInputStream(clientSocket.getInputStream());
            outstr = new ObjectOutputStream(clientSocket.getOutputStream());
            String choice="",info="",info1="";
            while (!choice.equals("exit")) {
                choice = (String)instr.readObject();
                switch (choice){
                    case "1":
                        ship=new Ship();
                        info="";
                        info= (String)instr.readObject();
                        ship.setId(Integer.parseInt(info));
                        info = (String)instr.readObject();
                        ship.setCarrying(Double.parseDouble(info));
                        info= (String)instr.readObject();
                        ship.setName(info);
                        info= (String)instr.readObject();
                        ship.setTypeOfCargo(info);
                        boolean b=port.addShip(ship);
                        if(b) {pjd.recordXMLFile(port.getShips()); outstr.writeObject("okay");}
                        else outstr.writeObject("not okay");
                        break;
                    case "2":
                        outstr.writeObject(port.getShipsLikeString());
                        break;
                    case "3":
                        info= (String)instr.readObject();
                        port.deleteShip(Integer.parseInt(info));
                        pjd.recordXMLFile(port.getShips());
                        break;
                    case "4":
                        choice="exit";
                        break;
                }
            }
        } catch (Exception e) {

        }
        finally {
            try{
                instr.close();
                outstr.close();
                clientSocket.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
