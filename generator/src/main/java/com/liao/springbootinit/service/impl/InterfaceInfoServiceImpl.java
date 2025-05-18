package com.liao.springbootinit.service.impl;

import com.liao.springbootinit.entity.InterfaceInfo;
import com.liao.springbootinit.mapper.InterfaceInfoMapper;
import com.liao.springbootinit.service.IInterfaceInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liao
 * @since 2025-05-18
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements IInterfaceInfoService {

}
