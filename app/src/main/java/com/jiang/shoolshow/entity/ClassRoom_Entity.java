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
     * result : {"jsCurrentDayKc":[{"id":30,"jc":"第3,4节","jscsrq":"1980-12-23","jsdmt":"投影仪，电脑","jsgh":"20020058","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教1","jsxb":"女性","jsxbm":"2","jsxm":"金栩","jsyjfx":"计算机通信与网间互连技术","jszc":"讲师（高校）","jszws":"230","kcdm":"H0600031S","kcmc":"线性代数与解析几何","skbjh":"","skdd":"教1－105","skrs":"30","sksj":"3-18周星期五","xn":"","xq":"","zp":"http://imgtu.5011.net/uploads/content/20161219/small78058014821359311482136095.jpg"}],"jsInfo":{"id":30,"jc":"第3,4节","jscsrq":"1980-12-23","jsdmt":"投影仪，电脑","jsgh":"20020058","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教1","jsxb":"女性","jsxbm":"2","jsxm":"金栩","jsyjfx":"计算机通信与网间互连技术","jszc":"讲师（高校）","jszws":"230","kcdm":"H0600031S","kcmc":"线性代数与解析几何","skbjh":"","skdd":"教1－105","skrs":"30","sksj":"3-18周星期五","xn":"","xq":"","zp":"http://imgtu.5011.net/uploads/content/20161219/small78058014821359311482136095.jpg"}}
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
         * jsCurrentDayKc : [{"id":30,"jc":"第3,4节","jscsrq":"1980-12-23","jsdmt":"投影仪，电脑","jsgh":"20020058","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教1","jsxb":"女性","jsxbm":"2","jsxm":"金栩","jsyjfx":"计算机通信与网间互连技术","jszc":"讲师（高校）","jszws":"230","kcdm":"H0600031S","kcmc":"线性代数与解析几何","skbjh":"","skdd":"教1－105","skrs":"30","sksj":"3-18周星期五","xn":"","xq":"","zp":"http://imgtu.5011.net/uploads/content/20161219/small78058014821359311482136095.jpg"}]
         * jsInfo : {"id":30,"jc":"第3,4节","jscsrq":"1980-12-23","jsdmt":"投影仪，电脑","jsgh":"20020058","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教1","jsxb":"女性","jsxbm":"2","jsxm":"金栩","jsyjfx":"计算机通信与网间互连技术","jszc":"讲师（高校）","jszws":"230","kcdm":"H0600031S","kcmc":"线性代数与解析几何","skbjh":"","skdd":"教1－105","skrs":"30","sksj":"3-18周星期五","xn":"","xq":"","zp":"http://imgtu.5011.net/uploads/content/20161219/small78058014821359311482136095.jpg"}
         */

        private JsInfoBean jsInfo;
        private String jc;

        public String getJc() {
            return jc;
        }

        public void setJc(String jc) {
            this.jc = jc;
        }

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
             * id : 30
             * jc : 第3,4节
             * jscsrq : 1980-12-23
             * jsdmt : 投影仪，电脑
             * jsgh : 20020058
             * jslx : 仙林多媒体
             * jsszlc : 1
             * jsszlh : 教1
             * jsxb : 女性
             * jsxbm : 2
             * jsxm : 金栩
             * jsyjfx : 计算机通信与网间互连技术
             * jszc : 讲师（高校）
             * jszws : 230
             * kcdm : H0600031S
             * kcmc : 线性代数与解析几何
             * skbjh :
             * skdd : 教1－105
             * skrs : 30
             * sksj : 3-18周星期五
             * xn :
             * xq :
             * zp : http://imgtu.5011.net/uploads/content/20161219/small78058014821359311482136095.jpg
             */

            private int id;
            private String jc;
            private String jscsrq;
            private String jsdmt;
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
            private String skrs;
            private String sksj;
            private String xn;
            private String xq;
            private String zp;

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

            public String getJsdmt() {
                return jsdmt;
            }

            public void setJsdmt(String jsdmt) {
                this.jsdmt = jsdmt;
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

            public String getSkrs() {
                return skrs;
            }

            public void setSkrs(String skrs) {
                this.skrs = skrs;
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

            public String getZp() {
                return zp;
            }

            public void setZp(String zp) {
                this.zp = zp;
            }
        }

        public static class JsCurrentDayKcBean {
            /**
             * id : 30
             * jc : 第3,4节
             * jscsrq : 1980-12-23
             * jsdmt : 投影仪，电脑
             * jsgh : 20020058
             * jslx : 仙林多媒体
             * jsszlc : 1
             * jsszlh : 教1
             * jsxb : 女性
             * jsxbm : 2
             * jsxm : 金栩
             * jsyjfx : 计算机通信与网间互连技术
             * jszc : 讲师（高校）
             * jszws : 230
             * kcdm : H0600031S
             * kcmc : 线性代数与解析几何
             * skbjh :
             * skdd : 教1－105
             * skrs : 30
             * sksj : 3-18周星期五
             * xn :
             * xq :
             * zp : http://imgtu.5011.net/uploads/content/20161219/small78058014821359311482136095.jpg
             */

            private int id;
            private String jc;
            private String jscsrq;
            private String jsdmt;
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
            private String skrs;
            private String sksj;
            private String xn;
            private String xq;
            private String zp;

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

            public String getJsdmt() {
                return jsdmt;
            }

            public void setJsdmt(String jsdmt) {
                this.jsdmt = jsdmt;
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

            public String getSkrs() {
                return skrs;
            }

            public void setSkrs(String skrs) {
                this.skrs = skrs;
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

            public String getZp() {
                return zp;
            }

            public void setZp(String zp) {
                this.zp = zp;
            }
        }
    }


}
