package com.project.projectN.audit;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable {

    @CreatedDate
    @Column(name = "INSERT_DT")
    private LocalDateTime insertDt; // 등록일자

    @LastModifiedDate
    @Column(name = "INSERT_ID", length = 64)
    private String insertId; // 등록자(EMAIL)

    @Column(name = "UPDATE_DT")
    private LocalDateTime updateDt; // 수정일자

    @Column(name = "UPDATE_ID", length = 64)
    private String updateId; // 수정자(EMAIL)
}

