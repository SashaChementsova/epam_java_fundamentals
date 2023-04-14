package org.tasks.Task4;
//Задание 4. Многопоточность. Порт . Корабли заходят в порт для
//разгрузки/загрузки контейнеров. Число контейнеров, находящихся в текущий момент
//в порту и на корабле, должно быть неотрицательным и превышающим заданную
//грузоподъемность судна и вместимость порта. В порту работает несколько причалов.
//У одного причала может стоять один корабль. Корабль может загружаться у причала
//или разгружаться.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
// работы в сети
public class Client {
    public static void main(String[] arg) {
        try {
            Socket clientSocket = new Socket("127.0.0.1",2525);
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream outstr =  new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream  instr = new ObjectInputStream(clientSocket.getInputStream());
            String choice="",info="",info1="";
            while(!choice.equals("exit")) {
                System.out.println("Select a menu item:\n 1)Load the ship;\n 2)Show all ships;\n 3)Unload the ship;\n 4)Exit.");
                choice = stdin.readLine();
                outstr.writeObject(choice);
                switch (choice){
                    case "1":
                        System.out.print("Enter the id: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the capacity: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the name: : ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the cargo of ship: ");
                        info = stdin.readLine();
                        outstr.writeObject(info);
                        info1=(String) instr.readObject();
                        if(info1.equals("okay")) System.out.println("The ship was loaded");
                        else System.out.println("The ship wasn't loaded because the port  is full");
                        break;
                    case "2":
                        System.out.println("All ships:");
                        System.out.println((String) instr.readObject());
                        break;
                    case "3":
                        System.out.print("Enter the id of the ship: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        break;
                    case "4":
                        choice="exit";
                        break;
                }
            }
            outstr.close();
            instr.close();
            clientSocket.close();
        }
        catch(Exception e)	{
            e.printStackTrace();
        }
    }
}
