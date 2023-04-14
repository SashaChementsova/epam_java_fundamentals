package org.tasks.Task3;

import org.tasks.Task3.controller.ParserDOM;
import org.tasks.Task3.controller.ParserJDOM;
import org.tasks.Task3.entity.Archive;
import org.tasks.Task3.entity.CaseOfStudent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Locale;

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
            Archive archive=new Archive();
            archive.setCases(pd.readXMLFile());
            List<CaseOfStudent> cases;
            CaseOfStudent caseOfStudent;
            instr = new ObjectInputStream(clientSocket.getInputStream());
            outstr = new ObjectOutputStream(clientSocket.getOutputStream());
            String choice="",info="",info1="";
            while (!choice.equals("exit")) {
                choice = (String)instr.readObject();
                switch (choice){
                    case "1":
                        caseOfStudent=new CaseOfStudent();
                        info="";
                        info= (String)instr.readObject();
                        caseOfStudent.setId(Integer.parseInt(info));
                        info = (String)instr.readObject();
                        caseOfStudent.setSurname(info);
                        info= (String)instr.readObject();
                        caseOfStudent.setName(info);
                        info= (String)instr.readObject();
                        caseOfStudent.setGroup(Integer.parseInt(info));
                        archive.addCaseOfStudent(caseOfStudent);
                        pjd.recordXMLFile(archive.getCases());
                        break;
                    case "2":
                        outstr.writeObject(archive.getCasesLikeString());
                        break;
                    case "3":
                        info= (String)instr.readObject();
                        info1 = (String)instr.readObject();
                        archive.editSurname(info1,Integer.parseInt(info));
                        pjd.recordXMLFile(archive.getCases());
                        break;
                    case "4":
                        info= (String)instr.readObject();
                        info1 = (String)instr.readObject();
                        archive.editName(info1,Integer.parseInt(info));
                        pjd.recordXMLFile(archive.getCases());
                        break;
                    case "5":
                        info= (String)instr.readObject();
                        info1 = (String)instr.readObject();
                        archive.editGroup(Integer.parseInt(info1),Integer.parseInt(info));
                        pjd.recordXMLFile(archive.getCases());
                        break;
                    case "6":
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
