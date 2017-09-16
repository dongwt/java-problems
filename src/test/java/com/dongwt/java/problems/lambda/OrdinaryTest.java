package com.dongwt.java.problems.lambda;

import com.alibaba.fastjson.JSONObject;
import com.dongwt.java.problems.model.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by dongwt on 2017/9/14.
 */
public class OrdinaryTest {

    private List<String> stringCollection;


    @Before
    public void before() {
        stringCollection = new ArrayList<>();

        stringCollection.add("ddd2");

        stringCollection.add("aaa2");

        stringCollection.add("bbb1");

        stringCollection.add("aaa1");

        stringCollection.add("bbb3");

        stringCollection.add("ccc");

        stringCollection.add("bbb2");

        stringCollection.add("ddd1");
    }


    @Test
    public void testList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream().filter(item -> item % 2 == 0).map(item -> item * 100).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(result));
    }

    @Test
    public void testPredicate() {
        Predicate<String> predicate = (s) -> s.length() > 0;
        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false
    }

    @Test
    public void testFunction() {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        String result = backToString.apply("123");     // "123"
        System.out.println(result);
    }


    @Test
    public void testSupplier() {
        Supplier<Scope> personSupplier = Scope::new;
        Scope scope = personSupplier.get();   // new Scope
        System.out.println(scope);
    }

    @Test
    public void testConsumer() {
        Consumer<Person> consumer = p -> System.out.println("hello " + p.getFirstName());
        consumer.accept(new Person("dong", "wt"));
    }

    @Test
    public void testComparator() {
        Comparator<Person> comparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");
        System.out.println(comparator.compare(p1, p2));
        System.out.println(comparator.reversed().compare(p1, p2));
    }

    @Test
    public void testOptional() {
        Optional<String> optional = Optional.of("bam");
        System.out.println(optional.isPresent());// true
        System.out.println(optional.get());// "bam"
        System.out.println(optional.orElse("fallback"));// "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));
    }

    @Test
    public void testReduce() {
        Optional<String> reduced = stringCollection
                .stream()
                .sorted()
                .reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);
        System.out.println(reduced.get());
    }
}
