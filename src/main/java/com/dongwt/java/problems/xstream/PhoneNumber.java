package com.dongwt.java.problems.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * Created by dongwt on 2017/12/26.
 */
@XStreamAlias("phoneNumber")
@Data
public class PhoneNumber {
    @XStreamAlias("code")
    private int code;
    @XStreamAlias("number")
    private String number;
    @XStreamAlias("firstName")
    private String firstName;
}
