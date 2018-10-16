package cn.hs.providerservice.dao;

import cn.hs.pojo.EbookCategory;
import cn.hs.pojo.EbookEntry;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    /**
     * 查询全部图书信息
     * @return
     */
    public List<EbookCategory> getAll();

    /**
     * 根据ID查询
     * @return
     */
    public EbookEntry selId(@Param("id") Integer id);
    /**
     * 删除
     * @return
     */
    public Integer del(@Param("id") Integer id);
    /**
     * 添加
     * @return
     */
    public Integer add(EbookEntry  book);
    /**
     * 修改
     * @return
     */
    public Integer upd(EbookEntry  book);
}
