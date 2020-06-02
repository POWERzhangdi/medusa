package com.medusa.order.server.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "medusa_user")
public class MedusaUser implements Serializable {

    private static final long serialVersionUID = -2329278452797654810L;

    @Id
    private Long id;

    private String name;

    private String url;

    private LocalDateTime addTime;

    private LocalDateTime updateTime;

    private Byte isDeleted;


}
