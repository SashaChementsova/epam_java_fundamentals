package org.tasks.Task2.entity;


import java.util.Comparator;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note {
    private String heading;
    private String date;
    private String email;
    private String message;
    public Note(){}

    public Note(String heading, String date, String email, String message) {
        this.heading = heading;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Note: heading=" + heading +
                ", date=" + date +
                ", email=" + email +
                ", message=" + message ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(heading, note.heading) && Objects.equals(date, note.date) && Objects.equals(email, note.email) && Objects.equals(message, note.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heading, date, email, message);
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean validateEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validateDate(String date){
        String regex = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(date);
        return matcher.matches();
    }

    public static Comparator<Note> sortNotesByHeading = new Comparator<Note>() {

        public int compare(Note n1, Note n2) {
            String heading1=n1.getHeading().toUpperCase();
            String heading2=n2.getHeading().toUpperCase();
            return heading1.compareTo(
                    heading2);
        }
    };

    public static Comparator<Note> sortNotesByDate = new Comparator<Note>() {

        public int compare(Note n1, Note n2) {
            String date1=n1.getDate().toUpperCase();
            String date2=n2.getDate().toUpperCase();
            return date1.compareTo(date2);
        }
    };
}
