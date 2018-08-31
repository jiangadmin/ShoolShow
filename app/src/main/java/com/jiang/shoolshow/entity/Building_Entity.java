package com.jiang.shoolshow.entity;

import java.util.List;

/**
 * @author: jiangadmin
 * @date: 2018/7/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 楼栋数据
 */
public class Building_Entity extends Base_Entity {

    /**
     * errorcode : 1000
     * result : {"bjTotel":0,"studentTotel":80,"skjsInfoList":[{"id":627,"jc":"第3,4,5节","jscsrq":"","jsgh":"","jslx":"仙林多媒体","jsszlc":"","jsszlh":"教1","jsxb":"","jsxbm":"","jsxm":"美方教师31","jsyjfx":"","jszc":"","jszws":"116","kcdm":"H1403011S","kcmc":"经济学原理Ⅰ","skbjh":"H170011","skdd":"教1－406","sksj":"1-15周星期三","xn":"2017-2018","xq":"2"},{"id":1593,"jc":"第3,4,5节","jscsrq":"","jsgh":"","jslx":"仙林多媒体","jsszlc":"","jsszlh":"教1","jsxb":"","jsxbm":"","jsxm":"美方教师31","jsyjfx":"","jszc":"","jszws":"116","kcdm":"H1403011S","kcmc":"经济学原理Ⅰ","skbjh":"H170009,H170010","skdd":"教1－406","sksj":"1-15周星期三","xn":"2017-2018","xq":"2"}],"kcTotel":19,"buildTotel":0,"buildCode":"1","jsUsingTotel":2,"buildLcTotelList":["1-15","2-16","3-12","4-11"]}
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
         * bjTotel : 0
         * studentTotel : 80
         * skjsInfoList : [{"id":627,"jc":"第3,4,5节","jscsrq":"","jsgh":"","jslx":"仙林多媒体","jsszlc":"","jsszlh":"教1","jsxb":"","jsxbm":"","jsxm":"美方教师31","jsyjfx":"","jszc":"","jszws":"116","kcdm":"H1403011S","kcmc":"经济学原理Ⅰ","skbjh":"H170011","skdd":"教1－406","sksj":"1-15周星期三","xn":"2017-2018","xq":"2"},{"id":1593,"jc":"第3,4,5节","jscsrq":"","jsgh":"","jslx":"仙林多媒体","jsszlc":"","jsszlh":"教1","jsxb":"","jsxbm":"","jsxm":"美方教师31","jsyjfx":"","jszc":"","jszws":"116","kcdm":"H1403011S","kcmc":"经济学原理Ⅰ","skbjh":"H170009,H170010","skdd":"教1－406","sksj":"1-15周星期三","xn":"2017-2018","xq":"2"}]
         * kcTotel : 19
         * buildTotel : 0
         * buildCode : 1
         * jsUsingTotel : 2
         * buildLcTotelList : ["1-15","2-16","3-12","4-11"]
         */

        private int bjTotel;
        private int studentTotel;
        private int kcTotel;
        private int buildTotel;
        private int buildCode;
        private int jsUsingTotel;
        private List<SkjsInfoListBean> skjsInfoList;
        private List<String> buildLcTotelList;

        public int getBjTotel() {
            return bjTotel;
        }

        public void setBjTotel(int bjTotel) {
            this.bjTotel = bjTotel;
        }

        public int getStudentTotel() {
            return studentTotel;
        }

        public void setStudentTotel(int studentTotel) {
            this.studentTotel = studentTotel;
        }

        public int getKcTotel() {
            return kcTotel;
        }

        public void setKcTotel(int kcTotel) {
            this.kcTotel = kcTotel;
        }

        public int getBuildTotel() {
            return buildTotel;
        }

        public void setBuildTotel(int buildTotel) {
            this.buildTotel = buildTotel;
        }

        public int getBuildCode() {
            return buildCode;
        }

        public void setBuildCode(int buildCode) {
            this.buildCode = buildCode;
        }

        public int getJsUsingTotel() {
            return jsUsingTotel;
        }

        public void setJsUsingTotel(int jsUsingTotel) {
            this.jsUsingTotel = jsUsingTotel;
        }

        public List<SkjsInfoListBean> getSkjsInfoList() {
            return skjsInfoList;
        }

        public void setSkjsInfoList(List<SkjsInfoListBean> skjsInfoList) {
            this.skjsInfoList = skjsInfoList;
        }

        public List<String> getBuildLcTotelList() {
            return buildLcTotelList;
        }

        public void setBuildLcTotelList(List<String> buildLcTotelList) {
            this.buildLcTotelList = buildLcTotelList;
        }

        public static class SkjsInfoListBean {
            /**
             * id : 627
             * jc : 第3,4,5节
             * jscsrq :
             * jsgh :
             * jslx : 仙林多媒体
             * jsszlc :
             * jsszlh : 教1
             * jsxb :
             * jsxbm :
             * jsxm : 美方教师31
             * jsyjfx :
             * jszc :
             * jszws : 116
             * kcdm : H1403011S
             * kcmc : 经济学原理Ⅰ
             * skbjh : H170011
             * skdd : 教1－406
             * sksj : 1-15周星期三
             * xn : 2017-2018
             * xq : 2
             */

            private int id;
            private String jc;
            private String jscsrq;
            private String jsgh;
            private String jslx;
            private String jsszlc;
            private String jsszlh;
            private String jsxb;
            private String jsxbm;
            private String jsxm;
            private String jsyjfx;
            private String jszc;
            private String jszws;
            private String kcdm;
            private String kcmc;
            private String skbjh;
            private String skdd;
            private String sksj;
            private String xn;
            private String xq;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getJc() {
                return jc;
            }

            public void setJc(String jc) {
                this.jc = jc;
            }

            public String getJscsrq() {
                return jscsrq;
            }

            public void setJscsrq(String jscsrq) {
                this.jscsrq = jscsrq;
            }

            public String getJsgh() {
                return jsgh;
            }

            public void setJsgh(String jsgh) {
                this.jsgh = jsgh;
            }

            public String getJslx() {
                return jslx;
            }

            public void setJslx(String jslx) {
                this.jslx = jslx;
            }

            public String getJsszlc() {
                return jsszlc;
            }

            public void setJsszlc(String jsszlc) {
                this.jsszlc = jsszlc;
            }

            public String getJsszlh() {
                return jsszlh;
            }

            public void setJsszlh(String jsszlh) {
                this.jsszlh = jsszlh;
            }

            public String getJsxb() {
                return jsxb;
            }

            public void setJsxb(String jsxb) {
                this.jsxb = jsxb;
            }

            public String getJsxbm() {
                return jsxbm;
            }

            public void setJsxbm(String jsxbm) {
                this.jsxbm = jsxbm;
            }

            public String getJsxm() {
                return jsxm;
            }

            public void setJsxm(String jsxm) {
                this.jsxm = jsxm;
            }

            public String getJsyjfx() {
                return jsyjfx;
            }

            public void setJsyjfx(String jsyjfx) {
                this.jsyjfx = jsyjfx;
            }

            public String getJszc() {
                return jszc;
            }

            public void setJszc(String jszc) {
                this.jszc = jszc;
            }

            public String getJszws() {
                return jszws;
            }

            public void setJszws(String jszws) {
                this.jszws = jszws;
            }

            public String getKcdm() {
                return kcdm;
            }

            public void setKcdm(String kcdm) {
                this.kcdm = kcdm;
            }

            public String getKcmc() {
                return kcmc;
            }

            public void setKcmc(String kcmc) {
                this.kcmc = kcmc;
            }

            public String getSkbjh() {
                return skbjh;
            }

            public void setSkbjh(String skbjh) {
                this.skbjh = skbjh;
            }

            public String getSkdd() {
                return skdd;
            }

            public void setSkdd(String skdd) {
                this.skdd = skdd;
            }

            public String getSksj() {
                return sksj;
            }

            public void setSksj(String sksj) {
                this.sksj = sksj;
            }

            public String getXn() {
                return xn;
            }

            public void setXn(String xn) {
                this.xn = xn;
            }

            public String getXq() {
                return xq;
            }

            public void setXq(String xq) {
                this.xq = xq;
            }
        }
    }
}
