package com.vegaasen.status.server.dao.impl;

import org.springframework.stereotype.Repository;

import com.vegaasen.status.server.dao.DummyDAO;
import com.vegaasen.status.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link com.vegaasen.status.server.dao.impl.GenericHibernateDAOImpl} methods
 */
@Repository
public class DummyDAOImpl extends GenericHibernateDAOImpl<DummyEntity, Long> implements DummyDAO {
    
}
