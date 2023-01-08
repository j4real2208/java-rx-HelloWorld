package org.example.CreatingObservableStart;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

import java.util.ArrayList;
import java.util.List;

public class CreateObservable {
    public static void main(String[] args) {

        // create method

        Observable<String> source = Observable.create(
                e -> {
                    e.onNext("Poco Loco");
                    e.onNext("Reactive Java Rx ");
                    e.onComplete();
                }
        );
        source.subscribe(System.out::println);
        System.out.println("****************************************************************************************");

        //just() method

        Observable<Integer> justSource = Observable.just(1,2,3);
        justSource.subscribe(System.out::println);


        System.out.println("**********************");

        // fromIterable() for arrays
        List<Integer> integerArrayList = List.of(8,9,101,7,2);
        Observable<Integer> integerObservable = Observable.fromIterable(integerArrayList);
        integerObservable.subscribe(System.out::println);

        System.out.println("**********************");
    }







}
