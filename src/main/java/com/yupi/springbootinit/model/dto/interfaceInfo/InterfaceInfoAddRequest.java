package com.yupi.springbootinit.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;


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

    private String name;

    /**
     * 描述
     */

    private String description;

    /**
     * 接口地址
     */

    private String url;

    /**
     * 请求参数
     */

    private String params;

    /**
     * 请求头
     */

    private String requestHeader;

    /**
     * 响应头
     */

    private String responseHeader;

    /**
     * 请求类型
     */

    private String method;


}