package org.mushare.apns.domain;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "apns_project")
public class Project implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String pid;

    @Column(nullable = false)
    private String name;

    @OneToOne
    private Certificate production;

    @OneToOne
    private Certificate sandbox;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Certificate getProduction() {
        return production;
    }

    public void setProduction(Certificate production) {
        this.production = production;
    }

    public Certificate getSandbox() {
        return sandbox;
    }

    public void setSandbox(Certificate sandbox) {
        this.sandbox = sandbox;
    }
}
