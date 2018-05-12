package com.autumn.utag.service;

import com.autumn.utag.domain.TagPart;
import com.autumn.utag.util.Response;


import java.io.IOException;
import java.util.List;

public interface TagPartService {

    /**
     *
     * @param imageId
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     * @param description
     * @return
     * @throws IOException
     */
    public Response<Boolean> saveTagPart(String imageId, double x1, double x2, double y1, double y2,
                                         String description, String worker, boolean isFirst);


    /**
     *
     * @param imageID
     * @return
     */
    public Response<List<TagPart>> showTagPart(String imageID, String worker);


    /**
     *
     * @param imageID
     * @return
     */
    public Response<Boolean> deleteTagPart(String imageID, String worker);



    /**
     * 得到对应描述的字符串长度
     * @param imageID
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     * @return
     *
     */
    public Response<Integer> getDescriptionLength(String imageID, double x1, double x2, double y1,
                                                  double y2, String worker);

    /**
     * 给出标注结果
     * @param imageId
     * @return
     */
    public Response<List<TagPart>> listPartTag(String imageId, String worker);
}
