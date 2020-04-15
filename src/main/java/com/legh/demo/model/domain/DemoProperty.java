package com.legh.demo.model.domain;

import com.legh.demo.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "demo_property")
public class DemoProperty extends BaseEntity {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "property_id")
    private String propertyId;

    /**
     * 属性代号
     */
    @Column(name = "property_code")
    private String propertyCode;

    /**
     * 属性名称
     */
    @Column(name = "property_name")
    private String propertyName;

    /**
     * 排序号
     */
    @Column(name = "order_index")
    private Integer orderIndex;

    private static final long serialVersionUID = -2932557370381704272L;
}