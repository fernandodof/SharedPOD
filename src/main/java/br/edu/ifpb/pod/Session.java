package br.edu.ifpb.pod;

import java.io.Serializable;
import java.sql.Time;
import java.util.Calendar;
import java.util.Objects;
/**
 *
 * @author Fernando
 */
public class Session implements Serializable{
    public String id;
    public Time time;
    public boolean valid;

    public Session() {
        setId(generateId());
        this.time = null;
        this.valid = true;
    }
    
    private synchronized String generateId(){
        return Calendar.getInstance().getTime().toString().concat(String.valueOf(Math.random()));
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Session other = (Session) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}