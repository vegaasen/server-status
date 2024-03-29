package com.vegaasen.status.server.dao;

import com.vegaasen.status.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link com.vegaasen.status.server.dao.impl.GenericHibernateDAOImpl} methods
 */
public interface DummyDAO extends GenericDAO<DummyEntity, Long> {
}
