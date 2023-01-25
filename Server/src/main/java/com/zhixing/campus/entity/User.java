package com.zhixing.campus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZC
 * @since 2023-01-25
 */
@Getter
@Setter
@TableName("user")
  @ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("用户id,递增主键")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户名，允许重复")
      private String username;

      @ApiModelProperty("用户密码，最好使用md5加密")
      private String password;

      @ApiModelProperty("头像url可以为空,为空默认头像")
      private String avatarUrl;

      @ApiModelProperty("性别，默认为保密")
      private String sex;

      @ApiModelProperty("手机号，可以为空")
      private String phone;


}
