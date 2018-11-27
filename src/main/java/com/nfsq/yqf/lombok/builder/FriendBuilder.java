package com.nfsq.yqf.lombok.builder;

public class FriendBuilder {
    private String name;
    private Integer age;
    private FriendBuilder(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public static FriendBuilderExample builder(){
        return new FriendBuilderExample();
    }

    public static class FriendBuilderExample{
        private String name;
        private Integer age;
        private FriendBuilderExample(){}

        public FriendBuilderExample name(String name){
            this.name = name;
            return this;
        }

        public FriendBuilderExample age(Integer age){
            this.age = age;
            return this;
        }

        public FriendBuilder builder(){
            return new FriendBuilder(name,age);
        }

    }

    @Override
    public String toString() {
        return "FriendBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        FriendBuilder friendBuilder = FriendBuilder.builder().age(1).name("yy").builder();
        System.out.println(friendBuilder);
    }

}
