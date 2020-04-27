package com.shopping.bi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tbl_admin`")
public class AdminEntity {
    /**
     * 管理员id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 管理员帐号
     */
    @Column(name = "`account`")
    private String account;

    /**
     * 管理员名字
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 管理员手机
     */
    @Column(name = "`mobile`")
    private Long mobile;

    /**
     * 登录密码
     */
    @Column(name = "`loginpwd`")
    private String loginpwd;

    /**
     * 鉴权token
     */
    @Column(name = "`logintoken`")
    private String logintoken;

    /**
     * 角色id
     */
    @Column(name = "`roleid`")
    private Long roleid;

    /**
     * 登录ip
     */
    @Column(name = "`loginip`")
    private String loginip;

    /**
     * 最后登录时间
     */
    @Column(name = "`lastlogintime`")
    private Date lastlogintime;

    /**
     * 部门
     */
    @Column(name = "`dept`")
    private String dept;

    /**
     * 登录次数
     */
    @Column(name = "`loginnum`")
    private Integer loginnum;

    /**
     * 状态 0删除 1有效
     */
    @Column(name = "`state`")
    private Byte state;

    /**
     * 创建时间
     */
    @Column(name = "`createtime`")
    private Date createtime;

    /**
     * 修改时间
     */
    @Column(name = "`modifytime`")
    private Date modifytime;

    /**
     * 获取管理员id
     *
     * @return id - 管理员id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置管理员id
     *
     * @param id 管理员id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取管理员帐号
     *
     * @return account - 管理员帐号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置管理员帐号
     *
     * @param account 管理员帐号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取管理员名字
     *
     * @return name - 管理员名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置管理员名字
     *
     * @param name 管理员名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取管理员手机
     *
     * @return mobile - 管理员手机
     */
    public Long getMobile() {
        return mobile;
    }

    /**
     * 设置管理员手机
     *
     * @param mobile 管理员手机
     */
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取登录密码
     *
     * @return loginpwd - 登录密码
     */
    public String getLoginpwd() {
        return loginpwd;
    }

    /**
     * 设置登录密码
     *
     * @param loginpwd 登录密码
     */
    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    /**
     * 获取鉴权token
     *
     * @return logintoken - 鉴权token
     */
    public String getLogintoken() {
        return logintoken;
    }

    /**
     * 设置鉴权token
     *
     * @param logintoken 鉴权token
     */
    public void setLogintoken(String logintoken) {
        this.logintoken = logintoken;
    }

    /**
     * 获取角色id
     *
     * @return roleid - 角色id
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * 设置角色id
     *
     * @param roleid 角色id
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取登录ip
     *
     * @return loginip - 登录ip
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * 设置登录ip
     *
     * @param loginip 登录ip
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    /**
     * 获取最后登录时间
     *
     * @return lastlogintime - 最后登录时间
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastlogintime 最后登录时间
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * 获取部门
     *
     * @return dept - 部门
     */
    public String getDept() {
        return dept;
    }

    /**
     * 设置部门
     *
     * @param dept 部门
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * 获取登录次数
     *
     * @return loginnum - 登录次数
     */
    public Integer getLoginnum() {
        return loginnum;
    }

    /**
     * 设置登录次数
     *
     * @param loginnum 登录次数
     */
    public void setLoginnum(Integer loginnum) {
        this.loginnum = loginnum;
    }

    /**
     * 获取状态 0删除 1有效
     *
     * @return state - 状态 0删除 1有效
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态 0删除 1有效
     *
     * @param state 状态 0删除 1有效
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取修改时间
     *
     * @return modifytime - 修改时间
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * 设置修改时间
     *
     * @param modifytime 修改时间
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}