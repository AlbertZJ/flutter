package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.bean.Category;

import java.util.List;

/**
 * Created by albert on 2019/12/19.
 */
@Mapper
public interface CategoryMapper {

    List<Category> getAllCategories();

    int deleteCategoryByIds(@Param("ids") String[] ids);

    int updateCategoryById(Category category);

    int addCategory(Category category);
    List<Category> getAllCategoriesByUid(Category category);
}
