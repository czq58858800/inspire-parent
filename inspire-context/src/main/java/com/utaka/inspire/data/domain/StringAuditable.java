/*
 * Copyright (c) 2018. utaka and/or its affiliates.
 */

package com.utaka.inspire.data.domain;

/**
 * @author LANXE
 */
public interface StringAuditable {

    /**
     * 默认的系统审核者
     */
    public static final String DEFAULT_AUDITOR = "system";

    /**
     * 审核业务
     *
     * @param auditor 审核者
     */
    void audit(String auditor);

}
