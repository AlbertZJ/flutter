package org.sang.service;

import org.sang.bean.Article;
import org.sang.bean.Message;
import org.sang.mapper.MessageMapper;
import org.sang.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by albert on 2019/12/19.
 */
@Service
@Transactional
public class MessageService {
    @Autowired(required = false)
    MessageMapper messageMapper;

    public Message getByUid() {
        Message message = messageMapper.getByUid(Util.getCurrentUser().getId());
        return message;
    }

    public int add(Message message) {
       messageMapper.update(Util.getCurrentUser().getId());
        //处理寄语
        if (message.getSummary() == null || "".equals(message.getSummary())) {
            //直接截取
            String stripHtml = stripHtml(message.getHtmlContent());
            message.setSummary(stripHtml.substring(0, stripHtml.length() > 50 ? 50 : stripHtml.length()));
        }
            //添加操作
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            if (message.getState() == 1) {
                //设置发表日期
                message.setPublishDate(timestamp);
            }
            //设置当前用户
            message.setUid(Util.getCurrentUser().getId());
            int i = messageMapper.add(message);
            return i;

    }

    public String stripHtml(String content) {
        content = content.replaceAll("<p .*?>", "");
        content = content.replaceAll("<br\\s*/?>", "");
        content = content.replaceAll("\\<.*?>", "");
        return content;
    }

}
