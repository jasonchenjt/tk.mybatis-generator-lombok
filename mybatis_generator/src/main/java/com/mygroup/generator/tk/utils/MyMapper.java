package com.mygroup.generator.tk.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @创建人 Jason.Chen
 * @创建时间 2020/02/06
 * @描述
 *  自己的 Mapper
 *  特别注意，该接口不能被扫描到，否则会出错
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}