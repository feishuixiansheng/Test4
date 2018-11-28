package com.guangyao.tesfsd.mygit;

import java.util.List;

/**
 * Created by Administrator on 2018/7/23.
 */

public class ChartRoomHistory extends Base{

    /**
     * list : [{"content":"大集合","passport":"可爱滴大宝宝","sendtime":"2147483647","sex":"2","thumb":"","type":"1","userid":"228"},{"content":"大集合","passport":"租友2863","sendtime":"2147483647","sex":"1","thumb":"","type":"1","userid":"96"},{"content":"大家好","passport":"租友5813","sendtime":"2147483647","sex":"1","thumb":"","type":"1","userid":"73"},{"content":"2312313","passport":"租友2863","sendtime":"2147483647","sex":"1","thumb":"","type":"1","userid":"96"},{"content":"123213123","passport":"独领风骚","sendtime":"2147483647","sex":"1","thumb":"http://www.danche18.com/file/upload/2018-05-12/201805121638022488922.jpg","type":"1","userid":"86"},{"content":"大家好啊","passport":"独领风骚","sendtime":"2147483647","sex":"1","thumb":"http://www.danche18.com/file/upload/2018-05-12/201805121638022488922.jpg","type":"1","userid":"86"},{"content":"大家好大家好","passport":"大大","sendtime":"2147483647","sex":"1","thumb":"http://www.danche18.com/file/upload/2018-05-16/201805161716548661041.jpg","type":"1","userid":"91"}]
     * msg : 成功！
     * status : 1
     * time : 1532083438
     */
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * content : 大集合
         * passport : 可爱滴大宝宝
         * sendtime : 2147483647
         * sex : 2
         * thumb :
         * type : 1
         * userid : 228
         */

        private String content;
        private String passport;
        private String sendtime;
        private String sex;
        private String thumb;
        private String type;
        private String userid;
        private String userid1;

        private String giftimg;//礼物图片
        private String content1;
        private String content2;
        private String content3;

        public String getGiftimg() {
            return giftimg;
        }

        public void setGiftimg(String giftimg) {
            this.giftimg = giftimg;
        }

        public String getContent1() {
            return content1;
        }

        public void setContent1(String content1) {
            this.content1 = content1;
        }

        public String getContent2() {
            return content2;
        }

        public void setContent2(String content2) {
            this.content2 = content2;
        }

        public String getContent3() {
            return content3;
        }

        public void setContent3(String content3) {
            this.content3 = content3;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPassport() {
            return passport;
        }

        public void setPassport(String passport) {
            this.passport = passport;
        }

        public String getSendtime() {
            return sendtime;
        }

        public void setSendtime(String sendtime) {
            this.sendtime = sendtime;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }
    }
}
