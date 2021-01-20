package com.example.springSecurity.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ct_user {
    @Id
    private Integer userid;
    private String username,userpass,userfullname,
            usertype,userextensionsecondaryextension,webadminrole,usergroupid,userstatus,domainid;

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

    public String getUserfullname() {
        return userfullname;
    }

    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUserextensionsecondaryextension() {
        return userextensionsecondaryextension;
    }

    public void setUserextensionsecondaryextension(String userextensionsecondaryextension) {
        this.userextensionsecondaryextension = userextensionsecondaryextension;
    }

    public String getWebadminrole() {
        return webadminrole;
    }

    public void setWebadminrole(String webadminrole) {
        this.webadminrole = webadminrole;
    }

    public String getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(String usergroupid) {
        this.usergroupid = usergroupid;
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }
}
