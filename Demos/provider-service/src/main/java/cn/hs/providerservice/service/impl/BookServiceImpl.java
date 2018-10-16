package cn.hs.providerservice.service.impl;

import cn.hs.pojo.EbookCategory;
import cn.hs.pojo.EbookEntry;
import cn.hs.providerservice.dao.BookDao;
import cn.hs.providerservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public List<EbookCategory> getAll() {
        return bookDao.getAll();
    }

    @Override
    public EbookEntry selId(Integer id) {
        return bookDao.selId(id);
    }

    @Override
    public Integer del(Integer id) {
        return bookDao.del(id);
    }

    @Override
    public Integer add(EbookEntry book) {
        return bookDao.add(book);
    }

    @Override
    public Integer upd(EbookEntry book) {
        return bookDao.upd(book);
    }
}
