package com.theo.Util;

import com.theo.enums.YesOrNo;

import javax.xml.crypto.Data;

public class Model {

    private Long id;

    private Data createDate;

    private YesOrNo isDeleted;

    private Data deletedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Data createDate) {
        this.createDate = createDate;
    }

    public YesOrNo getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(YesOrNo isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Data getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Data deletedDate) {
        this.deletedDate = deletedDate;
    }
}
