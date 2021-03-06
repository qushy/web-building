package com.github.emailtohl.building.common;
/**
 * 常量定义
 * @author HeLei
 * @date 2017.02.04
 */
public interface Constant {
	/**
	 * 邮箱的正则匹配式
	 */
	String PATTERN_EMAIL = "^[a-z0-9`!#$%^&*'{}?/+=|_~-]+(\\.[a-z0-9`!#$%^&*'{}?/+=" +
			"|_~-]+)*@([a-z0-9]([a-z0-9-]*[a-z0-9])?)+(\\.[a-z0-9]" +
			"([a-z0-9-]*[a-z0-9])?)*$";
	/**
	 * YYYY-MM-DD的正则表达式
	 */
	String PATTERN_DATE = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";

	/**
	 * 匹配Windows和Unix风格的路径分隔符
	 */
	String PATTERN_SEPARATOR = "[\\\\/]";
}
