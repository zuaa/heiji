package cn.weeego.heiji;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 */
@RestController
@RequestMapping(value = "/hello")     // 通过这里配置使下面的映射都在/users下，可去除
public class HelloController {

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = {"/world"}, method = RequestMethod.GET)
    public String getUserList() {
        return "!asd";
    }


}