package com.project.projectN.member.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_REG_TYPE_INFO")
public class RegTypeInfo {
    @Id
    @Column(name = "REG_TYPE_ID")
    private Integer regTypeId;

    @Column(name = "TYPE_NAME")
    private String typeName;
}