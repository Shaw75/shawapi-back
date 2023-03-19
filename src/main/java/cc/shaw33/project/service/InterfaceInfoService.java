package cc.shaw33.project.service;

import cc.shaw33.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author shaw
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-02-16 20:33:36
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
