/**
 * 
 */
package com.custInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author prakashsrirangaswamy
 *
 */
@Controller
@RequestMapping("/CustInformation")
public class CustInformation {
	@Autowired
	public CustInformation() {

	}

//	@RequestMapping(method = RequestMethod.GET)
//	public String getCustInformation(ModelMap mm) {
//		mm.addAttribute("message", "Prakash Spring MVC Framework!");
//		return "CustInformation.jsp";
//	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getCustInformation(HttpServletRequest req, HttpServletResponse res) {
		
		String fName = (String)req.getAttribute("FName");
		System.out.println("first name from form " + fName);
		
		return "CustInformation.jsp";
	}

}
