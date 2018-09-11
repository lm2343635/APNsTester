package org.mushare.apns.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "apns_certificate")
public class Certificate implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String cid;

    @Column(nullable = false)
    private String store;

    @Column(nullable = false)
    private Boolean production;

    @Column(nullable = false)
    private String password;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public Boolean getProduction() {
        return production;
    }

    public void setProduction(Boolean production) {
        this.production = production;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
