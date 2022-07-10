package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    /**
     * 分页查询用户的评论
     * @param userId 用户id
     * @param offset 偏移值，从第几行开始查
     * @param limit  查询几条数据
     */
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset") int offset, @Param("limit") int limit);

    /**
     * 查询用户评论的数量
     */
    int selectDiscussPostRows(@Param("userId") int userId);


}
