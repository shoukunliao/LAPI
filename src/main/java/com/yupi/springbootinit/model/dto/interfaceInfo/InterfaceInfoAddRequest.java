package com.yupi.springbootinit.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 创建请求
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

    /**
     * 接口地址
     */
    @TableField("url")
    private String url;

    /**
     * 请求头
     */
    @TableField("requestHeader")
    private String requestHeader;

    /**
     * 响应头
     */
    @TableField("responseHeader")
    private String responseHeader;

    /**
     * 请求类型
     */
    @TableField("method")
    private String method;


}