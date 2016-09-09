package com.imooc.autowiring;

/**
 * Created by hzg on 2016/9/8.
 */
public class AutoWiringService {
    private AutoWiringDAO autoWiringDAO;

    //通过构造器方法注入其实也是看传入参数的类型，所以autoWiringDAO这个bean没有id也是可以的(通过方法注入也是同样的原理)
    public AutoWiringService(AutoWiringDAO autoWiringDAO){
        System.out.println("构造器的方法自动的注入：AutoWiringService");
        this.autoWiringDAO=autoWiringDAO;
    }

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        System.out.println("setAutoWiringDAO");
        this.autoWiringDAO=autoWiringDAO;
    }

    public void say(String word) {
        this.autoWiringDAO.say(word);
    }
}
