package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 评论表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private int id;

    /**
     * 用户id
     */
    private int userId;

    /**
     * 实体类型
     */
    private int entityType;

    /**
     * 实体编号
     */
    private int entityId;

    /**
     * 评论目标用户id
     */
    private int targetId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 状态
     */
    private int status;

    /**
     * 创建时间
     */
    private Date createTime;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", entityType=" + entityType +
                ", entityId=" + entityId +
                ", targetId=" + targetId +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }

}
