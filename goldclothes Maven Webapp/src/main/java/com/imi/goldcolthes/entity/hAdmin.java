package com.imi.goldcolthes.entity;

import java.util.Date;

public class hAdmin {
    private Integer id;

    private String hUsername;

    private String hPassword;

    private String hNickname;

    private Integer hIspass;

    private Date hAddtime;

    private String hPermissions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gethUsername() {
        return hUsername;
    }

    public void sethUsername(String hUsername) {
        this.hUsername = hUsername == null ? null : hUsername.trim();
    }

    public String gethPassword() {
        return hPassword;
    }

    public void sethPassword(String hPassword) {
        this.hPassword = hPassword == null ? null : hPassword.trim();
    }

    public String gethNickname() {
        return hNickname;
    }

    public void sethNickname(String hNickname) {
        this.hNickname = hNickname == null ? null : hNickname.trim();
    }

    public Integer gethIspass() {
        return hIspass;
    }

    public void sethIspass(Integer hIspass) {
        this.hIspass = hIspass;
    }

    public Date gethAddtime() {
        return hAddtime;
    }

    public void sethAddtime(Date hAddtime) {
        this.hAddtime = hAddtime;
    }

    public String gethPermissions() {
        return hPermissions;
    }

    public void sethPermissions(String hPermissions) {
        this.hPermissions = hPermissions == null ? null : hPermissions.trim();
    }
}