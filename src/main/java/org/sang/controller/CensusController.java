package org.sang.controller;

import org.sang.bean.Article;
import org.sang.bean.Category;
import org.sang.bean.Census;
import org.sang.service.CategoryService;
import org.sang.service.CensusService;
import org.sang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by albert on 2019/12/19.
 */
@RestController
@RequestMapping("/census")
public class CensusController {
    @Autowired
    CensusService censusService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Census> getAll() {
//        HashMap<String,Object> sus=new HashMap<String,Object>();
//        HashMap<String,Object> susd=new HashMap<String,Object>();
//        List<Census> news=censusService.getAll();
//        List<String> cateName=new ArrayList<String>();
//        List<String> title=new ArrayList<String>();
//        Iterator it=news.iterator();
//        Census ce=new Census();
//        while(it.hasNext()){
//        ce=(Census)it.next();
//            //cateName.add(ce.getCateName());
//            //title.add(ce.getTitle());
//            susd.put("name",ce.getTitle());
//
//        }
//
//        sus.put("children",cateName);
//        sus.put("title",susd);
//            //sus.put("name",news);
//            sus.put("like","喜欢");
        return censusService.getAll();
    }

}
