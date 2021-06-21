package org.sang.controller;

import org.sang.bean.Article;
import org.sang.bean.Message;
import org.sang.bean.RespBean;
import org.sang.service.ArticleService;
import org.sang.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by albert on 2020/1/2.
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public RespBean add(Message message) {
        int result = messageService.add(message);
        if (result == 1) {
            return new RespBean("success", message.getId() + "");
        } else {
            return new RespBean("error", message.getState() == 0 ? "主人寄语保存失败!" : "主人寄语发表失败!");
        }
    }
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Message getByUid() {
        return messageService.getByUid();
    }


//    @RequestMapping(value = "/dustbin", method = RequestMethod.PUT)
//    public RespBean update(Long[] aids, Integer state) {
//        if (messageService.update(aids, state) == aids.length) {
//            return new RespBean("success", "删除成功!");
//        }
//        return new RespBean("error", "删除失败!");
//    }

}
