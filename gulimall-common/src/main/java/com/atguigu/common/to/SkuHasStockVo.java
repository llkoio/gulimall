package com.atguigu.common.to;

import lombok.Data;

/**
 * @ProjectName: gulimall
 * @package: com.atguigu.gulimall.ware.vo
 * @ClassName: SkuHasStockVo
 * @description: TODO
 * @author: Jianfeng Li
 * @CreateDateAndTime: 9/14/2020 10:26 AM
 * @version: v1.0
 */
@Data
public class SkuHasStockVo {
    private Long skuId;
    private boolean hasStock;
}
