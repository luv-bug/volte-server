package com.yuwei.volte.controller;

import com.yuwei.volte.model.UpdateAppInfoDto;
import com.yuwei.volte.service.UpdateService;
import com.yuwei.volte.db.domain.AppInfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Lenovo on 2018/9/13.
 */
@RestController
@RequestMapping("/api/update")
public class UpdateController {
    private Log log = LogFactory.getLog(getClass());

    @Autowired
    private UpdateService appUpdateService;

    private String appName;

    @GetMapping("update")
    public UpdateAppInfoDto getUpdateInfo(String appname, String appVersion){
        UpdateAppInfoDto info = appUpdateService.getUpdateInfo(appname,appVersion);
        if(info.getData()!=null && !info.getData().getAppname().equals(""))
            appName = info.getData().getAppname();
        return info;
    }

    @GetMapping("appDownload")
    public void appFileDownLoad(HttpServletRequest req, HttpServletResponse res){
        String version = req.getParameter("version");
        BufferedInputStream bis = null;
        OutputStream os = null;
        try {
        	if(version==null) version = "";
        	String appname = "app-release-"+version+".apk";
        	File appfile = new File("/usr/local/volteserver/config/"+appname);
            if(appfile.exists()){
                res.setHeader("content-type", "application/x-www-form-urlencoded");
                //res.setContentType("application/octet-stream");
                res.setContentType("application/vnd.android.package-archive");
                res.setHeader("Content-Disposition", "attachment;filename=" + appname);
                byte[] buff = new byte[4096];
                res.setContentLength((int)appfile.length());
                os = res.getOutputStream();
                bis = new BufferedInputStream(new FileInputStream(appfile));
                int i = bis.read(buff);
                while (i != -1) {
                    os.write(buff, 0, buff.length);
                    os.flush();
                    i = bis.read(buff);
                }
            }
        } catch (IOException e) {
            log.error(e.toString(),e);
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    log.error(e.toString(),e);
                }
            }
        }
    }
}
