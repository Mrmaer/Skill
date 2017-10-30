package com.skill;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString(of = {"name","sex"})
public class Uselombok {
    private String  name;
    private String sex;
    private String results;
}
