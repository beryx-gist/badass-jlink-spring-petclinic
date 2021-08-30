open module org.springframework.samples.petclinic {
    requires java.xml.bind;
    requires java.management;
    requires java.transaction;
    requires java.instrument;
    requires java.persistence;
    requires java.sql;
    // requires java.validation;
    requires jdk.unsupported;

    requires cache.api;
    // requires org.hibernate.validator;

    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.tx;
    requires spring.web;
    requires spring.webmvc;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.boot;
    requires spring.boot.autoconfigure;
}
