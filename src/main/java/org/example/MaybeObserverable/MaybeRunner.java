package org.example.MaybeObserverable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class MaybeRunner {
    public static void main(String[] args) {
        Observable<String> stringObservable = Observable.just("alex","bob","rob");
        Observable<String> stringObservable1= Observable.empty();

        stringObservable.first("Name").subscribe(System.out::println);

        Single.just("alex")
                .subscribe(System.out::println);

        stringObservable.firstElement().subscribe(System.out::println);

        System.out.println("****************************************************************************************");
        stringObservable1.firstElement().subscribe(System.out::println,Throwable::printStackTrace, () -> System.out.println("      <---- Completed execution !!"));


    }
}
