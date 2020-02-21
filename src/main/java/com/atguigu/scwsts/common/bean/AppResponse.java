package com.atguigu.scwsts.common.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppResponse<T> implements Serializable{
	private String code;
	private String message;
	private T data;

	public static <T> AppResponse<T> ok(T data) {

		return new AppResponse<T>("00000", "success", data);
	}

	public static <T> AppResponse<T> fail(String code, String msg) {

		return new AppResponse<T>(code, msg, null);
	}
}
