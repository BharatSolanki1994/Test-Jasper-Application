package com.hibernate.map.controller;

import java.util.ArrayList;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.map.entity.UserEntity;
import com.hibernate.map.service.GenerateJasper;

@RestController
@RequestMapping("/jasper/download")
public class JasperController {

	@PostMapping("/salary-report")
	public void generateJasperReport(HttpServletRequest req,HttpServletResponse res) throws Exception {
		UserEntity entity = new UserEntity("U1201", "Bharat", "Solanki", "bharats@rbi.edu.in", "9173488592",
				"TatvaSoft House, Near Shivalik Business Center Sarkhej - Gandhinagar Highway", "Rajpath Rangoli Rd, Ahmedabad", "Gujarat", "India", "70000", "61000", "2");
		entity.setHeader(req.getRealPath("\\")+"/resources/tatvalogo.png");
		GenerateJasper generateJasper = new GenerateJasper();
		ArrayList<UserEntity> usetrList = new ArrayList<UserEntity>();
		usetrList.add(entity);
		String jasperName = "water_management_jasper";
		byte[] pdfFile = generateJasper.generatePDF(req, jasperName, usetrList);
		res.setContentType("application/pdf");
		res.setHeader("Content-Disposition", "attachment;filename=\"" + jasperName + ".pdf\"");
		res.setContentLength(pdfFile.length);
		ServletOutputStream out = res.getOutputStream();
		out.write(pdfFile);
		out.flush();
		out.close();
	}
}
