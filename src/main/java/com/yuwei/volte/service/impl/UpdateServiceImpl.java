package com.yuwei.volte.service.impl;

import com.yuwei.volte.model.UpdateAppInfoDto;
import com.yuwei.volte.service.UpdateService;
import com.yuwei.volte.db.dao.AppInfoMapper;
import com.yuwei.volte.db.domain.AppInfo;
import com.yuwei.volte.db.domain.AppInfoExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Lenovo on 2018/9/13.
 */
@Service
public class UpdateServiceImpl implements UpdateService {

    @Autowired
    private AppInfoMapper appInfoMapper;
    @Override
    public UpdateAppInfoDto getUpdateInfo(String appname, String appVersion) {
        UpdateAppInfoDto info=new UpdateAppInfoDto();
        AppInfoExample example = new AppInfoExample();
        example.or().andAppnameEqualTo(appname).andServerversionGreaterThan(appVersion);
        List<AppInfo> list = appInfoMapper.selectByExample(example);
        if(list!=null && list.size()>0 && list.get(0).getRemark().equals("current version")){
            UpdateAppInfoDto.UpdateInfo data=new UpdateAppInfoDto.UpdateInfo();
            data.setAppname(list.get(0).getAppname());
            data.setServerVersion(list.get(0).getServerversion());
            data.setServerFlag(list.get(0).getServerflag());
            data.setLastForce(list.get(0).getLastforce());
            data.setUpdateurl(list.get(0).getUpdateurl());
            data.setUpgradeinfo(list.get(0).getUpgradeinfo());
            info.setData(data);
            info.setError_code(200);
            info.setError_msg("success");
        }else{
            info.setError_code(0);
            info.setError_msg("no update");
        }
        return info;
    }
}
