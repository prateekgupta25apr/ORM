package org.prateekgupta.dao;

import org.prateekgupta.entity.PlanetEntity;

public interface PlanetDAO {
    String save(PlanetEntity entity);
    void getById(int id);
    String update(PlanetEntity entity);
    String delete(int id);
}
