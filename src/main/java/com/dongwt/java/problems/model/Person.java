package com.dongwt.java.problems.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by dongwt on 2017/9/15.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable{

    private static final long serialVersionUID = 7257496003084147895L;
    private String firstName;

    private String lastName;
}
