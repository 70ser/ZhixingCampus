package com.zhixing.campus.service.impl;

import com.zhixing.campus.entity.User;
import com.zhixing.campus.mapper.UserMapper;
import com.zhixing.campus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZC
 * @since 2023-01-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
