package com.yuwei.volte.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.yuwei.volte.model.CallDetailDto;
import com.yuwei.volte.model.CallMeasureDto;
import com.yuwei.volte.service.CallDetailService;
import com.yuwei.volte.service.CallService;
import com.yuwei.volte.service.request.CallDetailRequest;
import com.yuwei.volte.service.request.CallMeasureRequest;
import com.yuwei.volte.service.result.CallDetailResult;
import com.yuwei.volte.service.result.CallMeasureResult;
	@RestController
	@RequestMapping("/api/calldetail")
	public class CallDetailController {
//		public static final String rootPath = "F:/record/";
		public static final String rootPath = "/usr/local/volte-server/record/";
	    @Autowired
	    private CallDetailService callDetailService;

	    
	    @PostMapping("addCallDetail")
	    public CallDetailDto addCallDetail(@RequestParam("json") String callDetailStrs, @RequestParam("recordFile") MultipartFile file){
	    	if(callDetailStrs!=null) {
	    		CallDetailDto one = JSON.parseObject(callDetailStrs, CallDetailDto.class); //将Json格式转换成数组/对象
	            if(!file.isEmpty()){
		    		try {
		    			String cpdnrecordpath = rootPath+one.getCpn()+"_"+one.getCpdn()+"_"+file.getOriginalFilename();
		    			File f = new File(cpdnrecordpath);
		    			if(!f.getParentFile().exists()) {
		    				f.getParentFile().mkdirs();
		    			}
		                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f));
		                out.write(file.getBytes());
		                out.flush();
		                out.close();
		                Random r = new Random();
						int p = r.nextInt(6);
		                one.setRecordpath(cpdnrecordpath);
		                one.setTestresult(String.valueOf(p));
		            }catch(FileNotFoundException e) {
		                e.printStackTrace();
		            }catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
	            int result = callDetailService.addCallDetail(one);
	            if(result>0) return one;
	        }
	        return null;
	    }

	    @PostMapping("queryPage")
	    public CallDetailResult queryPage(@RequestBody String request){
	        if(request!=null) {
	            CallDetailRequest callMeasureRequest = JSON.parseObject(request,CallDetailRequest.class);
	            return callDetailService.queryPage(callMeasureRequest);
	        }
	        return null;
	    }
	}

