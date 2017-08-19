package com.gamecenter.alipay.domain;

import com.gamecenter.alipay.AlipayObject;
import com.gamecenter.alipay.internal.mapping.ApiField;

/**
 * 车险图像定损请求中的图像信息
 *
 * @author auto create
 * @since 1.0, 2017-03-16 09:53:40
 */
public class AlipayInsDataAutodamageRequestImageInfo extends AlipayObject {

	private static final long serialVersionUID = 5387299276917251498L;

	/**
	 * 图像文件名称
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 图像文件在存储上的路径
	 */
	@ApiField("image_path")
	private String imagePath;

	public String getImageName() {
		return this.imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImagePath() {
		return this.imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
