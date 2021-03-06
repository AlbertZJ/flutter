package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.bean.Role;
import org.sang.bean.User;

import java.util.List;

/**
 * Created by albert on 2019/12/19.
 */
@Mapper
public interface UserMapper {

    User loadUserByUsername(@Param("username") String username);

    long reg(User user);

    int updateUserEmail(@Param("email") String email, @Param("id") Long id);

    List<User> getUserByNickname(@Param("nickname") String nickname);

    List<User> getUserAll(@Param("nickname") String nickname, @Param("uid") Long uid);

    List<Role> getAllRole();

    int updateUserEnabled(@Param("enabled") Boolean enabled, @Param("uid") Long uid);

    int deleteUserById(Long uid);

    int deleteUserByIds(Long uid);

    int deleteUserRolesByUid(Long id);

    int setUserRoles(@Param("rids") Long[] rids, @Param("id") Long id);

    User getUserById(@Param("id") Long id);

    int updateUserById(User user);

    int updatePwdById(User user);
}
