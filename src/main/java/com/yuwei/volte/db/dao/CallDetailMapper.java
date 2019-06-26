package com.yuwei.volte.db.dao;

import com.yuwei.volte.db.domain.CallDetail;
import com.yuwei.volte.db.domain.CallDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    long countByExample(CallDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    int deleteByExample(CallDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    int insert(CallDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    int insertSelective(CallDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    List<CallDetail> selectByExample(CallDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<CallDetail> selectByExampleSelective(@Param("example") CallDetailExample example, @Param("selective") CallDetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    CallDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CallDetail selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CallDetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") CallDetail record, @Param("example") CallDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    int updateByExample(@Param("record") CallDetail record, @Param("example") CallDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    int updateByPrimaryKeySelective(CallDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated Thu Jun 06 17:24:06 CST 2019
     */
    int updateByPrimaryKey(CallDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CallDetail selectOneByExample(CallDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CallDetail selectOneByExampleSelective(@Param("example") CallDetailExample example, @Param("selective") CallDetail.Column ... selective);
}