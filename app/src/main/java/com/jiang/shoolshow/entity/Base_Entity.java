package com.jiang.shoolshow.entity;

/**
 * @author: jiangadmin
 * @date: 2018/7/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 公共数据解析
 */
public class Base_Entity {

    /**
     * errorcode : 1000
     * errormsg : 操作成功！
     * result : {"bjTotel":0,"studentTotel":0,"skjsInfoList":[{"id":106,"jc":"第3,4,5节","jscsrq":"1950-03-27","jsgh":"19750006","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李广山","jsyjfx":"","jszc":"工程师","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"","skdd":"教3－102","sksj":"2-18周星期二","xn":"","xq":""},{"id":273,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B171202,B171201","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":988,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B171213,B171214,B171212","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":989,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B170102,B170103,B170101","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":1598,"jc":"第3,4,5节","jscsrq":"1972-11-03","jsgh":"20090010","jslx":"仙林多媒体","jsszlc":"4","jsszlh":"教3","jsxb":"女性","jsxbm":"2","jsxm":"赵斌","jsyjfx":"","jszc":"教授","jszws":"120","kcdm":"B0701221S","kcmc":"音乐基础 ","skbjh":"","skdd":"教3－404","sksj":"1-18周星期二","xn":"","xq":""},{"id":1706,"jc":"第3,4,5节","jscsrq":"1970-08-27","jsgh":"19940026","jslx":"仙林多媒体","jsszlc":"1","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"李玉胜","jsyjfx":"","jszc":"副教授","jszws":"234","kcdm":"B0900161C","kcmc":"军事理论","skbjh":"B170508,B170509,B170510","skdd":"教3－101","sksj":"2-18周星期二","xn":"2017-2018","xq":"1"},{"id":1727,"jc":"第3,4,5节","jscsrq":"1980-01-03","jsgh":"20100059","jslx":"仙林多媒体","jsszlc":"2","jsszlh":"教3","jsxb":"男性","jsxbm":"1","jsxm":"沈清明","jsyjfx":"","jszc":"","jszws":"120","kcdm":"B1703061S","kcmc":"材料分析技术","skbjh":"","skdd":"教3－203","sksj":"1-16周星期二","xn":"","xq":""}],"kcTotel":70,"jsUsingTotel":7}
     */

    private int errorcode;
    private String errormsg;

    public int getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
}
