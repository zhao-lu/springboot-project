package cn.hs.feignservice.controller;

import cn.hs.feignservice.service.FeignService;
import cn.hs.pojo.EbookEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {
    @Autowired
    private FeignService feignService;

    @ResponseBody
    @RequestMapping("getAll")
    public String getAll(){
        return feignService.getAll();
    }
    @RequestMapping("show")
    public String show(){
        return "show";
    }

    @RequestMapping("addInfo")
    public String addInfo(){
        return "add";
    }

    @ResponseBody
    @RequestMapping("selId")
    public String selId(Integer id){
        return feignService.selId(id);
    }
    @ResponseBody
    @RequestMapping("del")
    public String del(Integer id){
        return feignService.del(id);
    }

    @ResponseBody
    @RequestMapping("add")
    public String add(EbookEntry book){
        return feignService.add(book);
    }
}
