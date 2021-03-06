package com.miaosha.demo.dao;

import com.miaosha.demo.domain.Gongshui;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GongshuiDao {
    @Insert("INSERT INTO gongshui(`id`, `date`, `location`, `type`, `grade`, `picture`,`note`, `reporting_unit`) VALUES " +
            "(#{disaster.id},#{disaster.date},#{disaster.location},#{disaster.type}," +
            "#{disaster.grade},#{disaster.picture},#{disaster.note},#{disaster.reporting_unit})")
    void Insert(@Param("disaster") Gongshui disaster);

    @Select("select * from gongshui ORDER BY `key` ASC")
    List<Gongshui> selectAll();

    @Select("select * from gongshui where type = #{type}")
    List<Gongshui> selectByType(@Param("type") String type);

    @Select("select * from gongshui where reporting_unit = #{reporting_unit}")
    List<Gongshui> selectByUnit(@Param("reporting_unit") String reporting_unit);
    
    @Select("select * from gongshui where `key` = #{key}")
    List<Gongshui> selectByKey(@Param("key") String key);
    
    @Insert({
     "<script>",
     "INSERT INTO gongshui(`id`, `date`, `location`, `type`, `grade`, `picture`,`note`, `reporting_unit`) VALUES",
     "<foreach collection='list' item='item' index='index' separator=','>",
     "(#{item.id}, #{item.date}, #{item.location}, #{item.type}, #{item.grade}, #{item.picture}, #{item.note},#{item.reporting_unit})",
     "</foreach>",
     "</script>"
    })
    boolean insertForeach(@Param(value = "list") List<Gongshui> list);
    
    @Insert({
        "<script>",
        "INSERT INTO gongshui_b(`id`, `date`, `location`, `type`, `grade`, `picture`,`note`, `reporting_unit`) VALUES",
        "<foreach collection='list' item='item' index='index' separator=','>",
        "(#{item.id}, #{item.date}, #{item.location}, #{item.type}, #{item.grade}, #{item.picture}, #{item.note},#{item.reporting_unit})",
        "</foreach>",
        "</script>"
       })
    boolean beifen(@Param(value = "list") List<Gongshui> list);
    
    @Delete("delete from gongshui where `key` = #{key}")
    void deleteByKey(@Param("key") String key);
    
    @Delete("delete from gongshui")
    void deleteAll();
    
    @Update("update gongshui SET id=#{disaster.id},date=#{disaster.date},location=#{disaster.location},type=#{disaster.type},grade=#{disaster.grade},"
    		+ "picture=#{disaster.picture},note=#{disaster.note},reporting_unit=#{disaster.reporting_unit} where `key` = #{disaster.key} ")
    void updateByKey(@Param("disaster") Gongshui disaster);
}
