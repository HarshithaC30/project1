package com.spring.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


/*public class HelloController extends AbstractController{

@Override protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception { 
  ModelAndView modelandview = new ModelAndView("Hellopage"); 
modelandview.addObject("welcomeMessage","Hi user,welcome to the first spring mvc applicatio");
return modelandview; 
}
}*/
 

  @Controller
  
//@RequestMapping("/greet") 
  public class HelloController {
  
  @RequestMapping("/welcome/{countryname}/{username}") 
	
	  public ModelAndView helloworld(@PathVariable("username")String name,@PathVariable("countryname")String country) {
	 
		/*
		 * public ModelAndView helloworld(@PathVariable Map<String,String> pathvars) {
		 * String name = pathvars.get("username"); 
		 * String country = pathvars.get("countryname");
		 */
	  ModelAndView model = new ModelAndView("HelloPage"); 
	  model.addObject("msg","Hello "+name+". You are from "+country);
	  return model; 
	  }
	/*
	 * @RequestMapping("/hi") public ModelAndView hiiworld() { ModelAndView model =
	 * new ModelAndView("HelloPage"); model.addObject("msg","hiiii world"); return
	 * model; }
	 */
  
  }
 