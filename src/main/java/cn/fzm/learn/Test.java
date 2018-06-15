package cn.fzm.learn;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by tt on 6/14/18.
 */
public class Test {
    public static void main(String[] args) {
        String pattern1 = "{0}，你好！你于  {1} 消费  {2} 元。";
        String pattern2 = "At {1,time,short} On {1,date,long}，{0} paid {2,number, currency}.";
        Object[] params = { "Jack", new GregorianCalendar().getTime(), 8888 };
        String msg1 = MessageFormat.format(pattern1, params);
        MessageFormat mf = new MessageFormat(pattern2, Locale.US);
        String msg2 = mf.format(params);

        System.out.println(msg1);
        System.out.println(msg2);


        Locale l = Locale.getDefault();
        System.out.println("默认语言代码: " + l.getLanguage());
        System.out.println("默认地区代码: " + l.getCountry());
        System.out.println("默认语言地区代码: " + l.toString());
        System.out.println("---------------------------------------");
        System.out.println("默认语言描述: " + l.getDisplayLanguage());
        System.out.println("默认地区描述: " + l.getDisplayCountry());
        System.out.println("默认语言,地区描述: " + l.getDisplayName());
        System.out.println("---------------------------------------");
        System.out.println("在美国默认语言叫: " + l.getDisplayLanguage(Locale.US));
        System.out.println("在美国默认地区叫: " + l.getDisplayCountry(Locale.US));
        System.out.println("在美国默认语言,地区叫: " + l.getDisplayName(Locale.US));
        System.out.println("在日本默认语言代码叫: " + l.getDisplayLanguage(Locale.JAPAN));
        System.out.println("在日本默认地区代码叫: " + l.getDisplayCountry(Locale.JAPAN));
        System.out.println("在日本默认语言,地区代码叫: " + l.getDisplayName(Locale.JAPAN));
        System.out.println("---------------------------------------");
        System.out.println("语言环境三字母缩写: " + l.getISO3Language());
        System.out.println("国家环境三字母缩写: " + l.getISO3Country());
        System.out.println("---------------------------------------");
    }
}
