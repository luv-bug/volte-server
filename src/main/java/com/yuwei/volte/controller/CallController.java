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
import com.yuwei.volte.model.CallMeasureDto;
import com.yuwei.volte.service.CallService;
import com.yuwei.volte.service.request.CallMeasureRequest;
import com.yuwei.volte.service.result.CallMeasureResult;
	@RestController
	@RequestMapping("/api/call")
	public class CallController {
//		public static final String rootPath = "F:/record/";
		public static final String rootPath = "/usr/local/volte-server/record/";
	    @Autowired
	    private CallService callService;

	    @PostMapping("addCallMeasureList")
	    public int addCallMeasureList(@RequestBody String callMeasureStrs){
	        if(callMeasureStrs!=null) {
	            List<CallMeasureDto> list = JSON.parseArray(callMeasureStrs, CallMeasureDto.class); //将Json格式转换成数组/对象
	            return callService.addCallMeasureList(list);
	        }
	        return 0;
	    }

	    @PostMapping("addCpdnCallMeasure")
	    public CallMeasureDto addCpdnCallMeasureList(@RequestBody String callMeasureStrs){
	    	if(callMeasureStrs!=null) {
	    		CallMeasureDto one = JSON.parseObject(callMeasureStrs, CallMeasureDto.class); //将Json格式转换成数组/对象
	            
	            int result = callService.addCpdnCallMeasureList(one);
	            if(result>0) return one;
	        }
	        return null;
	    }

	    @PostMapping("queryPage")
	    public CallMeasureResult queryPage(@RequestBody String request){
	        if(request!=null) {
	            CallMeasureRequest callMeasureRequest = JSON.parseObject(request,CallMeasureRequest.class);
	            return callService.queryPage(callMeasureRequest);
	        }
	        return null;
	    }
	}

