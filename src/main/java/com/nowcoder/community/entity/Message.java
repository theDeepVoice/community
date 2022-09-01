package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private int id;

    /**
     * 发送消息用户id
     */
    private int fromId;

    /**
     * 接收消息用户id
     */
    private int toId;

    /**
     * 对话id： 110_112
     */
    private String conversationId;

    /**
     * 对话内容
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
        return "Message{" +
                "id=" + id +
                ", fromId=" + fromId +
                ", toId=" + toId +
                ", conversationId='" + conversationId + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}
