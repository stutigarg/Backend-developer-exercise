package com.assignment.ioco.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SURVIVOR")
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
public class Survivor implements Serializable {

    public static final long serialVersionUID = -6588913283847200032L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_SURVIVOR")
    @SequenceGenerator(name = "SEQ_ID_SURVIVOR", allocationSize = 1)
    private long id;


    private String name;
    private int age;
    private String gender;
    private double latitude;
    private double longitude;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "survivor")
    private List<Resources> resources ;

    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name="CONTAMINATION_DETAILS",
            joinColumns={@JoinColumn(name="SURVIVOR_ID")},
            inverseJoinColumns={@JoinColumn(name="CONTAMINATED_ID")})
    private Set<Survivor> contaminated = new HashSet<Survivor>();

    @ManyToMany(mappedBy="contaminated")
    private Set<Survivor> survivors = new HashSet<Survivor>();



}
