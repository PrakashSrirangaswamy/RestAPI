/**
 * 
 */
package com.custInfo;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.custInfo.object.UserInformation;

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
//		mm.addAttribute("displayName", mm.get("FName"));
//		return "CustInformation.jsp";
//	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getCustInformation(HttpServletRequest req, HttpServletResponse res) {
		
		UserInformation ui = new UserInformation(); 
		
		ui.setFirstName((String)req.getParameter("FName"));
		ui.setLastName((String)req.getParameter("LName"));
		ui.setEmailID((String)req.getParameter("eMail"));
		System.out.println(ui.toString());
		
		return "CustInformation.jsp";
	}

}
