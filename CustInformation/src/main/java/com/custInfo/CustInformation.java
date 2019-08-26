/**
 * 
 */
package com.custInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.custInfo.object.UserInformation;

/**
 * @author Prakash Srirangaswamy
 *
 */
@Controller
@RequestMapping("/CustInformation")
public class CustInformation {

	@Autowired
	public CustInformation() {

	}

	@RequestMapping(method = RequestMethod.GET)
	public String getCustInformation(HttpServletRequest req, HttpServletResponse res) {

		UserInformation ui = new UserInformation();

		ui.setFirstName((String) req.getParameter("FName"));
		ui.setLastName((String) req.getParameter("LName"));
		ui.setEmailID((String) req.getParameter("eMail"));
		System.out.println(ui.toString());
		
		return "index.jsp"; 
	}
	
	
	@RequestMapping(value = "/CustInfoPage", method = RequestMethod.GET)
	public String getCustInfoPage() {
		
		return "CustInformation.jsp";
	}
	
	
	@RequestMapping(value="/CustnformationCSS.css")
	public String getCSSFile()
	{
		return "CustnformationCSS.css"; 
	}

}
