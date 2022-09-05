package com.arquitecturajava.lambdas2;

@FunctionalInterface
public interface Filtro<T> {

	boolean filtrar(T tipo);

}
