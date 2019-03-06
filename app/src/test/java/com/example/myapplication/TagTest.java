package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TagTest {
    @Test
    public void simpleEnumExampleOutsideClassTest(){
        Stag skill = Stag.JAVA;
        System.out.println("Skill Tag enum is set a value: "+skill);
        assertEquals(Stag.valueOf("JAVA"), skill);
    }
}
