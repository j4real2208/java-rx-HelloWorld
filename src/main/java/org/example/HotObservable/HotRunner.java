package org.example.HotObservable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class HotRunner {
    public static void main(String[] args) throws InterruptedException {
        @NonNull ConnectableObservable<Long> ConnectableObservable = Observable.interval(1, TimeUnit.SECONDS).publish();
        ConnectableObservable.connect();

        ConnectableObservable.subscribe(e1 -> System.out.println("Observer 1 : "+e1));

        Thread.sleep(10000);

        ConnectableObservable.subscribe(e2 -> System.out.println("Observer 2 : "+e2));

        Thread.sleep(10000);

    }
}
