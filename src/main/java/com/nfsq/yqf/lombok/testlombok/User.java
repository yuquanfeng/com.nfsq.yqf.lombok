package com.nfsq.yqf.lombok.testlombok;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * lombok底层是利用字节码技术，当加上lombok的注解的时候通过扫包，会将class文件进行修改，自动补全注解代表的方法
 *
 */
@Setter//自动生成getter、setter方法
@Getter
@NoArgsConstructor//自动生成无参构造
@AllArgsConstructor//自动生成所有参构造
@ToString//自动生成toString方法
@Accessors(chain = true)//get、set方法可以链式调用
@Builder//生成build模式的方法
public class User {
    private String userName;
    private Integer userAge;

    public static void main(String[] args) {
        User user = User.builder().userAge(1).userName("hh").build();
        System.out.println(user);
        User user1 = new User("xx",30);
        System.out.println(user1);
        User user2 = new User();
        user2.setUserAge(3).setUserName("laoyu");
        System.out.println(user2);
    }
}
