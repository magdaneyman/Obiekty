package sda.Prezentacja6;
import java.time.*;
import java.util.Date;


public class Note {

    private String[] tags;
    private Date dateOfCreation;
    private String memo;

    public Note(String[] tags, Date dateOfCreation, String memo) {
        this.tags = tags;
        this.dateOfCreation = dateOfCreation;
        this.memo = memo;
    }

    public Note() {
    }


    public String[] getTags() {
        return tags;
    }

    public boolean match(String n) {
        for (int i = 0; i < tags.length; i++) {
            if (tags[i].contains(n))
                return true;
        }
        if (memo.contains(n))
            return true;
        return false;

    }


}



