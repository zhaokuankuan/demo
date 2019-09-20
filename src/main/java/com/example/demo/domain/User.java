package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户表
 * Created  by Mr.kk
 * DateTime on 2019-09-20 11:19:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 登录名称
     */
    private String loginName;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 联系电话
     */
    private String contcatPhone;

    /**
     * 证件类型
     */
    private int idType;

    /**
     * 证件号码
     */
    private String idNumber;

    /**
     * 证件照片反面url
     */
    private String idNumberPhotoBackUrl;

    /**
     * 证件照片正面url
     */
    private String idNumberPhotoUrl;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 出生地
     */
    private String birthplace;

    /**
     * 家庭住址
     */
    private String home;

    /**
     * 公司
     */
    private String company;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 上次登录时间
     */
    private String lastLoginTime;

    /**
     * 仓库id
     */
    private int deviceStorehouseId;

    /**
     * 安装点id
     */
    private int installSiteId;

    /**
     * 运营商id
     */
    private int iotTypeId;

    /**
     * 运营公司id
     */
    private int operatorId;

    /**
     * 归属地id
     */
    private int residentId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 用户状态默认 0:启用
     */
    private int status;

    /**
     * 系统id  0 公车 4生产检测平台 5地磁 6电动车 7消防栓 8七彩卡 9第三方
     */
    private String systemId;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 备用字段
     */
    private String extend1;


}