package org.lxd.learn.boot.multi.datasource1.entity;

import javax.persistence.*;

@Table(name = "t_dep")
public class TDep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dep_name")
    private String depName;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return dep_name
     */
    public String getDepName() {
        return depName;
    }

    /**
     * @param depName
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }
}