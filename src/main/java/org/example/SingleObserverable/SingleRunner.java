package org.example.SingleObserverable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class SingleRunner {
    public static void main(String[] args) {

        Observable<String> stringObservable = Observable.just("alex","bob","rob");

        stringObservable.first("Name").subscribe(System.out::println);

        Single.just("alex")
                .subscribe(System.out::println);
    }
}
