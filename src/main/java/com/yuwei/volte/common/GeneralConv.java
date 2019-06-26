
package com.yuwei.volte.common;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;

import java.util.List;

/**
 * Bean通用转换类
 *
 * @author: Levon
 * @version: v 0.1 2017-05-05 17:53
 */
public class GeneralConv {

    /**
     * 对象转换
     *
     * @param source
     * @param destinationClass
     * @param <T>
     * @return
     */
    public static <T> T conv(Object source, Class<T> destinationClass) {
        DozerBeanMapper dozerMapper = new DozerBeanMapper();
        T convObj = dozerMapper.map(source, destinationClass);
        return convObj;
    }

    /**
     * 集合转换
     *
     * @param sourceList
     * @param destinationClass
     * @param <T>
     * @return
     */
    public static <T> List<T> convert2List(List<?> sourceList, Class<T> destinationClass) {
        List<T> destinationList = Lists.newArrayList();
        if (sourceList == null) {
            return destinationList;
        }
        sourceList.forEach(source -> {
            T convObj = GeneralConv.conv(source, destinationClass);
            destinationList.add(convObj);
        });
        return destinationList;
    }
}
