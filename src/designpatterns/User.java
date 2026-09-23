package designpatterns;

public class User {
    private String name;
    private int age;

    public static class Builder {
        private String name;
        private int age;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build(){
            User u = new User();
            u.name = this.name;
            u.age = this.age;
            return u;
        }
    }
}
