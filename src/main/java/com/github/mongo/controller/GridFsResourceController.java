package com.github.mongo.controller;

import com.github.mongo.pojo.GridFsResourceDO;
import com.github.mongo.service.GridFsResourceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 上午10:54-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class GridFsResourceController {

    @Resource
    private GridFsResourceService service;

    @PostMapping("gridfs")
    public String save(@RequestBody GridFsResourceDO dto) {
        return service.save(dto.getName(), dto.getPath());
    }

}
