
package com.ariza.miprueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Visits")
public class Visit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "visita")
    private int count;
    @Column(name = "mode")
    private boolean isDevelop;
    
    public Visit(){}
    public Visit(boolean isDevelop){
        this.isDevelop = isDevelop;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isIsDevelop() {
        return isDevelop;
    }

    public void setIsDevelop(boolean isDevelop) {
        this.isDevelop = isDevelop;
    }
     
}
