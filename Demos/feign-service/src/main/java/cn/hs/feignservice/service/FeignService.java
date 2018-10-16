package cn.hs.feignservice.service;

import cn.hs.pojo.EbookEntry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@FeignClient("provider-service")
public interface FeignService {
    @RequestMapping("getAll")
    public String getAll();
    @RequestMapping("selId")
    public String selId(@RequestParam("id") Integer id);

    @RequestMapping("del")
    public String del(@RequestParam("id") Integer id);

    @RequestMapping("add")
    public String add(@RequestBody EbookEntry book);
}
