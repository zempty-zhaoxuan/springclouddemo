package com.zempty.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author zempty
 * @create 2019-06-14 11:05 AM
 **/
@Setter
@Getter
@Accessors(chain = true)
@Entity
public class Dept implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long depNo;
    private String name;
    private String db_name;
}
