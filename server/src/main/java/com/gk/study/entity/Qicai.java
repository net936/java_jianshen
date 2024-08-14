package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
@TableName("b_qicai")
public class Qicai implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    public Long id;
    @TableField
    public String cover; // 图片
    @TableField(exist = false)
    public MultipartFile imageFile;
    @TableField
    public String title;
    @TableField
    public String description;
    @TableField
    public String status;

}