package com.github.mongo.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>
 * 创建时间为 上午10:01-2019/1/29
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
@Document(collection = "DotDoRepository")
public class DotDO {

    private String ip;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
