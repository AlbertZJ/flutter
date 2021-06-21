package org.sang.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.sang.bean.Article;
import org.sang.bean.Message;

/**
 * Created by albert on 2019/12/19.
 */
@Mapper
public interface MessageMapper {
    Message getByUid(Long uid);
    int add(Message message);
    int update(Long uid);

}
