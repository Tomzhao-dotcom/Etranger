package com.etranger.web.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name = "etrangerdatasource")
public class EtrangerDataSourceEntity {
    private String code;
    private String name;
    private String dbtype;
    private String ip;
    private String dbname;
    private String username;
    private String password;
    private String id;

    @Basic
    @Column(name = "code", nullable = false, length = 100)
    @NotEmpty(message = "编号不能为空")
    @Length(min = 1,max = 100,message = "编号长度在1到100个字符之间")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    @NotEmpty(message = "名称不能为空")
    @Length(min = 2,max = 255,message = "名称长度在2到255个字符之间")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "dbtype", nullable = false, length = 36)
    public String getDbtype() {
        return dbtype;
    }

    public void setDbtype(String dbtype) {
        this.dbtype = dbtype;
    }

    @Basic
    @Column(name = "ip", nullable = false, length = 255)
    @NotEmpty(message = "IP地址不能为空")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "dbname", nullable = false, length = 255)
    @NotEmpty(message = "数据库名称不能为空")
    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 255)
    @NotEmpty(message = "用户名不能为空")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    @NotEmpty(message = "密码不能为空")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @Column(name = "id", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtrangerDataSourceEntity that = (EtrangerDataSourceEntity) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(dbtype, that.dbtype) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(dbname, that.dbname) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, dbtype, ip, dbname, username, password, id);
    }
}
