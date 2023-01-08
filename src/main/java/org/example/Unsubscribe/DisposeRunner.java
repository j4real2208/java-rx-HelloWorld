package org.example.Unsubscribe;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class DisposeRunner {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> longObservable=Observable.interval(1, TimeUnit.SECONDS);
        @NonNull
        Disposable d =longObservable.subscribe((e) -> System.out.println(" Observer 1 : "+e));
         Thread.sleep(5000);
         d.dispose();
        longObservable.subscribe((e) -> System.out.println(" Observer 2 : "+e));

         Thread.sleep(10000);




    }
}
