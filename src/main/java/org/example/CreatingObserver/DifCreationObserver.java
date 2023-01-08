package org.example.CreatingObserver;

import io.reactivex.rxjava3.core.Observable;

public class DifCreationObserver {

    public static void main(String[] args) {

        Observable<String> stringObservable = Observable.just("Orange","Black","Blue");
        stringObservable.subscribe(System.out::println, Throwable::printStackTrace,() -> System.out.println("Observer Completed !!"));

        System.out.println("****************************************************************************************");

        stringObservable.subscribe(System.out::println, Throwable::printStackTrace);

        System.out.println("****************************************************************************************");



    }
}
