package com.wiki.service;

import com.wiki.entity.City;
import com.wiki.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author kevin_orellana
 */
@Service
@Transactional
public class CityService {
    @Autowired
    CityRepository cityRepository;

    /**
     * @param <S>
     * @param entity
     * @return
     * @see org.springframework.data.repository.CrudRepository#save(java.lang.Object)
     */
    public City save(City entity) {
        return cityRepository.save(entity);
    }

    /**
     * @return
     * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
     */
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    /**
     * @param id
     * @return
     * @see org.springframework.data.jpa.repository.JpaRepository#getOne(java.lang.Object)
     */
    public Optional<City> getOne(int id) {
        return cityRepository.findById(id);
    }

    /**
     * @param id
     * @see org.springframework.data.repository.CrudRepository#deleteById(java.lang.Object)
     */
    public void delete(Integer id) {
        cityRepository.deleteById(id);
    }

    public boolean existsById(Integer id) {
        return cityRepository.existsById(id);
    }

    public Optional<City> findByCtyName(String nombre) {
        return cityRepository.findByCtyName(nombre);
    }

    public boolean existsByCtyName(String nombre) {
        return cityRepository.existsByCtyName(nombre);
    }
}
