package cn.hs.pojo;

public class EbookEntry {
    private Integer id;//编号
    private String categoryId;//分类编号
    private String title;//图书名称
    private String summary;//摘要
    private String uploadUser;//上传人
    private String createDate;//上传时间
    private EbookCategory ebook_category;

    public EbookCategory getEbook_category() {
        return ebook_category;
    }

    public void setEbook_category(EbookCategory ebook_category) {
        this.ebook_category = ebook_category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
