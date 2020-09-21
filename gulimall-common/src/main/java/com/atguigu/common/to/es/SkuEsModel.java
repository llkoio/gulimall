package com.atguigu.common.to.es;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ProjectName: gulimall
 * @package: com.atguigu.common.to.es
 * @ClassName: SkuEsModel
 * @description: TODO
 * @author: Jianfeng Li
 * @CreateDateAndTime: 9/13/2020 10:36 AM
 * @version: v1.0
 */
@Data
@ToString
public class SkuEsModel {

    private Long skuId;

    private Long spuId;

    private String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    private Long saleCount;

    private Boolean hasStock;

    private Long hotScore;

    private Long brandId;

    private String  brandName;

    private String brandImg;

    private Long catalogId;

    private String catalogName;

    private List<Attrs> attrs;

    @Data
    public static class Attrs {

        private Long attrId;

        private String attrName;

        private String attrValue;

    }

}
