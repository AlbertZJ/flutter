package org.sang.service;

import org.sang.bean.Category;
import org.sang.mapper.CategoryMapper;
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
public class CategoryService {

    @Autowired(required = false)
    CategoryMapper categoryMapper;

    public List<Category> getAllCategories() {
        return categoryMapper.getAllCategories();
    }

    public List<Category>  getAllCategoriesByUid() {
        Category category=new Category();
        category.setState(1l);
        category.setUid(Util.getCurrentUser().getId());
Long uid=Util.getCurrentUser().getId();
System.out.println(uid+"sadf");
        return categoryMapper. getAllCategoriesByUid(category);
    }
    public boolean deleteCategoryByIds(String ids) {
        String[] split = ids.split(",");
        int result = categoryMapper.deleteCategoryByIds(split);
        return result == split.length;
    }

    public int updateCategoryById(Category category) {
        return categoryMapper.updateCategoryById(category);
    }

    public int addCategory(Category category) {
        category.setState(1l);
        category.setUid(Util.getCurrentUser().getId());
        category.setDate(new Timestamp(System.currentTimeMillis()));
        return categoryMapper.addCategory(category);
    }
}
