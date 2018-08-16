package com.jiang.shoolshow.entity;

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
     * result : {"content":"到底是达到","createAuthor":"","createTime":"2018-08-16 00:00:00","id":1,"imagelist":"http://img07.tooopen.com/images/20170316/tooopen_sy_201956178977.jpg,http://img07.tooopen.com/images/20170316/tooopen_sy_201956178977.jpg","isDelete":0,"noticeType":2,"status":1,"updateAuthor":"是","updateTime":"2018-08-16 00:00:00"}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * content : 到底是达到
         * createAuthor :
         * createTime : 2018-08-16 00:00:00
         * id : 1
         * imagelist : http://img07.tooopen.com/images/20170316/tooopen_sy_201956178977.jpg,http://img07.tooopen.com/images/20170316/tooopen_sy_201956178977.jpg
         * isDelete : 0
         * noticeType : 2
         * status : 1
         * updateAuthor : 是
         * updateTime : 2018-08-16 00:00:00
         */

        private String content;
        private String createAuthor;
        private String createTime;
        private int id;
        private String imagelist;
        private int isDelete;
        private int noticeType;
        private int status;
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
