package com.candy.service.impl;

import com.candy.entity.Blog;
import com.candy.mapper.BlogMapper;
import com.candy.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sixcandy
 * @since 2022-05-27
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
