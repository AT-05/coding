package org.fundacionjala.coding.Marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_ExamTest {
    Kata_Exam digital;
    @Before
    public void ini()
    {
     digital=new Kata_Exam();
    }
    @Test
    public void test1()
    {

        assertEquals(7,digital.Root(16));
    }
    @Test
    public void test2()
    {
        Kata_Exam digital=new Kata_Exam();
        assertEquals(6,digital.Root(942));
    }
    @Test
    public void test3()
    {
        Kata_Exam digital=new Kata_Exam();
        assertEquals(6,digital.Root(132189));
    }
    @Test
    public void test4()
    {
        Kata_Exam digital=new Kata_Exam();
        assertEquals(2,digital.Root(493193));
    }
}
