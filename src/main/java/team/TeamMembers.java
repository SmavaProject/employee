package team;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="TEAM_MEMBERS")
public class TeamMembers implements Serializable {

    public static final String COLUMN_TEAM_MEMBERS_TEAM_ID= "TEAM_ID";
    public static final String COLUMN_TEAM_MEMBERS_USER_ID = "USER_ID";
    public static final String COLUMN_TEAM_MEMBERS_TENANT_ID = "TENANT_ID";
    public static final String COLUMN_TEAM_MEMBERS_ROLE = "ROLE";
    public static final String COLUMN_TEAM_MEMBERS_IS_DEFAULT = "IS_DEFAULT";
    public static final String COLUMN_TEAM_MEMBERS_CREATED_DATE= "CREATED_DATE";
    public static final String COLUMN_TEAM_MEMBERS_CREATED_BY= "CREATED_BY";
    public static final String COLUMN_TEAM_MEMBERS_MODIFIED_DATE= "MODIFIED_DATE";
    public static final String COLUMN_TEAM_MEMBERS_MODIFIED_BY= "MODIFIED_BY";

    @ManyToOne
    @JoinColumn(name=COLUMN_TEAM_MEMBERS_TEAM_ID, nullable = false)
    private String teamId;

    @Column(name=COLUMN_TEAM_MEMBERS_USER_ID, nullable = false)
    private String userId;

    @Column(name=COLUMN_TEAM_MEMBERS_TENANT_ID, nullable = false)
    private String tenantID;

    @Column(name=COLUMN_TEAM_MEMBERS_ROLE, nullable = false)
    private Role role;

    @Column(name=COLUMN_TEAM_MEMBERS_IS_DEFAULT, nullable = true)
    private boolean isDefault;

    @Column(name = COLUMN_TEAM_MEMBERS_CREATED_DATE, nullable = false)
    private Timestamp createdDate;

    @Column(name = COLUMN_TEAM_MEMBERS_CREATED_BY, nullable = false)
    private String createdBy;

    @Column(name = COLUMN_TEAM_MEMBERS_MODIFIED_DATE, nullable = true)
    private Timestamp modifiedDate;

    @Column(name = COLUMN_TEAM_MEMBERS_MODIFIED_BY, nullable = true)
    private String modifiedBy;
}
