package com.jdbctest.jdbc.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: jdbc
 * @description: 成员实体类
 * @author: Mr.Huang
 * @create: 2020-04-30 15:02
 **/
@Entity
@Table(name="member")
@Data
public class Member {
    @Id private Integer id;
    @Column(name = "uname") private String name;
    private String addr;
    private Integer age;
}
