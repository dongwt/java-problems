package com.dongwt.java.problems.xstream;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * Created by dongwt on 2017/12/26.
 */
public class XmlUtilTest {

    private static final String personXml = "<person>" +
            "<firstName>f</firstName>" +
            "<lastName>l</lastName>" +
            "</person>";
    private static final String personXml2 = "<person>" +
            "<firstName>f2</firstName>" +
            "<lastName>l2</lastName>" +
            "</person>";

    private static final String phoneNumberXml = "<phoneNumber>" +
            "<code>1</code>" +
            "<number>110</number>" +
            "<firstName>pf</firstName>" +
            "</phoneNumber>";


    public static void diffsBean2Xml() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            System.out.println(i + "----------------");
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("1.PersonBean");
                    PersonBean personBean = new PersonBean();
                    personBean.setFirstName("f");
                    personBean.setLastName("l");
                    System.out.println(XmlUtil.toXml(personBean, 1000 * 5));
                    countDownLatch.countDown();
                }
            });

            t1.start();

            Thread.sleep(1000);
            System.out.println("2.PhoneNumber");
            PhoneNumber phoneNumber = new PhoneNumber();
            phoneNumber.setCode(1);
            phoneNumber.setNumber("110");
            phoneNumber.setFirstName("pf");
            System.out.println(XmlUtil.toXml(phoneNumber, 1000 * 5));
            countDownLatch.await();
            System.out.println("end");
        }
    }


    public static void sameBean2Xml() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            System.out.println(i + "----------------");
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("1.PersonBean");
                    PersonBean personBean = new PersonBean();
                    personBean.setFirstName("f");
                    personBean.setLastName("l");
                    System.out.println(XmlUtil.toXml(personBean, 1000 * 5));
                    countDownLatch.countDown();
                }
            });

            t1.start();

            Thread.sleep(1000);
            System.out.println("2.personBean");
            PersonBean personBean = new PersonBean();
            personBean.setFirstName("f");
            personBean.setLastName("l");
            System.out.println(XmlUtil.toXml(personBean, 1000));
            countDownLatch.await();
            System.out.println("end");
        }
    }


    public static void diffsXml2Bean() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            System.out.println(i + "----------------");
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("1.PersonBean");
                    System.out.println(XmlUtil.toBean(personXml, PersonBean.class, 1000 * 5));
                    countDownLatch.countDown();
                }
            });

            t1.start();

            Thread.sleep(1000);
            System.out.println("1.PhoneNumber");
            System.out.println(XmlUtil.toBean(phoneNumberXml, PhoneNumber.class, 1000));
            countDownLatch.await();
            System.out.println("end");
        }
    }


    public static void sameXml2Bean() throws InterruptedException {
        for (int i = 0; ; i++) {
            Long beginMillis= System.currentTimeMillis();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            System.out.println(i + "----------------");
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("1.PersonBean");
                    System.out.println(XmlUtil.toBean(personXml, PersonBean.class, 1000 * 5));
                    countDownLatch.countDown();
                }
            });

            t1.start();

            Thread.sleep(1000);
            System.out.println("1.PersonBean");
            System.out.println(XmlUtil.toBean(personXml2, PersonBean.class, 1000*5));
            countDownLatch.await();
            System.out.println("end" + (System.currentTimeMillis()-beginMillis)/1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        sameXml2Bean();
    }
}
