package com.example.repository.impl;

import com.example.Entity.Passenger;
import com.example.repository.inter.PassengerInter;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class PassangerImpl implements PassengerInter {
    @Override
    public List<Passenger> findAll() {
        return null;
    }

    @Override
    public List<Passenger> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Passenger> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Passenger> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Passenger entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Passenger> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Passenger> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Passenger> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Passenger> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Passenger> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Passenger> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Passenger> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Passenger getOne(Integer integer) {
        return null;
    }

    @Override
    public Passenger getById(Integer integer) {
        return null;
    }

    @Override
    public Passenger getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Passenger> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Passenger> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Passenger> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Passenger> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Passenger> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Passenger> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Passenger, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
