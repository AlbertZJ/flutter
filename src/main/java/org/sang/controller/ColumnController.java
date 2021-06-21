package org.sang.controller;

import org.sang.bean.Category;
import org.sang.bean.RespBean;
import org.sang.service.CategoryService;
import org.sang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by albert on 2019/12/19.
 */
@RestController
@RequestMapping("/column")
public class ColumnController {

    @Autowired(required = false)
    CategoryService categoryService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Category> getCategoriesByUid() {
        return categoryService.getAllCategoriesByUid();
    }


    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RespBean updateCate(Category category) {
        int i = categoryService.updateCategoryById(category);
        if (i == 1) {
            return new RespBean("success", "修改成功!");
        }
        return new RespBean("error", "修改失败!");
    }
}
