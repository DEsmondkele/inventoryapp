package com.inventoryapp.productservice;

import com.inventoryapp.productservice.products.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class,args);
    }
@Bean
    public ProductRepository productRepository(){
        return new ProductRepository() {
            @Override
            public List<Product> findAll() {
                return null;
            }

            @Override
            public List<Product> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Product> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Product> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Product> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Product> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Product getOne(Integer integer) {
                return null;
            }

            @Override
            public Product getById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Product> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Product> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Product> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Product> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Product entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Product> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Product> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Product> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Product> boolean exists(Example<S> example) {
                return false;
            }
        };
}
}
