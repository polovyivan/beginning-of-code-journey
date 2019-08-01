package com.lincros.ivan.polovyi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamsTest {


    @Test
    public void integerStream() {
        // 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
    }

    @Test
    public void integerStreamWithSkip() {
        // 2. Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
    }

    @Test
    public void integerStreamWithSum() {
        // 3. Integer Stream with sum
        System.out.println(
                IntStream.range(1, 5)
                        .sum());
        System.out.println();

    }

    @Test
    public void streamOfSortedAndFindFirst() {
        // 4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }

    @Test
    public void streamFromArraySortFilterAndPrint() {
        // 5. Stream from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)    // same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void streamAverageOfSquaresOfAnIntArray() {
        // 6. average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }


    @Test
    public void streamFromListFilterAndPrint() {
        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }

    @Test
    public void streamRowsFromTextFileSortFilterAndPrint() throws IOException {
        // 8. Stream rows from text file, sort, filter, and print
        Stream<String> bands = null;

        bands = Files.lines(Paths.get("bands.txt"));

        bands.sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();
    }

    @Test
    public void streamRowsFromTextFileAndSaveToList() throws IOException {
        // 9. Stream rows from text file and save to List
        List<String> bands2 = null;

        bands2 = Files.lines(Paths.get("bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());

        bands2.forEach(x -> System.out.println(x));
    }


    @Test
    public void streamRowsFromCSVFileAndCount() throws IOException {
        // 10. Stream rows from CSV file and count
        Stream<String> rows1 = null;

        rows1 = Files.lines(Paths.get("data.txt"));

        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();
    }

    @Test
    public void sreamRowsFromCSVFileParseDataFromRows() throws IOException {
        // 11. Stream rows from CSV file, parse data from rows
        Stream<String> rows2 = null;

        rows2 = Files.lines(Paths.get("data.txt"));

        rows2.map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
        rows2.close();
    }

    @Test
    public void streamRowsFromCSVFileStoreFieldsInHashMap() throws IOException {
        // 12. Stream rows from CSV file, store fields in HashMap
        Stream<String> rows3 = null;

        rows3 = Files.lines(Paths.get("data.txt"));

        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (
                String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }
    }

    @Test
    public void streamReductionSum() {
        // 13. Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);
    }

    @Test
    public void streamReductionSummaryStatistics() {
        // 14. Reduction - summary statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);
    }

}