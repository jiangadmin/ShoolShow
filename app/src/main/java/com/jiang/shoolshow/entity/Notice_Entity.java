package com.jiang.shoolshow.entity;

import java.util.List;

/**
 * @author: jiangyao
 * @date: 2018/8/16
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO:
 */
public class Notice_Entity extends Base_Entity {

    /**
     * errorcode : 1000
     * result : [{"content":"","createAuthor":"nyadmin","createTime":"2018-08-18 00:00:00","id":4,"imagelist":"http://www.njupt.edu.cn/_upload/article/images/8b/22/824b306046969bcbe1754bc554ef/93ef5e06-0cea-4fb6-a242-10e340646212.jpg","isDelete":0,"linkUrl":"http://47.104.81.170:8080/teach_app_api/omp/notice_detail.html?noticeId=4","noticeType":2,"status":1,"title":"南邮大门","updateAuthor":"","updateTime":"2018-08-18 00:00:00"},{"content":"","createAuthor":"nyadmin","createTime":"2018-08-18 00:00:00","id":5,"imagelist":"http://www.njupt.edu.cn/_upload/article/images/8b/22/824b306046969bcbe1754bc554ef/e784164d-3448-480e-b189-5a99cb74c816.jpg","isDelete":0,"linkUrl":"http://47.104.81.170:8080/teach_app_api/omp/notice_detail.html?noticeId=5","noticeType":1,"status":1,"title":"南邮211","updateAuthor":"","updateTime":"2018-08-18 00:00:00"},{"content":"","createAuthor":"","createTime":"2018-08-16 00:00:00","id":1,"imagelist":"http://www.njupt.edu.cn/_upload/article/images/8b/22/824b306046969bcbe1754bc554ef/f36978da-7c60-4df3-b6d5-26620e193949.jpg","isDelete":0,"linkUrl":"http://47.104.81.170:8080/teach_app_api/omp/notice_detail.html?noticeId=1","noticeType":2,"status":1,"title":"南邮风采","updateAuthor":"是","updateTime":"2018-08-17 00:00:00"}]
     */

    private List<ResultBean> result;

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * content :
         * createAuthor : nyadmin
         * createTime : 2018-08-18 00:00:00
         * id : 4
         * imagelist : http://www.njupt.edu.cn/_upload/article/images/8b/22/824b306046969bcbe1754bc554ef/93ef5e06-0cea-4fb6-a242-10e340646212.jpg
         * isDelete : 0
         * linkUrl : http://47.104.81.170:8080/teach_app_api/omp/notice_detail.html?noticeId=4
         * noticeType : 2
         * status : 1
         * title : 南邮大门
         * updateAuthor :
         * updateTime : 2018-08-18 00:00:00
         */

        private String content;
        private String createAuthor;
        private String createTime;
        private int id;
        private String imagelist;
        private int isDelete;
        private String linkUrl;
        private int noticeType;
        private int status;
        private String title;
        private String updateAuthor;
        private String updateTime;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateAuthor() {
            return createAuthor;
        }

        public void setCreateAuthor(String createAuthor) {
            this.createAuthor = createAuthor;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImagelist() {
            return imagelist;
        }

        public void setImagelist(String imagelist) {
            this.imagelist = imagelist;
        }

        public int getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(int isDelete) {
            this.isDelete = isDelete;
        }

        public String getLinkUrl() {
            return linkUrl;
        }

        public void setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
        }

        public int getNoticeType() {
            return noticeType;
        }

        public void setNoticeType(int noticeType) {
            this.noticeType = noticeType;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUpdateAuthor() {
            return updateAuthor;
        }

        public void setUpdateAuthor(String updateAuthor) {
            this.updateAuthor = updateAuthor;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }
}
