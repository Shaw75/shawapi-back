package cc.shaw33.project.service.impl;

import cc.shaw33.model.entity.InterfaceInfo;
import cc.shaw33.project.common.ErrorCode;
import cc.shaw33.project.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.shaw33.project.mapper.InterfaceInfoMapper;
import cc.shaw33.project.service.InterfaceInfoService;
import org.springframework.stereotype.Service;

/**
* @author Shaw
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-02-16 20:33:36
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }

}



