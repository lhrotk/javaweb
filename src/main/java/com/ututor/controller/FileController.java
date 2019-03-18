package com.ututor.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ututor.util.ImageUtil;

/**
 * File upload, File downloads;
 * @author lhrotk
 *
 */

@Controller
public class FileController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private ImageUtil imageUtils;
	
	@RequestMapping(path= {"/action/imagecode.action"}, method= {RequestMethod.GET})
	@ResponseBody
	public String getImageCode(HttpServletResponse response, HttpSession session) {
		logger.info("request image code");
		OutputStream os;
		Map<String, BufferedImage> map = imageUtils.createImage();
		String code = map.keySet().iterator().next();
		session.setAttribute("imagecode", code);
		BufferedImage image = map.get(code);
		response.setContentType("image/png");
		try {
			os = response.getOutputStream();
			ImageIO.write(image, "png", os);
			os.close();
		} catch (IOException e) {
		}
		
		return "true";		
	}

}
