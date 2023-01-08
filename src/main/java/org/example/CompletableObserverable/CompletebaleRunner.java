package org.example.CompletableObserverable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class CompletebaleRunner {
    public static void main(String[] args) {
        Observable<String> stringObservable = Observable.just("alex","bob","rob");
        Observable<String> stringObservable1= Observable.empty();

        stringObservable.first("Name").subscribe(System.out::println);

        Single.just("alex")
                .subscribe(System.out::println);

        stringObservable.firstElement().subscribe(System.out::println);

        System.out.println("****************************************************************************************");
        stringObservable1.firstElement().subscribe(System.out::println,Throwable::printStackTrace, () -> System.out.println("      <---- Completed execution !!"));

        System.out.println("****************************************************************************************");

        Completable completable = Completable.complete();

        completable.subscribe(() -> System.out.println("      <---- Completable :) Completed execution !!"),Throwable::printStackTrace);

        System.out.println("****************************************************************************************");

        Completable.fromRunnable(() -> System.out.println(" %% Running some process %% "))
                .subscribe(() -> System.out.println("      <---- Completable from Runnable :) Completed execution !!"));



    }
}
