package org.library.features.add_edit_utils;

import org.hibernate.SessionFactory;

/**
 * Interface that enables Service class to save T objects and set SessionFactory object.
 *
 * @param <T> represents a model class
 * @author Barbara Grabowska
 * @version %I%, %G%
 */
public interface AddEditDAO<T> {
    void setSessionFactory(SessionFactory sessionFactory);

    void save(T object);
}
