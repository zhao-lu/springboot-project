package cn.hs.providerservice.controller;

import cn.hs.pojo.EbookEntry;
import cn.hs.providerservice.service.BookService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping("getAll")
    public String getAll(){
        return JSON.toJSONString(bookService.getAll());
    }
    /**
     * 根据ID查询
     * @return
     */
    @RequestMapping("selId")
    public String selId(Integer id){
        return JSON.toJSONString(bookService.selId(id));
    }
    /**
     * 删除
     * @return
     */
    @RequestMapping("del")
    public String del(Integer id){
        return JSON.toJSONString(bookService.del(id));
    }
    /**
     * 添加
     * @return
     */
    @RequestMapping("add")
    public String add(@RequestBody EbookEntry book){
        return JSON.toJSONString(bookService.add(book));
    }
}

