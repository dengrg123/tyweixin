package gen.framework.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{
	

	@Autowired
	//private LogInterceptor logInterceptor;
	public void addInterceptors(InterceptorRegistry registry) {
		//System.out.println(	123);
		//registry.addInterceptor(logInterceptor);
		
	}
}
