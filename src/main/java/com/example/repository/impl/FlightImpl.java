package com.example.repository.impl;

import com.example.Entity.Flight;
import com.example.repository.inter.FlightInter;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FlightImpl implements FlightInter {
    @Override
    public List<Flight> findAll() {
        return null;
    }

    @Override
    public List<Flight> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Flight> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Flight> findAllById(Iterable<Integer> integers) {
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
    public void delete(Flight entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Flight> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Flight> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Flight> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Flight> findById(Integer integer) {
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
    public <S extends Flight> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Flight> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Flight> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Flight getOne(Integer integer) {
        return null;
    }

    @Override
    public Flight getById(Integer integer) {
        return null;
    }

    @Override
    public Flight getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Flight> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Flight> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Flight> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Flight> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Flight> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Flight> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Flight, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
