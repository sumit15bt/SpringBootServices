package com.demoAPI.demoAPI.modals;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ct_user {

    @Id
    private Integer userid;

    private String username;
    private String userpass;
    private String usertype;
    private Integer domainid;

    public ct_user() {
    }

    public ct_user(Integer userid, String username, String userpass, String usertype, Integer domainid) {
        this.userid = userid;
        this.username = username;
        this.userpass = userpass;
        this.usertype = usertype;
        this.domainid = domainid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public Integer getDomainid() {
        return domainid;
    }

    public void setDomainid(Integer domainid) {
        this.domainid = domainid;
    }

    @Override
    public String toString() {
        return "ct_user{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", usertype='" + usertype + '\'' +
                ", domainid=" + domainid +
                '}';
    }
}
