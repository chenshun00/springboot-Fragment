package top.huzhurong.boot.feature.view;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@RestController
public class ViewController {

    @RequestMapping("err")
    @ResponseBody
    public Object ok() {
        throw new NullPointerException("");
    }

    @RequestMapping("tt")
    @ResponseBody
    public Object tt(HttpServletRequest request) {
        ServletContext servletContext = request.getServletContext();
        System.out.println("===" + servletContext.getInitParameter("nihao") + "===");
        return "1";
    }


}
