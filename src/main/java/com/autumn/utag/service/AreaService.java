package com.autumn.utag.service;


import com.autumn.utag.domain.Area;
import com.autumn.utag.util.Response;

public interface AreaService {
    /**
     * 保存
     * @param taskId
     * @param imageId
     * @param worker
     * @param lineJsonStr
     * @param tagStr
     * @return
     */
    Response<Boolean> saveArea(int taskId, String imageId, String worker, String lineJsonStr, String tagStr, boolean isFirst);


    /**
     * 删除
     * @param imageId
     * @param taskId
     * @param worker
     * @return
     */
    Response<Boolean> deleteArea(int taskId, String imageId, String worker);

    /**
     * 查找标记
     * @param taskId
     * @param imageId
     * @param worker
     * @return
     */
    Response<Area> getArea(int taskId, String imageId, String worker);

}
