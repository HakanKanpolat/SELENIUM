package myfirstSeleniumProject;

import org.junit.jupiter.api.*;

public class day03_JUnitAnnotations {



        // @Test annotations bizim test case olusturmamiz saglar

        // Bu en cok kullandigimiz test methodudur

        // @BeforeAAll ve @AfterAll bunlarda bir kez calisir before ve after her class ta


        // @BeforeEach ve @AfterEach her bir test caseden(test annotation) once bir kez ve sonrasinda bir kez calisir.....


        // @BeforeAll



        @BeforeAll
        public static void setUpClass(){

            System.out.println("Before All");
        }


        // @AfterAll

        @AfterAll
        public static void tearDownClass(){

            System.out.println("AfterAll");
        }



        // @BeforeEach

        @BeforeEach
        public void setUpMethods(){

            System.out.println("Before each");
        }


        // @AfterEach

        @AfterEach
        public void tearDownMethods(){


            System.out.println("After Each");
        }


        @Test
        public void test01(){

            System.out.println("Test01");
        }

        @Test
        public void test02(){


            System.out.println("Test02");
        }


        @Test
        public void test03(){

            System.out.println("Test03");
        }

        @Test
        public void test04(){


            System.out.println("Test04");
        }



        @Test
        public void test05(){


            System.out.println("Test05");
        }



    }

