package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description 课程基本信息管理业务接口
 */
public interface CourseBaseInfoService {

    /**
     * 课程分页查询
     * @param pageParams
     * @param queryCourseParamsDto
     */
    public PageResult<CourseBase>  queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程
     * @param companyId 机构Id
     * @param addCourseDto 课程信息
     * @return
     */
    public CourseBaseInfoDto createCourseBase(Long companyId,AddCourseDto addCourseDto);

    /**
     * id 获取特定课程信息
     * @param courseId
     * @return
     */
    public CourseBaseInfoDto getCourseBaseInfo(Long courseId);

    /**
     * 修改课程
     * @param companyId
     * @param editCourseDto
     * @return
     */
    public  CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto editCourseDto);
}
