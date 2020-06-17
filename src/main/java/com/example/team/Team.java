package com.example.team;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="TEAM")
public class Team implements Serializable {

    public static final String TABLE_TEAM_GEN = "TEAM_GEN";
    public static final String COLUMN_TEAM_NAME= "NAME";
    public static final String COLUMN_TEAM_DESCRIPTION= "DESCRIPTION";
    public static final String COLUMN_TEAM_TENANT_ID = "TENANT_ID";
    public static final String COLUMN_TEAM_CREATED_DATE= "CREATED_DATE";
    public static final String COLUMN_TEAM_CREATED_BY= "CREATED_BY";
    public static final String COLUMN_TEAM_MODIFIED_DATE= "MODIFIED_DATE";
    public static final String COLUMN_TEAM_MODIFIED_BY= "MODIFIED_BY";


    @Id
    @GeneratedValue(generator = TABLE_TEAM_GEN)
    @GenericGenerator(name = TABLE_TEAM_GEN, strategy = "uuid2")
    private String id;

    @Column(name=COLUMN_TEAM_NAME, nullable = false)
    private String name;

    @Column(name=COLUMN_TEAM_DESCRIPTION, nullable = true)
    private String description;

    @Column(name=COLUMN_TEAM_TENANT_ID,nullable = false)
    private String tenantId;

    @Column(name=COLUMN_TEAM_CREATED_DATE, nullable = false)
    private Timestamp createdDate;

    @Column(name=COLUMN_TEAM_CREATED_BY, nullable = false)
    private String createdBy;

    @Column(name=COLUMN_TEAM_MODIFIED_DATE, nullable = true)
    private Timestamp modifiedDate;

    @Column(name=COLUMN_TEAM_MODIFIED_BY, nullable = true)
    private String modifiedBy;

    public Team (){};


}
