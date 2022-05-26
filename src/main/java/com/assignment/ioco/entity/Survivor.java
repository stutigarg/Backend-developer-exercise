package com.assignment.ioco.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SURVIVOR")

public class Survivor implements Serializable {

    public static final long serialVersionUID = -6588913283847200032L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_SURVIVOR")
    @SequenceGenerator(name = "SEQ_ID_SURVIVOR", allocationSize = 1)
    private long id;


    private String name;
    private String age;
    private String gender;
    private double latitude;
    private double longitude;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "survivor")
    private List<Resources> resources ;

    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name="CONTAMINATION",
            joinColumns={@JoinColumn(name="SURVIVOR_ID")},
            inverseJoinColumns={@JoinColumn(name="CONTAMINATED_ID")})
    private Set<Survivor> contaminated = new HashSet<Survivor>();

    @ManyToMany(mappedBy="contaminated")
    private Set<Survivor> teammates = new HashSet<Survivor>();



}
