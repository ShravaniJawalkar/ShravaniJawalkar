package org.example;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ReactiveStream {
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
        Flux<String> flux = Flux.just("Hello", "Team","my","name","is","anna")
                .map(String::toUpperCase).delayElements(Duration.ofMillis(2000));
        flux.subscribe(System.out::println);

        Flux<Integer> flux1 = Flux.range(1, 10)
                .doOnRequest(n -> System.out.println("Requesting: " + n))
                .doOnNext(i -> System.out.println("Publishing: " + i))
                .limitRate(3); // Request 3 items at a time

        flux1.subscribe(i -> {
            System.out.println("Received: " + i);
            try {
                Thread.sleep(500); // Simulate some processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        try {
            Thread.sleep(5000); // Give time for async processing
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
          CompletableFuture<String> completableFuture = CompletableFuture.completedFuture(Flux.just("Apple", "Banana", "Cherry", "Date").blockLast(Duration.ofDays(2000)));
        completableFuture.complete("done");
        completableFuture.handleAsync(
                (result, exception) -> {
                    if (exception != null) {
                        System.out.println("Error: " + exception.getMessage());
                    } else {
                        System.out.println("Result: " + result);
                    }
                    return null;
                }
        );
        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Key : ");
        String k = sc.nextLine();
    }
}