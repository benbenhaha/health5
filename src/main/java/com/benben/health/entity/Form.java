package com.benben.health.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author zeny
 * @since 2020-03-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("health_form")
public class Form implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @TableField("employId")
    private Integer employId;

    private String name;

    private String resource;

    private String resource2;

    @TableField("Department")
    private String department;

    private String status;

    private String traffic;

    private String dayhealth;

    private String hospital;

    private String area;

    private String dayfrom;

    private String daygoto;

    private String standup;

    private String dayarea;

    @TableField("gotoGZ")
    private String gotoGZ;

    private String traffictogz;

    @TableField("gotoCompany")
    private String gotoCompany;

    @TableField("checkList2")
    private String checkList2;

    @TableField("famHealthOther")
    private String famHealthOther;

    @TableField("otherstatus")
    private String otherstatus;

    private String radio;

    @TableField("checkList")
    private String checkList;

    @TableField("messageDay")
    private String messageDay;

    private String img;

    private String hostime;

    private String hosstatus;


}
