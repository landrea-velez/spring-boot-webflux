package com.landreavelez.springboot.webflux.app.models.services;

import com.landreavelez.springboot.webflux.app.models.documents.Categoria;
import com.landreavelez.springboot.webflux.app.models.documents.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProductoServiceImpl implements ProductoService{

	@Override
	public Flux<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Producto> findAllConNombreUpperCase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Producto> findAllConNombreUpperCaseRepeat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Producto> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Producto> save(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> delete(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Categoria> findAllCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Categoria> findCategoriaById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Categoria> saveCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}

}
