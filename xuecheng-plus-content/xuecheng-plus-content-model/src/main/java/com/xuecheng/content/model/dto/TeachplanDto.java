package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import lombok.Data;

import java.util.List;

@Data
public class TeachplanDto extends Teachplan {
    // 与媒资管理的信息
    private TeachplanMedia teachplanMedia;

    // 小章节
    private List<TeachplanMedia> teachPlanTreeNodes;
}
