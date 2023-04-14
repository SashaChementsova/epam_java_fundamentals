package org.tasks.Task3;
//Общие требования к заданию:
//• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
//• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
//него изменения, или создать новое дело.
//Требования к коду лабораторной работы:
//• Для реализации сетевого соединения используйте сокеты.
//• Формат хранения данных на сервере – xml-файлы.
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
            String choice="",info="";
            while(!choice.equals("exit")) {
                System.out.println("Select a menu item:\n 1)Add a new case of student;\n 2)Print the cases of students;\n 3)Change the student's name;\n 4)Change the student's surname;\n 5)Change the student's group;\n 6)Exit.");
                choice = stdin.readLine();
                outstr.writeObject(choice);
                switch (choice){
                    case "1":
                        System.out.print("Enter the id: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the surname: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the name: : ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the group: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        break;
                    case "2":
                        System.out.println("All student's cases:");
                        System.out.println((String) instr.readObject());
                        break;
                    case "3":
                        System.out.print("Enter the id of the student: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the new surname: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        break;
                    case "4":
                        System.out.print("Enter the id of the student: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the new name: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );break;
                    case "5":
                        System.out.print("Enter the id of the student: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );
                        System.out.print("Enter the new group: ");
                        info = stdin.readLine();
                        outstr.writeObject(info );break;
                    case "6":
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
