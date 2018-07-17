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
     * result : {"bjTotel":0,"studentTotel":0,"skjsInfoList":[{"id":106,"jc":"第3,4,5节","jscsrq":"1950-03-27","jsgh":"19750006","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李广山","jsyjfx":"","jszc":"工程师","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"","skdd":"教3－102","sksj":"2-18周星期二","xn":"","xq":""},{"id":273,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B171202,B171201","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":988,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B171213,B171214,B171212","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":989,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B170102,B170103,B170101","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":1598,"jc":"第3,4,5节","jscsrq":"1972-11-03","jsgh":"20090010","jslx":"仙林多媒体","jsszlc":"4","jsszlh":"教3","jsxb":"女性","jsxbm":"2","jsxm":"赵斌","jsyjfx":"","jszc":"教授","jszws":"120","kcdm":"B0701221S","kcmc":"音乐基础 ","skbjh":"","skdd":"教3－404","sksj":"1-18周星期二","xn":"","xq":""},{"id":1706,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B170508,B170509,B170510","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":1727,"jc":"第3,4,5节","jscsrq":"1980-01-03","jsgh":"20100059","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"沈清明","jsyjfx":"","jszc":"","jszws":"120","kcdm":"B1703061S","kcmc":"材料分析技术","skbjh":"","skdd":"教3－203","sksj":"1-16周星期二","xn":"","xq":""}],"kcTotel":70,"jsUsingTotel":7}
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
         * studentTotel : 0
         * skjsInfoList : [{"id":106,"jc":"第3,4,5节","jscsrq":"1950-03-27","jsgh":"19750006","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李广山","jsyjfx":"","jszc":"工程师","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"","skdd":"教3－102","sksj":"2-18周星期二","xn":"","xq":""},{"id":273,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B171202,B171201","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":988,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B171213,B171214,B171212","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":989,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B170102,B170103,B170101","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":1598,"jc":"第3,4,5节","jscsrq":"1972-11-03","jsgh":"20090010","jslx":"仙林多媒体","jsszlc":"4","jsszlh":"教3","jsxb":"女性","jsxbm":"2","jsxm":"赵斌","jsyjfx":"","jszc":"教授","jszws":"120","kcdm":"B0701221S","kcmc":"音乐基础 ","skbjh":"","skdd":"教3－404","sksj":"1-18周星期二","xn":"","xq":""},{"id":1706,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B170508,B170509,B170510","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":1727,"jc":"第3,4,5节","jscsrq":"1980-01-03","jsgh":"20100059","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"沈清明","jsyjfx":"","jszc":"","jszws":"120","kcdm":"B1703061S","kcmc":"材料分析技术","skbjh":"","skdd":"教3－203","sksj":"1-16周星期二","xn":"","xq":""}]
         * kcTotel : 70
         * jsUsingTotel : 7
         */

        private int bjTotel;
        private int studentTotel;
        private int kcTotel;
        private int jsUsingTotel;
        private List<SkjsInfoListBean> skjsInfoList;

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

        public static class SkjsInfoListBean {
            /**
             * id : 106
             * jc : 第3,4,5节
             * jscsrq : 1950-03-27
             * jsgh : 19750006
             * jslx : 仙林多媒体
             * jsszlc : 1
             * jsszlh : 教3
             * jsxb : 男性
             * jsxbm : 1
             * jsxm : 李广山
             * jsyjfx :
             * jszc : 工程师
             * jszws : 234
             * kcdm : B0900161C
             * kcmc : 军事理论
             * skbjh :
             * skdd : 教3－102
             * sksj : 2-18周星期二
             * xn :
             * xq :
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
