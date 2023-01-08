package org.example;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

import java.nio.charset.StandardCharsets;
import java.time.Instant;

public class HelloRxJava {
    public static void main(String[] args) {

        System.out.println("Hello world!, Starting the Reactive application ");

        Observable<String> source = Observable.create(
                e -> {
                    e.onNext("Poco Loco");
                    e.onNext("Reactive Java Rx ");
                }
        );

        source.subscribe(
                e -> System.out.println("Observer 1 "+e)
        );
        var ans = source.subscribe(
                e -> System.out.println("Observer 2 "+e)
        );
        System.out.println(ans.getClass().getName());
    }
}