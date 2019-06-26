package com.yuwei.volte.service;

import com.yuwei.volte.model.UpdateAppInfoDto;

/**
 * Created by Lenovo on 2018/9/13.
 */
public interface UpdateService {
    public UpdateAppInfoDto getUpdateInfo(String appname, String appVersion);
}
