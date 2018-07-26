package com.jiang.shoolshow.entity;

import java.util.List;

/**
 * @author: jiangadmin
 * @date: 2018/7/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO:教室数据
 */
public class ClassRoom_Entity extends Base_Entity {

    /**
     * errorcode : 1000
     * result : {"jsCurrentDayKc":[{"id":188,"jc":"第3,4,5节","jscsrq":"1973-11-28","jsgh":"20110065","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"刘亮","jsyjfx":"","jszc":"讲师（高校）","jszws":"120","kcdm":"B0708321S","kcmc":"视听语言","skbjh":"","skdd":"教3－204","sksj":"1-18周星期三","xn":"","xq":""},{"id":329,"jc":"第8,9节","jscsrq":"1976-12-13","jsgh":"20040087","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"女性","jsxbm":"2","jsxm":"张凤","jsyjfx":"","jszc":"讲师（高校）","jszws":"120","kcdm":"F0801051C","kcmc":"中国概况Ⅰ","skbjh":"F170101,F170401","skdd":"教3－204","sksj":"3-18周星期三","xn":"2017-2018","xq":"1"},{"id":1290,"jc":"第8,9节","jscsrq":"1976-12-13","jsgh":"20040087","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"女性","jsxbm":"2","jsxm":"张凤","jsyjfx":"","jszc":"讲师（高校）","jszws":"120","kcdm":"F0801051C","kcmc":"中国概况Ⅰ","skbjh":"F171201,F171202","skdd":"教3－204","sksj":"3-18周星期三","xn":"2017-2018","xq":"1"}],"jsInfo":{"id":188,"jc":"第3,4,5节","jscsrq":"1973-11-28","jsgh":"20110065","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"刘亮","jsyjfx":"","jszc":"讲师（高校）","jszws":"120","kcdm":"B0708321S","kcmc":"视听语言","skbjh":"","skdd":"教3－204","sksj":"1-18周星期三","xn":"","xq":""}}
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
         * jsCurrentDayKc : [{"id":188,"jc":"第3,4,5节","jscsrq":"1973-11-28","jsgh":"20110065","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"刘亮","jsyjfx":"","jszc":"讲师（高校）","jszws":"120","kcdm":"B0708321S","kcmc":"视听语言","skbjh":"","skdd":"教3－204","sksj":"1-18周星期三","xn":"","xq":""},{"id":329,"jc":"第8,9节","jscsrq":"1976-12-13","jsgh":"20040087","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"女性","jsxbm":"2","jsxm":"张凤","jsyjfx":"","jszc":"讲师（高校）","jszws":"120","kcdm":"F0801051C","kcmc":"中国概况Ⅰ","skbjh":"F170101,F170401","skdd":"教3－204","sksj":"3-18周星期三","xn":"2017-2018","xq":"1"},{"id":1290,"jc":"第8,9节","jscsrq":"1976-12-13","jsgh":"20040087","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"女性","jsxbm":"2","jsxm":"张凤","jsyjfx":"","jszc":"讲师（高校）","jszws":"120","kcdm":"F0801051C","kcmc":"中国概况Ⅰ","skbjh":"F171201,F171202","skdd":"教3－204","sksj":"3-18周星期三","xn":"2017-2018","xq":"1"}]
         * jsInfo : {"id":188,"jc":"第3,4,5节","jscsrq":"1973-11-28","jsgh":"20110065","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"刘亮","jsyjfx":"","jszc":"讲师（高校）","jszws":"120","kcdm":"B0708321S","kcmc":"视听语言","skbjh":"","skdd":"教3－204","sksj":"1-18周星期三","xn":"","xq":""}
         */

        private JsInfoBean jsInfo;
        private List<JsCurrentDayKcBean> jsCurrentDayKc;

        public JsInfoBean getJsInfo() {
            return jsInfo;
        }

        public void setJsInfo(JsInfoBean jsInfo) {
            this.jsInfo = jsInfo;
        }

        public List<JsCurrentDayKcBean> getJsCurrentDayKc() {
            return jsCurrentDayKc;
        }

        public void setJsCurrentDayKc(List<JsCurrentDayKcBean> jsCurrentDayKc) {
            this.jsCurrentDayKc = jsCurrentDayKc;
        }

        public static class JsInfoBean {
            /**
             * id : 188
             * jc : 第3,4,5节
             * jscsrq : 1973-11-28
             * jsgh : 20110065
             * jslx : 仙林多媒体
             * jsszlc : 2
             * jsszlh : 教3
             * jsxb : 男性
             * jsxbm : 1
             * jsxm : 刘亮
             * jsyjfx :
             * jszc : 讲师（高校）
             * jszws : 120
             * kcdm : B0708321S
             * kcmc : 视听语言
             * skbjh :
             * skdd : 教3－204
             * sksj : 1-18周星期三
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

        public static class JsCurrentDayKcBean {
            /**
             * id : 188
             * jc : 第3,4,5节
             * jscsrq : 1973-11-28
             * jsgh : 20110065
             * jslx : 仙林多媒体
             * jsszlc : 2
             * jsszlh : 教3
             * jsxb : 男性
             * jsxbm : 1
             * jsxm : 刘亮
             * jsyjfx :
             * jszc : 讲师（高校）
             * jszws : 120
             * kcdm : B0708321S
             * kcmc : 视听语言
             * skbjh :
             * skdd : 教3－204
             * sksj : 1-18周星期三
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
