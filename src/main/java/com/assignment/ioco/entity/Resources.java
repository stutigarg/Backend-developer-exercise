package com.assignment.ioco.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "RESOURCES")
public class Resources implements Serializable {

    public static final long serialVersionUID= -7749077614744449271L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_RESOURCES")
    @SequenceGenerator(name = "SEQ_ID_RESOURCES", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ResourceName name;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_RESOURCES_SURVIVOR_ID"), nullable = false)
    private Survivor survivor;

    public enum ResourceName{
        WATER,
        FOOD,
        MEDICATION,
        AMMUNITION
    }
}
