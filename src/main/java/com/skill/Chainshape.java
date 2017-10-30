package com.skill;

import lombok.Builder;
import lombok.ToString;

@ToString(of = {"name","sex"})
public class Chainshape {
    private String  name;
    private String sex;
    private String results;
    public static class Set{
        private String name;
        private String sex;
        private String results;
        public Set name(String name){
            this.name = name;
            return this;
        }

        public Set sex(String sex){
            this.sex = sex;
            return this;
        }

        public Set results(String results){
            this.results =results;
            return this;
        }

        public Chainshape build(){
            return new Chainshape(this);
        }
    }

    private Chainshape(Set set){
        name = set.name;
        sex = set.sex;
        results = set.results;
    }

}
