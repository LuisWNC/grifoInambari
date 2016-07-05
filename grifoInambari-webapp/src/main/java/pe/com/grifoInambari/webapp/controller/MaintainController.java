package pe.com.grifoInambari.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MaintainController {

	@RequestMapping(value = "maintain/customer", method = RequestMethod.GET)
	public String customer(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "customer");
		return "maintain/customer";
	}

	@RequestMapping(value = "maintain/enterprice", method = RequestMethod.GET)
	public String enterprice(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "enterprice");
		return "maintain/enterprice";
	}

	@RequestMapping(value = "maintain/product", method = RequestMethod.GET)
	public String product(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "product");
		return "maintain/product";
	}

	@RequestMapping(value = "maintain/user", method = RequestMethod.GET)
	public String user(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "user");
		return "maintain/user";
	}
	
	
	@RequestMapping(value = "maintain/grifo", method = RequestMethod.GET)
	public String grifo(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "grifo");
		return "maintain/grifo";
	}
	
	@RequestMapping(value = "maintain/person", method = RequestMethod.GET)
	public String person(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "person");
		return "maintain/person";
	}
	
	
	@RequestMapping(value = "maintain/accessRole", method = RequestMethod.GET)
	public String accessRole(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "accessRole");
		return "maintain/accessRole";
	}
	
	@RequestMapping(value = "maintain/role", method = RequestMethod.GET)
	public String role(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "role");
		return "maintain/role";
	}

	@RequestMapping(value = "maintain/repository", method = RequestMethod.GET)
	public String repository(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "repository");
		return "maintain/repository";
	}
	
	@RequestMapping(value = "maintain/price", method = RequestMethod.GET)
	public String price(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "price");
		return "maintain/price";
	}
	
	@RequestMapping(value = "maintain/descriptionVenta", method = RequestMethod.GET)
	public String descriptionVenta(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "descriptionVenta");
		return "maintain/descriptionVenta";
	}
	
	@RequestMapping(value = "maintain/voucher", method = RequestMethod.GET)
	public String voucher(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "voucher");
		return "maintain/voucher";
	}
	
	
	

	
	

}
