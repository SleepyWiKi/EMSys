package org.wiki.common.core.page;

import lombok.Data;
import org.springframework.util.StringUtils;

/**
 * @Packagename: org.wiki.common.core.page
 * @Classname: PageDomain
 * @Description: 通用页面实体
 * @Author: WiKi
 * @Date: 23/06/19 4:14 PM
 */
@Data
public class PageDomain {
    
    /** 当前记录起始索引 */
    private Integer pageNum;
    /** 每页显示记录数 */
    private Integer pageSize;
    /** 排序列 */
    private String orderByColumn;
    /** 排序的方向 "desc" 或者 "asc". */
    private String isAsc;
    
//    public String getOrderBy() {
//        if (StringUtils.isEmpty(orderByColumn)) {
//            return "";
//        }
//        return StringUtils.toUnderScoreCase(orderByColumn) + " " + isAsc;
//    }


}
