package model;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "sesion")
public class Sesion {

    public int getIdSesion() {
        return idSesion;
    }

    public String getIp() {
        return ip;
    }

    public int getPid() {
        return pid;
    }
    int idSesion;
    String ip;
    int pid;

    public Sesion(int idSesion, String ip, int pid) {
        this.idSesion = idSesion;
        this.ip = ip;
        this.pid = pid;
    }
    
}
