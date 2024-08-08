package SmartLicense.smartlicense.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /*******************
     * 날짜 : 2024.07.10
     * 이름 : 김준식
     * 내용 : CORS 허용
     * *****************/
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://web-smartlicense-1272llwyzbyro.sel5.cloudtype.app/")
                .allowedMethods("GET", "POST")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
