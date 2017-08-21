package com.imi.goldcolthes.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imi.goldcolthes.util.PrintUtil;

/**
 * 
 */
@RestController
@RequestMapping("/table")
public class TransferTableRelationController extends PrintUtil {
	
	
	/**
	 * 跳转到权限管理列表界面
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void list(HttpServletRequest request, HttpServletResponse response) throws IOException {
		this.printJSON("{\"msg\":\"json格式数据输出！\"}", request, response);
	}
	
}
