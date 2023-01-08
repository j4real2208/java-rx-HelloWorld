package org.example.ColdObservable;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;

public class ColdRunner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(13);
        Observable<Integer> integerObservable = Observable.fromIterable(list);

        integerObservable.subscribe(System.out::println);

        System.out.println("****************************************************************************************");

        getData(list);
        integerObservable.subscribe(System.out::println);



    }

    private static List<Integer> getData(List<Integer> integerList){
        integerList.add(15);
        return integerList;
    }
}
