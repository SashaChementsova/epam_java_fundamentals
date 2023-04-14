package org.tasks.Task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    private List<CaseOfStudent> cases;
    {
        cases=new ArrayList<>();
    }
    public Archive(){}

    public Archive(List<CaseOfStudent> cases) {
        this.cases = cases;
    }

    public List<CaseOfStudent> getCases() {
        return cases;
    }

    public String getCasesLikeString() {
        String str="";
        for(CaseOfStudent caseOfStudent:cases){
            str+=caseOfStudent.toString();
            str+="\n";
        }
        return str;
    }

    public void setCases(List<CaseOfStudent> cases) {
        this.cases = cases;
    }
    public void printCasesOfStudent(){
        for(CaseOfStudent caseOfStudent:cases){
            System.out.println(caseOfStudent.toString());
        }
    }
    public void addCaseOfStudent(CaseOfStudent caseOfStudent){
        cases.add(caseOfStudent);
    }
    public CaseOfStudent findByID(int id){
        for(CaseOfStudent caseOfStudent:cases){
            if(caseOfStudent.getId()==id) return caseOfStudent;
        }
        return null;
    }
    public void editName(String name, int id){
        CaseOfStudent caseOfStudent=findByID(id);
        cases.remove(caseOfStudent);
        caseOfStudent.setName(name);
        cases.add(caseOfStudent);
    }
    public void editSurname(String surname, int id){
        CaseOfStudent caseOfStudent=findByID(id);
        cases.remove(caseOfStudent);
        caseOfStudent.setSurname(surname);
        cases.add(caseOfStudent);
    }
    public void editGroup(int group, int id){
        CaseOfStudent caseOfStudent=findByID(id);
        cases.remove(caseOfStudent);
        caseOfStudent.setGroup(group);
        cases.add(caseOfStudent);
    }
}
