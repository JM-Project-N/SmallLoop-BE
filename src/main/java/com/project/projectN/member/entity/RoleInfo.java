package com.project.projectN.member.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_ROLE_INFO")
public class RoleInfo {
    @Id
    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Lob
    @Column(name = "DESCRIPTION")
    private byte[] description;

    @Column(name = "ACCESS_LEVEL")
    private Integer accessLevel;
}