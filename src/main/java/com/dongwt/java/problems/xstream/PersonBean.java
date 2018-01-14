package com.dongwt.java.problems.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * Created by dongwt on 2017/12/26.
 */
@XStreamAlias("person")
@Data
public class PersonBean {
    @XStreamAlias("firstName")
    private String firstName;
    @XStreamAlias("lastName")
    private String lastName;
}
